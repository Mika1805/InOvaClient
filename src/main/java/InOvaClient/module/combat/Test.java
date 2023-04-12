package InOvaClient.module.combat;

import InOvaClient.module.Mod;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.TotemParticle;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;
import org.lwjgl.glfw.GLFW;

public class Test extends Mod {
    public Test() {
        super("Test", "Just doesnt render fire", Category.RENDER);
        this.setKey(GLFW.GLFW_KEY_KP_8);
    }


    @Override
    public void onTick() {
        mc.player.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, mc.targetedEntity);
        mc.player.dropSelectedItem(true);
        super.onTick();
    }
}