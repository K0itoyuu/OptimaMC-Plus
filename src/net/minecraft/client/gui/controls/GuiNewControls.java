package net.minecraft.client.gui.controls;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.controls.SearchType;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.function.Predicate;

public class GuiNewControls extends GuiControls {
    private static final GameSettings.Options[] OPTIONS_ARR = new GameSettings.Options[]{
        GameSettings.Options.INVERT_MOUSE,
        GameSettings.Options.SENSITIVITY,
        GameSettings.Options.TOUCHSCREEN
    };

    private final GuiScreen parentScreen;
    private final GameSettings options;
    private GuiButton buttonReset;
    private String lastSearch;
    private GuiTextField search;

    private DisplayMode displayMode;
    private SearchType searchType;
    private SortOrder sortOrder;

    private GuiButton showButton;
    //private GuiCheckBox buttonKey;
    //private GuiCheckBox buttonCat;
    private GuiButton patreonButton;
    private GuiButton sortOrderButton;
    private boolean confirmingReset = false;

    public GuiNewControls(GuiScreen screen, GameSettings settings) {
        super(screen, settings);
        this.parentScreen = screen;
        this.options = settings;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question. Called when the GUI is displayed and when the
     * window resizes, the buttonList is cleared beforehand.
     */
    @Override
    public void initGui() {
        this.screenTitle = I18n.format("controls.title");
        int i = 0;

        for (GameSettings.Options gameOption : OPTIONS_ARR) {
            if (gameOption.getEnumFloat()) {
                this.buttonList.add(new GuiOptionSlider(
                    gameOption.returnEnumOrdinal(),
                    this.width / 2 - 155 + i % 2 * 160,
                    18 + 24 * (i >> 1),
                    gameOption
                ));
            } else {
                this.buttonList.add(new GuiOptionButton(
                    gameOption.returnEnumOrdinal(),
                    this.width / 2 - 155 + i % 2 * 160,
                    18 + 24 * (i >> 1),
                    gameOption,
                    this.options.getKeyBinding(gameOption)
                ));
            }
            ++i;
        }

        this.keyBindingList = new GuiNewKeyBindingList(this, this.mc);

        this.buttonList.add(new GuiButton(
            1001,
            this.width / 2 - 155 + 160,
            this.height - 29,
            150,
            20,
            I18n.format("gui.done")
        ));

        this.buttonReset = new GuiButton(
            1002,
            this.width / 2 - 155,
            this.height - 29,
            150,
            20,
            I18n.format("controls.resetAll")
        );
        this.buttonList.add(this.buttonReset);

        this.showButton = new GuiButton(
            1003,
            this.width / 2 - 155 + 160,
            this.height - 29 - 24,
            150,
            20,
            I18n.format("options.show") + ": " + I18n.format("options.show.all")
        );
        this.buttonList.add(this.showButton);

        this.search = new GuiTextField(0, fontRendererObj, this.width / 2 - 154, this.height - 29 - 23, 148, 18);
        search.setCanLoseFocus(true);

        this.buttonList.add(new GuiButton(
                1007,
                this.width / 2 - (155 / 2) - 20,
                this.height - 27 - 50,
                150/2 + 18,
                20,
                I18n.format("options.search.name")
        ));

        this.sortOrderButton = new GuiButton(
            1008,
            this.width / 2 - 155 + 160,
            this.height - 29 - 24 - 24,
            150,
            20,
            I18n.format("options.sort") + ": " + I18n.format("options.sort.none")
        );
        this.buttonList.add(this.sortOrderButton);
        this.sortOrder = SortOrder.NONE;
        this.lastSearch = "";
        this.displayMode = DisplayMode.ALL;
        this.searchType = SearchType.NAME;
    }

    @Override
    public void updateScreen() {
        this.search.updateCursorCounter();
        if (!lastSearch.equals(search.getText())) {
            filterKeys();
        }
    }

    public void filterKeys() {
        lastSearch = search.getText();
        if (lastSearch.isEmpty() && displayMode == DisplayMode.ALL && sortOrder == SortOrder.NONE && searchType != SearchType.NAME) {
            return;
        }

        this.keyBindingList.scrollBy(-this.keyBindingList.getAmountScrolled());
        Predicate<GuiNewKeyBindingList.KeyEntry> filters = displayMode.getPredicate();

        switch (searchType) {
            case NAME:
                filters = filters.and(keyEntry -> keyEntry.getKeyDesc()
                    .toLowerCase()
                    .contains(lastSearch.toLowerCase()));
                break;
            case CATEGORY:
                filters = filters.and(keyEntry -> I18n.format(keyEntry.getKeybinding().getKeyCategory())
                    .toLowerCase()
                    .contains(lastSearch.toLowerCase()));
                break;
            case KEY:
                filters = filters.and(keyEntry -> GameSettings.getKeyDisplayString(keyEntry.getKeybinding()
                                                                                       .getKeyCode())
                    .toLowerCase()
                    .contains(lastSearch.toLowerCase()));
                break;
        }

        LinkedList<GuiListExtended.IGuiListEntry> workingList = new LinkedList<>();

        for (GuiListExtended.IGuiListEntry entry : ((GuiNewKeyBindingList) keyBindingList).getAllEntries()) {
            if (searchType == SearchType.CATEGORY && sortOrder == SortOrder.NONE && displayMode == DisplayMode.ALL) {
                if (entry instanceof GuiNewKeyBindingList.KeyEntry) {
                    GuiNewKeyBindingList.KeyEntry keyEntry = (GuiNewKeyBindingList.KeyEntry) entry;
                    if (filters.test(keyEntry)) {
                        workingList.add(entry);
                    }
                } else {
                    workingList.add(entry);
                }
            } else {
                if (entry instanceof GuiNewKeyBindingList.KeyEntry) {
                    GuiNewKeyBindingList.KeyEntry keyEntry = (GuiNewKeyBindingList.KeyEntry) entry;
                    if (filters.test(keyEntry)) {
                        workingList.add(entry);
                    }
                }
            }
        }

        if (searchType == SearchType.CATEGORY && sortOrder == SortOrder.NONE && displayMode == DisplayMode.ALL) {
            Set<GuiNewKeyBindingList.CategoryEntry> categories = new LinkedHashSet<>();

            for (GuiListExtended.IGuiListEntry entry : workingList) {
                if (entry instanceof GuiNewKeyBindingList.CategoryEntry) {
                    GuiNewKeyBindingList.CategoryEntry categoryEntry = (GuiNewKeyBindingList.CategoryEntry) entry;
                    categories.add(categoryEntry);
                    for (GuiListExtended.IGuiListEntry child : workingList) {
                        if (child instanceof GuiNewKeyBindingList.KeyEntry) {
                            GuiNewKeyBindingList.KeyEntry childEntry = (GuiNewKeyBindingList.KeyEntry) child;
                            if (childEntry.getKeybinding().getKeyCategory().equals(categoryEntry.getName())) {
                                categories.remove(categoryEntry);
                            }
                        }
                    }
                }
            }

            workingList.removeAll(categories);
        }
        sortOrder.sort(workingList);
        ((GuiNewKeyBindingList) keyBindingList).setListEntries(workingList);
    }

    /**
     * Draws the screen and all the components in it.
     */
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        this.keyBindingList.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRendererObj, this.screenTitle, this.width / 2, 6, 16777215);
        boolean flag = false;

