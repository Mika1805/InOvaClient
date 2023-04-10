package InOvaClient.module.combat;

import InOvaClient.module.Mod;
import net.minecraft.entity.damage.DamageSource;
import org.lwjgl.glfw.GLFW;

public class Test extends Mod {
    public Test() {
        super("Test", "Just doesnt render fire", Category.RENDER);
        this.setKey(GLFW.GLFW_KEY_KP_8);
    }


    @Override
    public void onTick() {
        if (mc.targetedEntity.canHit()) {
            mc.player.attack(mc.targetedEntity);
            mc.player.addEnchantedHitParticles(mc.targetedEntity);
        }
        super.onTick();
    }
}