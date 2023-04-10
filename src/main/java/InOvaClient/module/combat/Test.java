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
        if (mc.player.isSleeping()) mc.player.wakeUp();
        super.onTick();
    }
}
