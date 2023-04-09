package InOvaClient.module.movement;

import InOvaClient.module.Mod;
import net.minecraft.entity.EntityPose;
import org.lwjgl.glfw.GLFW;

public class AutoSwim extends Mod {
    public AutoSwim() {
        super("AutoSwim", "Keeps Swim", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_Y);
    }

    @Override
    public void onTick() {
        if (mc.player.isTouchingWater())
        mc.player.setPose(EntityPose.SWIMMING);
        super.onTick();
    }
}
