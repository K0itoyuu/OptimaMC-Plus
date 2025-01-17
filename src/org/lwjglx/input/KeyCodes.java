package org.lwjglx.input;

import org.lwjgl.glfw.GLFW;

import java.awt.event.KeyEvent;

public class KeyCodes {

    public static int glfwToLwjgl(int glfwKeyCode) {
        if (glfwKeyCode > GLFW.GLFW_KEY_LAST) {
            return glfwKeyCode;
        }
        switch (glfwKeyCode) {
            case GLFW.GLFW_KEY_UNKNOWN: return Keyboard.KEY_UNLABELED; // arbitrary mapping to fix text input here
            case GLFW.GLFW_KEY_ESCAPE: return Keyboard.KEY_ESCAPE;
            case GLFW.GLFW_KEY_BACKSPACE: return Keyboard.KEY_BACK;
            case GLFW.GLFW_KEY_TAB: return Keyboard.KEY_TAB;
            case GLFW.GLFW_KEY_ENTER: return Keyboard.KEY_RETURN;
            case GLFW.GLFW_KEY_SPACE: return Keyboard.KEY_SPACE;
            case GLFW.GLFW_KEY_LEFT_CONTROL: return Keyboard.KEY_LCONTROL;
            case GLFW.GLFW_KEY_LEFT_SHIFT: return Keyboard.KEY_LSHIFT;
            case GLFW.GLFW_KEY_LEFT_ALT: return Keyboard.KEY_LMENU;
            case GLFW.GLFW_KEY_LEFT_SUPER: return Keyboard.KEY_LMETA;
            case GLFW.GLFW_KEY_RIGHT_CONTROL: return Keyboard.KEY_RCONTROL;
            case GLFW.GLFW_KEY_RIGHT_SHIFT: return Keyboard.KEY_RSHIFT;
            case GLFW.GLFW_KEY_RIGHT_ALT: return Keyboard.KEY_RMENU;
            case GLFW.GLFW_KEY_RIGHT_SUPER: return Keyboard.KEY_RMETA;
            case GLFW.GLFW_KEY_1: return Keyboard.KEY_1;
            case GLFW.GLFW_KEY_2: return Keyboard.KEY_2;
            case GLFW.GLFW_KEY_3: return Keyboard.KEY_3;
            case GLFW.GLFW_KEY_4: return Keyboard.KEY_4;
            case GLFW.GLFW_KEY_5: return Keyboard.KEY_5;
            case GLFW.GLFW_KEY_6: return Keyboard.KEY_6;
            case GLFW.GLFW_KEY_7: return Keyboard.KEY_7;
            case GLFW.GLFW_KEY_8: return Keyboard.KEY_8;
            case GLFW.GLFW_KEY_9: return Keyboard.KEY_9;
            case GLFW.GLFW_KEY_0: return Keyboard.KEY_0;
            case GLFW.GLFW_KEY_A: return Keyboard.KEY_A;
            case GLFW.GLFW_KEY_B: return Keyboard.KEY_B;
            case GLFW.GLFW_KEY_C: return Keyboard.KEY_C;
            case GLFW.GLFW_KEY_D: return Keyboard.KEY_D;
            case GLFW.GLFW_KEY_E: return Keyboard.KEY_E;
            case GLFW.GLFW_KEY_F: return Keyboard.KEY_F;
            case GLFW.GLFW_KEY_G: return Keyboard.KEY_G;
            case GLFW.GLFW_KEY_H: return Keyboard.KEY_H;
            case GLFW.GLFW_KEY_I: return Keyboard.KEY_I;
            case GLFW.GLFW_KEY_J: return Keyboard.KEY_J;
            case GLFW.GLFW_KEY_K: return Keyboard.KEY_K;
            case GLFW.GLFW_KEY_L: return Keyboard.KEY_L;
            case GLFW.GLFW_KEY_M: return Keyboard.KEY_M;
            case GLFW.GLFW_KEY_N: return Keyboard.KEY_N;
            case GLFW.GLFW_KEY_O: return Keyboard.KEY_O;
            case GLFW.GLFW_KEY_P: return Keyboard.KEY_P;
            case GLFW.GLFW_KEY_Q: return Keyboard.KEY_Q;
            case GLFW.GLFW_KEY_R: return Keyboard.KEY_R;
            case GLFW.GLFW_KEY_S: return Keyboard.KEY_S;
            case GLFW.GLFW_KEY_T: return Keyboard.KEY_T;
            case GLFW.GLFW_KEY_U: return Keyboard.KEY_U;
            case GLFW.GLFW_KEY_V: return Keyboard.KEY_V;
            case GLFW.GLFW_KEY_W: return Keyboard.KEY_W;
            case GLFW.GLFW_KEY_X: return Keyboard.KEY_X;
            case GLFW.GLFW_KEY_Y: return Keyboard.KEY_Y;
            case GLFW.GLFW_KEY_Z: return Keyboard.KEY_Z;
            case GLFW.GLFW_KEY_UP: return Keyboard.KEY_UP;
            case GLFW.GLFW_KEY_DOWN: return Keyboard.KEY_DOWN;
            case GLFW.GLFW_KEY_LEFT: return Keyboard.KEY_LEFT;
            case GLFW.GLFW_KEY_RIGHT: return Keyboard.KEY_RIGHT;
            case GLFW.GLFW_KEY_INSERT: return Keyboard.KEY_INSERT;
            case GLFW.GLFW_KEY_DELETE: return Keyboard.KEY_DELETE;
            case GLFW.GLFW_KEY_HOME: return Keyboard.KEY_HOME;
            case GLFW.GLFW_KEY_END: return Keyboard.KEY_END;
            case GLFW.GLFW_KEY_PAGE_UP: return Keyboard.KEY_PRIOR;
            case GLFW.GLFW_KEY_PAGE_DOWN: return Keyboard.KEY_NEXT;
            case GLFW.GLFW_KEY_F1: return Keyboard.KEY_F1;
            case GLFW.GLFW_KEY_F2: return Keyboard.KEY_F2;
            case GLFW.GLFW_KEY_F3: return Keyboard.KEY_F3;
            case GLFW.GLFW_KEY_F4: return Keyboard.KEY_F4;
            case GLFW.GLFW_KEY_F5: return Keyboard.KEY_F5;
            case GLFW.GLFW_KEY_F6: return Keyboard.KEY_F6;
            case GLFW.GLFW_KEY_F7: return Keyboard.KEY_F7;
            case GLFW.GLFW_KEY_F8: return Keyboard.KEY_F8;
            case GLFW.GLFW_KEY_F9: return Keyboard.KEY_F9;
            case GLFW.GLFW_KEY_F10: return Keyboard.KEY_F10;
            case GLFW.GLFW_KEY_F11: return Keyboard.KEY_F11;
            case GLFW.GLFW_KEY_F12: return Keyboard.KEY_F12;
            case GLFW.GLFW_KEY_F13: return Keyboard.KEY_F13;
            case GLFW.GLFW_KEY_F14: return Keyboard.KEY_F14;
            case GLFW.GLFW_KEY_F15: return Keyboard.KEY_F15;
            case GLFW.GLFW_KEY_F16: return Keyboard.KEY_F16;
            case GLFW.GLFW_KEY_F17: return Keyboard.KEY_F17;
            case GLFW.GLFW_KEY_F18: return Keyboard.KEY_F18;
            case GLFW.GLFW_KEY_F19: return Keyboard.KEY_F19;
            case GLFW.GLFW_KEY_KP_1: return Keyboard.KEY_NUMPAD1;
            case GLFW.GLFW_KEY_KP_2: return Keyboard.KEY_NUMPAD2;
            case GLFW.GLFW_KEY_KP_3: return Keyboard.KEY_NUMPAD3;
            case GLFW.GLFW_KEY_KP_4: return Keyboard.KEY_NUMPAD4;
            case GLFW.GLFW_KEY_KP_5: return Keyboard.KEY_NUMPAD5;
            case GLFW.GLFW_KEY_KP_6: return Keyboard.KEY_NUMPAD6;
            case GLFW.GLFW_KEY_KP_7: return Keyboard.KEY_NUMPAD7;
            case GLFW.GLFW_KEY_KP_8: return Keyboard.KEY_NUMPAD8;
            case GLFW.GLFW_KEY_KP_9: return Keyboard.KEY_NUMPAD9;
            case GLFW.GLFW_KEY_KP_0: return Keyboard.KEY_NUMPAD0;
            case GLFW.GLFW_KEY_KP_ADD: return Keyboard.KEY_ADD;
            case GLFW.GLFW_KEY_KP_SUBTRACT: return Keyboard.KEY_SUBTRACT;
            case GLFW.GLFW_KEY_KP_MULTIPLY: return Keyboard.KEY_MULTIPLY;
            case GLFW.GLFW_KEY_KP_DIVIDE: return Keyboard.KEY_DIVIDE;
            case GLFW.GLFW_KEY_KP_DECIMAL: return Keyboard.KEY_DECIMAL;
            case GLFW.GLFW_KEY_KP_EQUAL: return Keyboard.KEY_NUMPADEQUALS;
            case GLFW.GLFW_KEY_KP_ENTER: return Keyboard.KEY_NUMPADENTER;
            case GLFW.GLFW_KEY_NUM_LOCK: return Keyboard.KEY_NUMLOCK;
            case GLFW.GLFW_KEY_SEMICOLON: return Keyboard.KEY_SEMICOLON;
            case GLFW.GLFW_KEY_BACKSLASH: return Keyboard.KEY_BACKSLASH;
            case GLFW.GLFW_KEY_COMMA: return Keyboard.KEY_COMMA;
            case GLFW.GLFW_KEY_PERIOD: return Keyboard.KEY_PERIOD;
            case GLFW.GLFW_KEY_SLASH: return Keyboard.KEY_SLASH;
            case GLFW.GLFW_KEY_GRAVE_ACCENT: return Keyboard.KEY_GRAVE;
            case GLFW.GLFW_KEY_CAPS_LOCK: return Keyboard.KEY_CAPITAL;
            case GLFW.GLFW_KEY_SCROLL_LOCK: return Keyboard.KEY_SCROLL;
            case GLFW.GLFW_KEY_WORLD_1: return Keyboard.KEY_CIRCUMFLEX; // "World" keys could be anything depending on
                                                                   // keyboard layout, pick something arbitrary
            case GLFW.GLFW_KEY_WORLD_2: return Keyboard.KEY_YEN;
            case GLFW.GLFW_KEY_PAUSE: return Keyboard.KEY_PAUSE;
            case GLFW.GLFW_KEY_MINUS: return Keyboard.KEY_MINUS;
            case GLFW.GLFW_KEY_EQUAL: return Keyboard.KEY_EQUALS;
            case GLFW.GLFW_KEY_LEFT_BRACKET: return Keyboard.KEY_LBRACKET;
            case GLFW.GLFW_KEY_RIGHT_BRACKET: return Keyboard.KEY_RBRACKET;
            case GLFW.GLFW_KEY_APOSTROPHE: return Keyboard.KEY_APOSTROPHE;
            // public static final int KEY_AT = 0x91; /* (NEC PC98) */
            // public static final int KEY_COLON = 0x92; /* (NEC PC98) */
            // public static final int KEY_UNDERLINE = 0x93; /* (NEC PC98) */

            // public static final int KEY_KANA = 0x70; /* (Japanese keyboard) */
            // public static final int KEY_CONVERT = 0x79; /* (Japanese keyboard) */
            // public static final int KEY_NOCONVERT = 0x7B; /* (Japanese keyboard) */
            // public static final int KEY_YEN = 0x7D; /* (Japanese keyboard) */
            // public static final int KEY_CIRCUMFLEX = 0x90; /* (Japanese keyboard) */
            // public static final int KEY_KANJI = 0x94; /* (Japanese keyboard) */
            // public static final int KEY_STOP = 0x95; /* (NEC PC98) */
            // public static final int KEY_AX = 0x96; /* (Japan AX) */
            // public static final int KEY_UNLABELED = 0x97; /* (J3100) */
            // public static final int KEY_SECTION = 0xA7; /* Section symbol (Mac) */
            // public static final int KEY_NUMPADCOMMA = 0xB3; /* , on numeric keypad (NEC PC98) */
            // public static final int KEY_SYSRQ = 0xB7;
            // public static final int KEY_FUNCTION = 0xC4; /* Function (Mac) */
            // public static final int KEY_CLEAR = 0xDA; /* Clear key (Mac) */

            // public static final int KEY_APPS = 0xDD; /* AppMenu key */
            // public static final int KEY_POWER = 0xDE;
            // public static final int KEY_SLEEP = 0xDF;

            default: return Keyboard.KEY_NONE;
        }
    }

