package InOvaClient.module.combat;

import InOvaClient.module.Mod;
<<<<<<< HEAD
import net.minecraft.block.DirtPathBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.TotemParticle;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;
=======
import net.minecraft.text.Text;
>>>>>>> parent of c2b273a (Added AntiFireRender)
import org.lwjgl.glfw.GLFW;

public class Test extends Mod {
    public Test() {
        super("Test", "U Lazzy ass", Category.COMBAT);
        this.setKey(GLFW.GLFW_KEY_B);
    }
    

    @Override
    public void onTick() {
<<<<<<< HEAD
        if (mc.player.isTouchingWater());
            mc.player.dropSelectedItem(true);
=======
        originalgamma = mc.gameSettings.gammaSetting;
        mc.gameSettings.gammaSetting = 1.5999999E7F;
>>>>>>> parent of c2b273a (Added AntiFireRender)
        super.onTick();
    }
}
