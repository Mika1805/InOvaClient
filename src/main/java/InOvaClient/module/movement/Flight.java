package InOvaClient.module.movement;

import InOvaClient.module.Mod;
import org.lwjgl.glfw.GLFW;


public class Flight extends Mod {
    public Flight() {
        super("Flight", "Very Simple Vanilla Flight", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_G);
    }

    @Override
    public void onTick() {
        mc.player.getAbilities().flying =true;
        super.onTick();
    }

    @Override
    public void onDisable() {
        mc.player.getAbilities().flying = false;
        super.onDisable();
    }

}