    public static int lwjglToGlfw(int lwjglKeyCode) {
        if (lwjglKeyCode > GLFW.GLFW_KEY_LAST) {
            return lwjglKeyCode;
        }

        switch (lwjglKeyCode) {
            case Keyboard.KEY_NONE: return 0;
            case Keyboard.KEY_UNLABELED: return GLFW.GLFW_KEY_UNKNOWN; // arbitrary mapping to fix text input here
            case Keyboard.KEY_ESCAPE: return GLFW.GLFW_KEY_ESCAPE;
            case Keyboard.KEY_BACK: return GLFW.GLFW_KEY_BACKSPACE;
            case Keyboard.KEY_TAB: return GLFW.GLFW_KEY_TAB;
            case Keyboard.KEY_RETURN: return GLFW.GLFW_KEY_ENTER;
            case Keyboard.KEY_SPACE: return GLFW.GLFW_KEY_SPACE;
            case Keyboard.KEY_LCONTROL: return GLFW.GLFW_KEY_LEFT_CONTROL;
            case Keyboard.KEY_LSHIFT: return GLFW.GLFW_KEY_LEFT_SHIFT;
            case Keyboard.KEY_LMENU: return GLFW.GLFW_KEY_LEFT_ALT;
            case Keyboard.KEY_LMETA: return GLFW.GLFW_KEY_LEFT_SUPER;
            case Keyboard.KEY_RCONTROL: return GLFW.GLFW_KEY_RIGHT_CONTROL;
            case Keyboard.KEY_RSHIFT: return GLFW.GLFW_KEY_RIGHT_SHIFT;
            case Keyboard.KEY_RMENU: return GLFW.GLFW_KEY_RIGHT_ALT;
            case Keyboard.KEY_RMETA: return GLFW.GLFW_KEY_RIGHT_SUPER;
            case Keyboard.KEY_1: return GLFW.GLFW_KEY_1;
            case Keyboard.KEY_2: return GLFW.GLFW_KEY_2;
            case Keyboard.KEY_3: return GLFW.GLFW_KEY_3;
            case Keyboard.KEY_4: return GLFW.GLFW_KEY_4;
            case Keyboard.KEY_5: return GLFW.GLFW_KEY_5;
            case Keyboard.KEY_6: return GLFW.GLFW_KEY_6;
            case Keyboard.KEY_7: return GLFW.GLFW_KEY_7;
            case Keyboard.KEY_8: return GLFW.GLFW_KEY_8;
            case Keyboard.KEY_9: return GLFW.GLFW_KEY_9;
            case Keyboard.KEY_0: return GLFW.GLFW_KEY_0;
            case Keyboard.KEY_A: return GLFW.GLFW_KEY_A;
            case Keyboard.KEY_B: return GLFW.GLFW_KEY_B;
            case Keyboard.KEY_C: return GLFW.GLFW_KEY_C;
            case Keyboard.KEY_D: return GLFW.GLFW_KEY_D;
            case Keyboard.KEY_E: return GLFW.GLFW_KEY_E;
            case Keyboard.KEY_F: return GLFW.GLFW_KEY_F;
            case Keyboard.KEY_G: return GLFW.GLFW_KEY_G;
            case Keyboard.KEY_H: return GLFW.GLFW_KEY_H;
            case Keyboard.KEY_I: return GLFW.GLFW_KEY_I;
            case Keyboard.KEY_J: return GLFW.GLFW_KEY_J;
            case Keyboard.KEY_K: return GLFW.GLFW_KEY_K;
            case Keyboard.KEY_L: return GLFW.GLFW_KEY_L;
            case Keyboard.KEY_M: return GLFW.GLFW_KEY_M;
            case Keyboard.KEY_N: return GLFW.GLFW_KEY_N;
            case Keyboard.KEY_O: return GLFW.GLFW_KEY_O;
            case Keyboard.KEY_P: return GLFW.GLFW_KEY_P;
            case Keyboard.KEY_Q: return GLFW.GLFW_KEY_Q;
            case Keyboard.KEY_R: return GLFW.GLFW_KEY_R;
            case Keyboard.KEY_S: return GLFW.GLFW_KEY_S;
            case Keyboard.KEY_T: return GLFW.GLFW_KEY_T;
            case Keyboard.KEY_U: return GLFW.GLFW_KEY_U;
            case Keyboard.KEY_V: return GLFW.GLFW_KEY_V;
            case Keyboard.KEY_W: return GLFW.GLFW_KEY_W;
            case Keyboard.KEY_X: return GLFW.GLFW_KEY_X;
            case Keyboard.KEY_Y: return GLFW.GLFW_KEY_Y;
            case Keyboard.KEY_Z: return GLFW.GLFW_KEY_Z;
            case Keyboard.KEY_UP: return GLFW.GLFW_KEY_UP;
            case Keyboard.KEY_DOWN: return GLFW.GLFW_KEY_DOWN;
            case Keyboard.KEY_LEFT: return GLFW.GLFW_KEY_LEFT;
            case Keyboard.KEY_RIGHT: return GLFW.GLFW_KEY_RIGHT;
            case Keyboard.KEY_INSERT: return GLFW.GLFW_KEY_INSERT;
            case Keyboard.KEY_DELETE: return GLFW.GLFW_KEY_DELETE;
            case Keyboard.KEY_HOME: return GLFW.GLFW_KEY_HOME;
            case Keyboard.KEY_END: return GLFW.GLFW_KEY_END;
            case Keyboard.KEY_PRIOR: return GLFW.GLFW_KEY_PAGE_UP;
            case Keyboard.KEY_NEXT: return GLFW.GLFW_KEY_PAGE_DOWN;
            case Keyboard.KEY_F1: return GLFW.GLFW_KEY_F1;
            case Keyboard.KEY_F2: return GLFW.GLFW_KEY_F2;
            case Keyboard.KEY_F3: return GLFW.GLFW_KEY_F3;
            case Keyboard.KEY_F4: return GLFW.GLFW_KEY_F4;
            case Keyboard.KEY_F5: return GLFW.GLFW_KEY_F5;
            case Keyboard.KEY_F6: return GLFW.GLFW_KEY_F6;
            case Keyboard.KEY_F7: return GLFW.GLFW_KEY_F7;
            case Keyboard.KEY_F8: return GLFW.GLFW_KEY_F8;
            case Keyboard.KEY_F9: return GLFW.GLFW_KEY_F9;
            case Keyboard.KEY_F10: return GLFW.GLFW_KEY_F10;
            case Keyboard.KEY_F11: return GLFW.GLFW_KEY_F11;
            case Keyboard.KEY_F12: return GLFW.GLFW_KEY_F12;
            case Keyboard.KEY_F13: return GLFW.GLFW_KEY_F13;
            case Keyboard.KEY_F14: return GLFW.GLFW_KEY_F14;
            case Keyboard.KEY_F15: return GLFW.GLFW_KEY_F15;
            case Keyboard.KEY_F16: return GLFW.GLFW_KEY_F16;
            case Keyboard.KEY_F17: return GLFW.GLFW_KEY_F17;
            case Keyboard.KEY_F18: return GLFW.GLFW_KEY_F18;
            case Keyboard.KEY_F19: return GLFW.GLFW_KEY_F19;
            case Keyboard.KEY_NUMPAD1: return GLFW.GLFW_KEY_KP_1;
            case Keyboard.KEY_NUMPAD2: return GLFW.GLFW_KEY_KP_2;
            case Keyboard.KEY_NUMPAD3: return GLFW.GLFW_KEY_KP_3;
            case Keyboard.KEY_NUMPAD4: return GLFW.GLFW_KEY_KP_4;
            case Keyboard.KEY_NUMPAD5: return GLFW.GLFW_KEY_KP_5;
            case Keyboard.KEY_NUMPAD6: return GLFW.GLFW_KEY_KP_6;
            case Keyboard.KEY_NUMPAD7: return GLFW.GLFW_KEY_KP_7;
            case Keyboard.KEY_NUMPAD8: return GLFW.GLFW_KEY_KP_8;
            case Keyboard.KEY_NUMPAD9: return GLFW.GLFW_KEY_KP_9;
            case Keyboard.KEY_NUMPAD0: return GLFW.GLFW_KEY_KP_0;
            case Keyboard.KEY_ADD: return GLFW.GLFW_KEY_KP_ADD;
            case Keyboard.KEY_SUBTRACT: return GLFW.GLFW_KEY_KP_SUBTRACT;
            case Keyboard.KEY_MULTIPLY: return GLFW.GLFW_KEY_KP_MULTIPLY;
            case Keyboard.KEY_DIVIDE: return GLFW.GLFW_KEY_KP_DIVIDE;
            case Keyboard.KEY_DECIMAL: return GLFW.GLFW_KEY_KP_DECIMAL;
            case Keyboard.KEY_NUMPADEQUALS: return GLFW.GLFW_KEY_KP_EQUAL;
            case Keyboard.KEY_NUMPADENTER: return GLFW.GLFW_KEY_KP_ENTER;
            case Keyboard.KEY_NUMLOCK: return GLFW.GLFW_KEY_NUM_LOCK;
            case Keyboard.KEY_SEMICOLON: return GLFW.GLFW_KEY_SEMICOLON;
            case Keyboard.KEY_BACKSLASH: return GLFW.GLFW_KEY_BACKSLASH;
            case Keyboard.KEY_COMMA: return GLFW.GLFW_KEY_COMMA;
            case Keyboard.KEY_PERIOD: return GLFW.GLFW_KEY_PERIOD;
            case Keyboard.KEY_SLASH: return GLFW.GLFW_KEY_SLASH;
            case Keyboard.KEY_GRAVE: return GLFW.GLFW_KEY_GRAVE_ACCENT;
            case Keyboard.KEY_CAPITAL: return GLFW.GLFW_KEY_CAPS_LOCK;
            case Keyboard.KEY_SCROLL: return GLFW.GLFW_KEY_SCROLL_LOCK;
            case Keyboard.KEY_PAUSE: return GLFW.GLFW_KEY_PAUSE;
            case Keyboard.KEY_CIRCUMFLEX: return GLFW.GLFW_KEY_WORLD_1; // "World" keys could be anything depending on
                                                                   // keyboard layout, pick something arbitrary
            case Keyboard.KEY_YEN: return GLFW.GLFW_KEY_WORLD_2;

            case Keyboard.KEY_MINUS: return GLFW.GLFW_KEY_MINUS;
            case Keyboard.KEY_EQUALS: return GLFW.GLFW_KEY_EQUAL;
            case Keyboard.KEY_LBRACKET: return GLFW.GLFW_KEY_LEFT_BRACKET;
            case Keyboard.KEY_RBRACKET: return GLFW.GLFW_KEY_RIGHT_BRACKET;
            case Keyboard.KEY_APOSTROPHE: return GLFW.GLFW_KEY_APOSTROPHE;

            // public static final int KEY_AT = 0x91; /* (NEC PC98) */
            // public static final int KEY_COLON = 0x92; /* (NEC PC98) */
            // public static final int KEY_UNDERLINE = 0x93; /* (NEC PC98) */

            // public static final int KEY_KANA = 0x70; /* (Japanese keyboard) */
            // public static final int KEY_CONVERT = 0x79; /* (Japanese keyboard) */
            // public static final int KEY_NOCONVERT = 0x7B; /* (Japanese keyboard) */
            // public static final int KEY_YEN = 0x7D; /* (Japanese keyboard) */

            // public static final int KEY_CIRCUMFLEX = 0x90; /* (Japanese keyboard) */
            // public static final int KEY_KANJI = 0x94; /* (Japanese keyboard) */
            // public static final int KEY_STOP = 0x95; /* (NEC PC98) */
            // public static final int KEY_AX = 0x96; /* (Japan AX) */
            // public static final int KEY_UNLABELED = 0x97; /* (J3100) */
            // public static final int KEY_SECTION = 0xA7; /* Section symbol (Mac) */
            // public static final int KEY_NUMPADCOMMA = 0xB3; /* , on numeric keypad (NEC PC98) */
            // public static final int KEY_SYSRQ = 0xB7;
            // public static final int KEY_FUNCTION = 0xC4; /* Function (Mac) */

            // public static final int KEY_CLEAR = 0xDA; /* Clear key (Mac) */

            // public static final int KEY_APPS = 0xDD; /* AppMenu key */
            // public static final int KEY_POWER = 0xDE;
            // public static final int KEY_SLEEP = 0xDF;

            default: return GLFW.GLFW_KEY_UNKNOWN;
        }
    }

