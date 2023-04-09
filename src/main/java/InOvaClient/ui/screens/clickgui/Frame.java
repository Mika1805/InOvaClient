package InOvaClient.ui.screens.clickgui;

import InOvaClient.module.Mod.Category;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

import java.awt.*;
import java.util.ArrayList;

public class Frame {
    public int x, y, width, height, dragX, dragY;
    public Category category;
    public boolean dragging;
    private List<ModuleButton> buttons;
    protected MinecraftClient mc = MinecraftClient.getInstance();
    public Frame(Category category, int x, int y, int width, int height) {
        this.category = category;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dragging = false;
        buttons = new ArrayList<>();
    }
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        DrawableHelper.fill(matrices, x, y, x + width, y + height, Color.CYAN.getRGB());
        mc.textRenderer.drawWithShadow(matrices, category.name, x + 2, y + 2, -1);

        for (ModuleButton button : )
    }
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (isHovered(mouseX, mouseY) && button == 0) {
            dragging = true;
            dragX = (int) (mouseX - x);
            dragY = (int) (mouseY - y);
        }
    }

    public void  mouseReleased(double mouseX, double mouseY, int button) {
        if (button == 0 && dragging == true) dragging = false;
    }

    public boolean isHovered(double mouseX, double mouseY) {
        return mouseX > x && mouseX < x + width && mouseY > y && mouseY < y + height;
    }

    public void updatePosition(double mouseX, Double mouseY) {
        if (dragging) {
            x = (int) (mouseX - dragX);
            y = (int) (mouseY - dragY);
        }
    }
}
