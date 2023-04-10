package InOvaClient.module.render;

import InOvaClient.module.Mod;
import org.lwjgl.glfw.GLFW;

public class AntiFireRender extends Mod {
    public AntiFireRender() {
        super("AntiFireRender", "Just doesnt render fire", Category.RENDER);
        this.setKey(GLFW.GLFW_KEY_B);
    }
    

    @Override
    public void onTick() {
        if (mc.player.isOnFire() == true) mc.player.setOnFire(false);
        super.onTick();
    }
}