        for (KeyBinding keybinding : this.options.keyBindings) {
            if (keybinding.getKeyCode() != keybinding.getKeyCodeDefault()) {
                flag = true;
                break;
            }
        }

        search.drawTextBox();
        this.buttonReset.enabled = flag;

        if (!flag) {
            confirmingReset = false;
            buttonReset.displayString = I18n.format("controls.resetAll");
        }

        for (GuiButton guiButton : this.buttonList) {
            guiButton.drawButton(mc, mouseX, mouseY);
        }

        String text = I18n.format("options.search");
        drawCenteredString(
            fontRendererObj,
            text,
            this.width / 2 - (155 / 2) - (fontRendererObj.getStringWidth(text)),
            this.height - 29 - 42,
            16777215
        );
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id < 100 && button instanceof GuiOptionButton) {
            this.options.setOptionValue(((GuiOptionButton) button).returnEnumOptions(), 1);
            button.displayString = this.options.getKeyBinding(GameSettings.Options.getEnumOptions(button.id));
        } else if (button.id == 1001) {
            mc.displayGuiScreen(this.parentScreen);
        } else if (button.id == 1002) {
            if (!confirmingReset) {
                confirmingReset = true;
                button.displayString = I18n.format("options.confirmReset");
                return;
            }

            confirmingReset = false;
            button.displayString = I18n.format("controls.resetAll");

            for (KeyBinding keyBinding : mc.gameSettings.keyBindings) {
                keyBinding.setKeyCode(keyBinding.getKeyCodeDefault());
            }
            KeyBinding.resetKeyBindingArrayAndHash();
        } else if (button.id == 1003) {
            displayMode = displayMode.cycle();
            button.displayString = I18n.format("options.show") + ": " + I18n.format(displayMode.getName());
            filterKeys();
        } else if (button.id == 1007) {
            searchType = searchType.cycle();
            button.displayString = I18n.format(searchType.getName());
            filterKeys();
        } else if (button.id == 1008) {
            sortOrder = sortOrder.cycle();
            button.displayString = I18n.format("options.sort") + ": " + sortOrder.getName();
            filterKeys();
        }
    }

    @Override
    public void mouseClicked(int mx, int my, int mb) throws IOException {
        if (this.buttonId != null) {
            this.options.setOptionKeyBinding(this.buttonId, -100 + mb);
            this.buttonId = null;
            KeyBinding.resetKeyBindingArrayAndHash();
            search.setFocused(false);
        } else if (mb == 0 && !this.keyBindingList.mouseClicked(mx, my, mb)) {
            superSuperMouseClicked(mx, my, mb);
        }

        search.mouseClicked(mx, my, mb);
        if (search.isFocused() && mb == 1) {
            search.setText("");
        }
    }

    protected void superSuperMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        if (mouseButton == 0) {
            for (int i = 0; i < this.buttonList.size(); ++i) {
                GuiButton guibutton = this.buttonList.get(i);

                if (guibutton.mousePressed(this.mc, mouseX, mouseY)) {
                    this.selectedButton = guibutton;
                    guibutton.playPressSound(this.mc.getSoundHandler());
                    this.actionPerformed(guibutton);
                }
            }
        }
    }

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {
        if (state != 0 || !this.keyBindingList.mouseReleased(mouseX, mouseY, state)) {
            superSuperMouseReleased(mouseX, mouseY, state);
        }
    }

    protected void superSuperMouseReleased(int mouseX, int mouseY, int state) {
        if (this.selectedButton != null && state == 0) {
            this.selectedButton.mouseReleased(mouseX, mouseY);
            this.selectedButton = null;
        }
    }

    @Override
    public void keyTyped(char typedChar, int keyCode) {
        if (this.buttonId != null) {
            if (keyCode == 1) {
                this.options.setOptionKeyBinding(this.buttonId, 0);
            } else if (keyCode != 0) {
                this.options.setOptionKeyBinding(this.buttonId, keyCode);
            } else if (typedChar > 0) {
                this.options.setOptionKeyBinding(this.buttonId, typedChar + 256);
            }

            this.buttonId = null;
            this.time = Minecraft.getSystemTime();
            KeyBinding.resetKeyBindingArrayAndHash();
        } else {
            if (search.isFocused())
                search.textboxKeyTyped(typedChar, keyCode);
            else {
                superSuperKeyTyped(typedChar, keyCode);
            }
        }
    }

    protected void superSuperKeyTyped(char typedChar, int keyCode) {
        if (keyCode == 1) {
            this.mc.displayGuiScreen(null);

            if (this.mc.currentScreen == null) {
                this.mc.setIngameFocus();
            }
        }
    }
}
