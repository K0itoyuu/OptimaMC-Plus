package net.minecraft.util.screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;

public class ScreenshotSaver
        implements Runnable {
    private int width;
    private int height;
    private String captureTime;
    private int[] pixels;
    private Framebuffer frameBuffer;
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static void saveScreenshotAsync(int width, int height, int[] pixels, Framebuffer frameBuffer) {
        ScreenshotSaver saver = new ScreenshotSaver();
        saver.width = width;
        saver.height = height;
        saver.captureTime = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());
        saver.pixels = pixels;
        saver.frameBuffer = frameBuffer;
        new Thread(saver).start();
    }

    @Override
    public void run() {
        BufferedImage image;
        if (OpenGlHelper.isFramebufferEnabled()) {
            int diff;
            image = new BufferedImage(this.frameBuffer.framebufferWidth, this.frameBuffer.framebufferHeight, 1);
            for (int i = diff = this.frameBuffer.framebufferTextureHeight - this.frameBuffer.framebufferHeight; i < this.frameBuffer.framebufferTextureHeight; ++i) {
                for (int j = 0; j < this.frameBuffer.framebufferWidth; ++j) {
                    int pixel = this.pixels[i * this.frameBuffer.framebufferTextureWidth + j];
                    image.setRGB(j, i - diff, pixel);
                }
            }
        } else {
            image = new BufferedImage(this.width, this.height, 1);
            image.setRGB(0, 0, this.width, this.height, this.pixels, 0, this.width);
        }
        File ssDir = new File("screenshots");
        File ssFile = new File("screenshots", this.captureTime + ".png");
        int iterator = 0;
        while (ssFile.exists()) {
            ssFile = new File("screenshots", this.captureTime + "_" + ++iterator + ".png");
        }
        try {
            ssDir.mkdirs();
            ImageIO.write(image, "png", ssFile);
            IChatComponent ichatcomponent = new ChatComponentText(ssFile.getName());
            ichatcomponent.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_FILE, ssFile.getAbsolutePath()));
            ichatcomponent.getChatStyle().setUnderlined(true);
            mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentTranslation("screenshot.success", ichatcomponent));
        }
        catch (IOException e) {
            e.printStackTrace();
            mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentTranslation("screenshot.failure", e.getMessage()));
        }
    }
}