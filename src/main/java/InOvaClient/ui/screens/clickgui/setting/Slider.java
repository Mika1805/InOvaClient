package InOvaClient.ui.screens.clickgui.setting;

import InOvaClient.module.settings.NumberSetting;
import InOvaClient.module.settings.Setting;
import InOvaClient.ui.screens.clickgui.ModuleButton;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Slider extends Component {

    public NumberSetting numSet = (NumberSetting)setting;

    public Slider(Setting setting, ModuleButton parent, int offset) {
        super(setting, parent, offset);
        this.numSet = (NumberSetting)setting;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        DrawableHelper.fill(matrices, parent.parent.x, parent.parent.y + parent.offset + offset, parent.parent.x + parent.parent.width, parent.parent.y + parent.offset + offset + parent.parent.height, new Color(77, 0, 128, 60).getRGB());
        int textOffset = ((parent.parent.height / 2) - mc.textRenderer.fontHeight / 2);
        mc.textRenderer.drawWithShadow(matrices, numSet.getName() + ": " + roundToplace(numSet.getValue(), 1), parent.parent.x + textOffset, parent.parent.y + parent.offset + offset + textOffset, -1);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {
        super.mouseReleased(mouseX, mouseY, button);
    }

    private double roundToplace(double value, int place) {
        if (place < 0) {
            return value;
        }

        BigDecimal bd =new BigDecimal(value);
        bd = bd.setScale(place, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
