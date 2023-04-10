package InOvaClient.module.movement;

import InOvaClient.module.Mod;
import InOvaClient.module.settings.BooleanSetting;
import InOvaClient.module.settings.ModeSetting;
import InOvaClient.module.settings.NumberSetting;
import org.lwjgl.glfw.GLFW;


public class Flight extends Mod {

    public NumberSetting speed = new NumberSetting("Speed", 0, 10, 1, 0.1);
    public BooleanSetting testBool = new BooleanSetting("Check", true);
    public ModeSetting testMode = new ModeSetting("Mode", "Test", "test", "test 2", "test 3");

    public Flight() {
        super("Flight", "Very Simple Vanilla Flight", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_G);
        addSettings(speed, testBool, testMode);
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
