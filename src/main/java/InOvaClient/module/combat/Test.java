package InOvaClient.module.combat;

import InOvaClient.module.Mod;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class Test extends Mod {
    public Test() {
        super("Test", "U Lazzy ass", Category.COMBAT);
        this.setKey(GLFW.GLFW_KEY_B);
    }
    

    @Override
    public void onTick() {
        originalgamma = mc.gameSettings.gammaSetting;
        mc.gameSettings.gammaSetting = 1.5999999E7F;
        super.onTick();
    }
}
