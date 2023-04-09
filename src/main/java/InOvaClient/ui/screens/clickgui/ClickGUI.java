package InOvaClient.ui.screens.clickgui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class ClickGUI extends Screen {
    protected ClickGUI() {
        super(Text.literal("Click GUI"));
    }
    public static final ClickGUI INSTANCE = new ClickGUI();

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
