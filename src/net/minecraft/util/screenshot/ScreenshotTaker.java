package net.minecraft.util.screenshot;


import java.nio.IntBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class ScreenshotTaker {
    private static IntBuffer pixelBuffer;
    private static int[] pixelValues;
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static void takeScreenshot() {
        Framebuffer frameBuffer = mc.getFramebuffer();
        int screenshotWidth = mc.displayWidth;
        int screenshotHeight = mc.displayHeight;
        if (OpenGlHelper.isFramebufferEnabled()) {
            screenshotWidth = frameBuffer.framebufferTextureWidth;
            screenshotHeight = frameBuffer.framebufferTextureHeight;
        }
        int targetCapacity = screenshotWidth * screenshotHeight;
        if (pixelBuffer == null || pixelBuffer.capacity() < targetCapacity) {
            pixelBuffer = BufferUtils.createIntBuffer(targetCapacity);
            pixelValues = new int[targetCapacity];
        }
        GL11.glPixelStorei(3333, 1);
        GL11.glPixelStorei(3317, 1);
        pixelBuffer.clear();
        if (OpenGlHelper.isFramebufferEnabled()) {
            GlStateManager.bindTexture(frameBuffer.framebufferTexture);
            GL11.glGetTexImage(3553, 0, 32993, 33639, pixelBuffer);
        } else {
            GL11.glReadPixels(0, 0, screenshotWidth, screenshotHeight, 32993, 33639, pixelBuffer);
        }
        pixelBuffer.get(pixelValues);
        TextureUtil.processPixelValues(pixelValues, screenshotWidth, screenshotHeight);
        int[] pixelCopy = new int[pixelValues.length];
        System.arraycopy(pixelValues, 0, pixelCopy, 0, pixelValues.length);
        ScreenshotSaver.saveScreenshotAsync(screenshotWidth, screenshotHeight, pixelCopy, frameBuffer);
    }
}
