package InOvaClient.module.movement;

import InOvaClient.module.Mod;
import InOvaClient.module.settings.NumberSetting;
import org.lwjgl.glfw.GLFW;


public class Flight extends Mod {

    public NumberSetting speed = new NumberSetting("speed", 0, 10, 1, 0.1);

    public Flight() {
        super("Flight", "Very Simple Vanilla Flight", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_G);
        addSetting(speed);
    }

    @Override
    public void onTick() {
        mc.player.getAbilities().flying =true;
        mc.player.getAbilities().setFlySpeed(speed.getValueFloat());

        super.onTick();
    }

    @Override
    public void onDisable() {
        mc.player.getAbilities().flying = false;
        super.onDisable();
    }

}