    public static int awtToLwjgl(int awtCode) {
        switch (awtCode) {
            case KeyEvent.VK_ESCAPE: return Keyboard.KEY_ESCAPE;
            case KeyEvent.VK_1: return Keyboard.KEY_1;
            case KeyEvent.VK_2: return Keyboard.KEY_2;
            case KeyEvent.VK_3: return Keyboard.KEY_3;
            case KeyEvent.VK_4: return Keyboard.KEY_4;
            case KeyEvent.VK_5: return Keyboard.KEY_5;
            case KeyEvent.VK_6: return Keyboard.KEY_6;
            case KeyEvent.VK_7: return Keyboard.KEY_7;
            case KeyEvent.VK_8: return Keyboard.KEY_8;
            case KeyEvent.VK_9: return Keyboard.KEY_9;
            case KeyEvent.VK_0: return Keyboard.KEY_0;
            case KeyEvent.VK_MINUS: return Keyboard.KEY_MINUS;
            case KeyEvent.VK_EQUALS: return Keyboard.KEY_EQUALS;
            case KeyEvent.VK_BACK_SPACE: return Keyboard.KEY_BACK;
            case KeyEvent.VK_TAB: return Keyboard.KEY_TAB;
            case KeyEvent.VK_Q: return Keyboard.KEY_Q;
            case KeyEvent.VK_W: return Keyboard.KEY_W;
            case KeyEvent.VK_E: return Keyboard.KEY_E;
            case KeyEvent.VK_R: return Keyboard.KEY_R;
            case KeyEvent.VK_T: return Keyboard.KEY_T;
            case KeyEvent.VK_Y: return Keyboard.KEY_Y;
            case KeyEvent.VK_U: return Keyboard.KEY_U;
            case KeyEvent.VK_I: return Keyboard.KEY_I;
            case KeyEvent.VK_O: return Keyboard.KEY_O;
            case KeyEvent.VK_P: return Keyboard.KEY_P;
            case KeyEvent.VK_OPEN_BRACKET: return Keyboard.KEY_LBRACKET;
            case KeyEvent.VK_CLOSE_BRACKET: return Keyboard.KEY_RBRACKET;
            case KeyEvent.VK_ENTER: return Keyboard.KEY_RETURN;
            case KeyEvent.VK_CONTROL: return Keyboard.KEY_LCONTROL;
            case KeyEvent.VK_A: return Keyboard.KEY_A;
            case KeyEvent.VK_S: return Keyboard.KEY_S;
            case KeyEvent.VK_D: return Keyboard.KEY_D;
            case KeyEvent.VK_F: return Keyboard.KEY_F;
            case KeyEvent.VK_G: return Keyboard.KEY_G;
            case KeyEvent.VK_H: return Keyboard.KEY_H;
            case KeyEvent.VK_J: return Keyboard.KEY_J;
            case KeyEvent.VK_K: return Keyboard.KEY_K;
            case KeyEvent.VK_L: return Keyboard.KEY_L;
            case KeyEvent.VK_SEMICOLON: return Keyboard.KEY_SEMICOLON;
            case KeyEvent.VK_QUOTE: return Keyboard.KEY_APOSTROPHE;
            case KeyEvent.VK_DEAD_GRAVE: return Keyboard.KEY_GRAVE;
            case KeyEvent.VK_SHIFT: return Keyboard.KEY_LSHIFT;
            case KeyEvent.VK_BACK_SLASH: return Keyboard.KEY_BACKSLASH;
            case KeyEvent.VK_Z: return Keyboard.KEY_Z;
            case KeyEvent.VK_X: return Keyboard.KEY_X;
            case KeyEvent.VK_C: return Keyboard.KEY_C;
            case KeyEvent.VK_V: return Keyboard.KEY_V;
            case KeyEvent.VK_B: return Keyboard.KEY_B;
            case KeyEvent.VK_N: return Keyboard.KEY_N;
            case KeyEvent.VK_M: return Keyboard.KEY_M;
            case KeyEvent.VK_COMMA: return Keyboard.KEY_COMMA;
            case KeyEvent.VK_PERIOD: return Keyboard.KEY_PERIOD;
            case KeyEvent.VK_SLASH: return Keyboard.KEY_SLASH;
            case KeyEvent.VK_MULTIPLY: return Keyboard.KEY_MULTIPLY;
            case KeyEvent.VK_ALT: return Keyboard.KEY_LMENU;
            case KeyEvent.VK_SPACE: return Keyboard.KEY_SPACE;
            case KeyEvent.VK_CAPS_LOCK: return Keyboard.KEY_CAPITAL;
            case KeyEvent.VK_F1: return Keyboard.KEY_F1;
            case KeyEvent.VK_F2: return Keyboard.KEY_F2;
            case KeyEvent.VK_F3: return Keyboard.KEY_F3;
            case KeyEvent.VK_F4: return Keyboard.KEY_F4;
            case KeyEvent.VK_F5: return Keyboard.KEY_F5;
            case KeyEvent.VK_F6: return Keyboard.KEY_F6;
            case KeyEvent.VK_F7: return Keyboard.KEY_F7;
            case KeyEvent.VK_F8: return Keyboard.KEY_F8;
            case KeyEvent.VK_F9: return Keyboard.KEY_F9;
            case KeyEvent.VK_F10: return Keyboard.KEY_F10;
            case KeyEvent.VK_NUM_LOCK: return Keyboard.KEY_NUMLOCK;
            case KeyEvent.VK_SCROLL_LOCK: return Keyboard.KEY_SCROLL;
            case KeyEvent.VK_NUMPAD7: return Keyboard.KEY_NUMPAD7;
            case KeyEvent.VK_NUMPAD8: return Keyboard.KEY_NUMPAD8;
            case KeyEvent.VK_NUMPAD9: return Keyboard.KEY_NUMPAD9;
            case KeyEvent.VK_SUBTRACT: return Keyboard.KEY_SUBTRACT;
            case KeyEvent.VK_NUMPAD4: return Keyboard.KEY_NUMPAD4;
            case KeyEvent.VK_NUMPAD5: return Keyboard.KEY_NUMPAD5;
            case KeyEvent.VK_NUMPAD6: return Keyboard.KEY_NUMPAD6;
            case KeyEvent.VK_ADD: return Keyboard.KEY_ADD;
            case KeyEvent.VK_NUMPAD1: return Keyboard.KEY_NUMPAD1;
            case KeyEvent.VK_NUMPAD2: return Keyboard.KEY_NUMPAD2;
            case KeyEvent.VK_NUMPAD3: return Keyboard.KEY_NUMPAD3;
            case KeyEvent.VK_NUMPAD0: return Keyboard.KEY_NUMPAD0;
            case KeyEvent.VK_DECIMAL: return Keyboard.KEY_DECIMAL;
            case KeyEvent.VK_F11: return Keyboard.KEY_F11;
            case KeyEvent.VK_F12: return Keyboard.KEY_F12;
            case KeyEvent.VK_F13: return Keyboard.KEY_F13;
            case KeyEvent.VK_F14: return Keyboard.KEY_F14;
            case KeyEvent.VK_F15: return Keyboard.KEY_F15;
            case KeyEvent.VK_KANA: return Keyboard.KEY_KANA;
            case KeyEvent.VK_CONVERT: return Keyboard.KEY_CONVERT;
            case KeyEvent.VK_NONCONVERT: return Keyboard.KEY_NOCONVERT;
            case KeyEvent.VK_CIRCUMFLEX: return Keyboard.KEY_CIRCUMFLEX;
            case KeyEvent.VK_AT: return Keyboard.KEY_AT;
            case KeyEvent.VK_COLON: return Keyboard.KEY_COLON;
            case KeyEvent.VK_UNDERSCORE: return Keyboard.KEY_UNDERLINE;
            case KeyEvent.VK_KANJI: return Keyboard.KEY_KANJI;
            case KeyEvent.VK_STOP: return Keyboard.KEY_STOP;
            case KeyEvent.VK_DIVIDE: return Keyboard.KEY_DIVIDE;
            case KeyEvent.VK_PAUSE: return Keyboard.KEY_PAUSE;
            case KeyEvent.VK_HOME: return Keyboard.KEY_HOME;
            case KeyEvent.VK_UP: return Keyboard.KEY_UP;
            case KeyEvent.VK_PAGE_UP: return Keyboard.KEY_PRIOR;
            case KeyEvent.VK_LEFT: return Keyboard.KEY_LEFT;
            case KeyEvent.VK_RIGHT: return Keyboard.KEY_RIGHT;
            case KeyEvent.VK_END: return Keyboard.KEY_END;
            case KeyEvent.VK_DOWN: return Keyboard.KEY_DOWN;
            case KeyEvent.VK_PAGE_DOWN: return Keyboard.KEY_NEXT;
            case KeyEvent.VK_INSERT: return Keyboard.KEY_INSERT;
            case KeyEvent.VK_DELETE: return Keyboard.KEY_DELETE;
            case KeyEvent.VK_META: return Keyboard.KEY_LWIN;
            default: return Keyboard.KEY_NONE;
        }
    }

