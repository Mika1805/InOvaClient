package InOvaClient.module.movement;

import InOvaClient.module.Mod;
import org.lwjgl.glfw.GLFW;

public class Sprint extends Mod {
    public Sprint() {
        super("Sprint", "Keeps Sprint", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_KP_7);
    }

    @Override
    public void onTick() {
        mc.player.setSprinting(true);
        super.onTick();
    }
}
