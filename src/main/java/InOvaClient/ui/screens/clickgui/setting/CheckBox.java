package InOvaClient.ui.screens.clickgui.setting;

import InOvaClient.module.settings.Setting;
import InOvaClient.ui.screens.clickgui.ModuleButton;
import net.minecraft.client.util.math.MatrixStack;

public class CheckBox extends Component {

    private booleanSetting boolset = (booleanSetting)setting;

    public CheckBox(Setting setting, ModuleButton parent, int offset) {
        super(setting, parent, offset);
        this.boolset = (booleanSetting)setting;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
    }
}
