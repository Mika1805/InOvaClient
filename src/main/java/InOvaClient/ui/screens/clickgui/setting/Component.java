package InOvaClient.ui.screens.clickgui.setting;

import InOvaClient.module.settings.Setting;
import InOvaClient.ui.screens.clickgui.ModuleButton;
import net.minecraft.client.util.math.MatrixStack;

import java.awt.*;

public class Component {

    public Setting setting;
    public  ModuleButton parent;
    public int offset;

    public Component(Setting setting, ModuleButton parent, int offset) {
        this.setting = setting;
        this.parent = parent;
        this.offset = offset;

    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {

    }

    public void mouseClicked(double mouseX, double mouseY, int button) {

    }

    public boolean isHovered(double mouseX, double mouseY) {
        return mouseX > parent.parent.x && mouseX < parent.parent.x + parent.parent.width && mouseY > parent.parent.y + parent.offset + parent.offset + offset && mouseY < parent.parent.y + parent.offset + offset+ parent.parent.height;
    }
}