    public static int lwjglToAwt(int lwjglCode) {
        switch (lwjglCode) {
            case Keyboard.KEY_ESCAPE: return KeyEvent.VK_ESCAPE;
            case Keyboard.KEY_1: return KeyEvent.VK_1;
            case Keyboard.KEY_2: return KeyEvent.VK_2;
            case Keyboard.KEY_3: return KeyEvent.VK_3;
            case Keyboard.KEY_4: return KeyEvent.VK_4;
            case Keyboard.KEY_5: return KeyEvent.VK_5;
            case Keyboard.KEY_6: return KeyEvent.VK_6;
            case Keyboard.KEY_7: return KeyEvent.VK_7;
            case Keyboard.KEY_8: return KeyEvent.VK_8;
            case Keyboard.KEY_9: return KeyEvent.VK_9;
            case Keyboard.KEY_0: return KeyEvent.VK_0;
            case Keyboard.KEY_MINUS: return KeyEvent.VK_MINUS;
            case Keyboard.KEY_EQUALS: return KeyEvent.VK_EQUALS;
            case Keyboard.KEY_BACK: return KeyEvent.VK_BACK_SPACE;
            case Keyboard.KEY_TAB: return KeyEvent.VK_TAB;
            case Keyboard.KEY_Q: return KeyEvent.VK_Q;
            case Keyboard.KEY_W: return KeyEvent.VK_W;
            case Keyboard.KEY_E: return KeyEvent.VK_E;
            case Keyboard.KEY_R: return KeyEvent.VK_R;
            case Keyboard.KEY_T: return KeyEvent.VK_T;
            case Keyboard.KEY_Y: return KeyEvent.VK_Y;
            case Keyboard.KEY_U: return KeyEvent.VK_U;
            case Keyboard.KEY_I: return KeyEvent.VK_I;
            case Keyboard.KEY_O: return KeyEvent.VK_O;
            case Keyboard.KEY_P: return KeyEvent.VK_P;
            case Keyboard.KEY_LBRACKET: return KeyEvent.VK_OPEN_BRACKET;
            case Keyboard.KEY_RBRACKET: return KeyEvent.VK_CLOSE_BRACKET;
            case Keyboard.KEY_RETURN: return KeyEvent.VK_ENTER;
            case Keyboard.KEY_LCONTROL: return KeyEvent.VK_CONTROL;
            case Keyboard.KEY_A: return KeyEvent.VK_A;
            case Keyboard.KEY_S: return KeyEvent.VK_S;
            case Keyboard.KEY_D: return KeyEvent.VK_D;
            case Keyboard.KEY_F: return KeyEvent.VK_F;
            case Keyboard.KEY_G: return KeyEvent.VK_G;
            case Keyboard.KEY_H: return KeyEvent.VK_H;
            case Keyboard.KEY_J: return KeyEvent.VK_J;
            case Keyboard.KEY_K: return KeyEvent.VK_K;
            case Keyboard.KEY_L: return KeyEvent.VK_L;
            case Keyboard.KEY_SEMICOLON: return KeyEvent.VK_SEMICOLON;
            case Keyboard.KEY_APOSTROPHE: return KeyEvent.VK_QUOTE;
            case Keyboard.KEY_GRAVE: return KeyEvent.VK_DEAD_GRAVE;
            case Keyboard.KEY_LSHIFT: return KeyEvent.VK_SHIFT;
            case Keyboard.KEY_BACKSLASH: return KeyEvent.VK_BACK_SLASH;
            case Keyboard.KEY_Z: return KeyEvent.VK_Z;
            case Keyboard.KEY_X: return KeyEvent.VK_X;
            case Keyboard.KEY_C: return KeyEvent.VK_C;
            case Keyboard.KEY_V: return KeyEvent.VK_V;
            case Keyboard.KEY_B: return KeyEvent.VK_B;
            case Keyboard.KEY_N: return KeyEvent.VK_N;
            case Keyboard.KEY_M: return KeyEvent.VK_M;
            case Keyboard.KEY_COMMA: return KeyEvent.VK_COMMA;
            case Keyboard.KEY_PERIOD: return KeyEvent.VK_PERIOD;
            case Keyboard.KEY_SLASH: return KeyEvent.VK_SLASH;
            case Keyboard.KEY_MULTIPLY: return KeyEvent.VK_MULTIPLY;
            case Keyboard.KEY_LMENU: return KeyEvent.VK_ALT;
            case Keyboard.KEY_SPACE: return KeyEvent.VK_SPACE;
            case Keyboard.KEY_CAPITAL: return KeyEvent.VK_CAPS_LOCK;
            case Keyboard.KEY_F1: return KeyEvent.VK_F1;
            case Keyboard.KEY_F2: return KeyEvent.VK_F2;
            case Keyboard.KEY_F3: return KeyEvent.VK_F3;
            case Keyboard.KEY_F4: return KeyEvent.VK_F4;
            case Keyboard.KEY_F5: return KeyEvent.VK_F5;
            case Keyboard.KEY_F6: return KeyEvent.VK_F6;
            case Keyboard.KEY_F7: return KeyEvent.VK_F7;
            case Keyboard.KEY_F8: return KeyEvent.VK_F8;
            case Keyboard.KEY_F9: return KeyEvent.VK_F9;
            case Keyboard.KEY_F10: return KeyEvent.VK_F10;
            case Keyboard.KEY_NUMLOCK: return KeyEvent.VK_NUM_LOCK;
            case Keyboard.KEY_SCROLL: return KeyEvent.VK_SCROLL_LOCK;
            case Keyboard.KEY_NUMPAD7: return KeyEvent.VK_NUMPAD7;
            case Keyboard.KEY_NUMPAD8: return KeyEvent.VK_NUMPAD8;
            case Keyboard.KEY_NUMPAD9: return KeyEvent.VK_NUMPAD9;
            case Keyboard.KEY_SUBTRACT: return KeyEvent.VK_SUBTRACT;
            case Keyboard.KEY_NUMPAD4: return KeyEvent.VK_NUMPAD4;
            case Keyboard.KEY_NUMPAD5: return KeyEvent.VK_NUMPAD5;
            case Keyboard.KEY_NUMPAD6: return KeyEvent.VK_NUMPAD6;
            case Keyboard.KEY_ADD: return KeyEvent.VK_ADD;
            case Keyboard.KEY_NUMPAD1: return KeyEvent.VK_NUMPAD1;
            case Keyboard.KEY_NUMPAD2: return KeyEvent.VK_NUMPAD2;
            case Keyboard.KEY_NUMPAD3: return KeyEvent.VK_NUMPAD3;
            case Keyboard.KEY_NUMPAD0: return KeyEvent.VK_NUMPAD0;
            case Keyboard.KEY_DECIMAL: return KeyEvent.VK_DECIMAL;
            case Keyboard.KEY_F11: return KeyEvent.VK_F11;
            case Keyboard.KEY_F12: return KeyEvent.VK_F12;
            case Keyboard.KEY_F13: return KeyEvent.VK_F13;
            case Keyboard.KEY_F14: return KeyEvent.VK_F14;
            case Keyboard.KEY_F15: return KeyEvent.VK_F15;
            case Keyboard.KEY_KANA: return KeyEvent.VK_KANA;
            case Keyboard.KEY_CONVERT: return KeyEvent.VK_CONVERT;
            case Keyboard.KEY_NOCONVERT: return KeyEvent.VK_NONCONVERT;
            case Keyboard.KEY_CIRCUMFLEX: return KeyEvent.VK_CIRCUMFLEX;
            case Keyboard.KEY_AT: return KeyEvent.VK_AT;
            case Keyboard.KEY_COLON: return KeyEvent.VK_COLON;
            case Keyboard.KEY_UNDERLINE: return KeyEvent.VK_UNDERSCORE;
            case Keyboard.KEY_KANJI: return KeyEvent.VK_KANJI;
            case Keyboard.KEY_STOP: return KeyEvent.VK_STOP;
            case Keyboard.KEY_DIVIDE: return KeyEvent.VK_DIVIDE;
            case Keyboard.KEY_PAUSE: return KeyEvent.VK_PAUSE;
            case Keyboard.KEY_HOME: return KeyEvent.VK_HOME;
            case Keyboard.KEY_UP: return KeyEvent.VK_UP;
            case Keyboard.KEY_PRIOR: return KeyEvent.VK_PAGE_UP;
            case Keyboard.KEY_LEFT: return KeyEvent.VK_LEFT;
            case Keyboard.KEY_RIGHT: return KeyEvent.VK_RIGHT;
            case Keyboard.KEY_END: return KeyEvent.VK_END;
            case Keyboard.KEY_DOWN: return KeyEvent.VK_DOWN;
            case Keyboard.KEY_NEXT: return KeyEvent.VK_PAGE_DOWN;
            case Keyboard.KEY_INSERT: return KeyEvent.VK_INSERT;
            case Keyboard.KEY_DELETE: return KeyEvent.VK_DELETE;
            case Keyboard.KEY_LWIN: return KeyEvent.VK_META;
            default: return Keyboard.KEY_NONE;
        }
    }
}
