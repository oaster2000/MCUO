package github.oaster2000.mcuo.client.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBlast extends Render {
	public RenderBlast(RenderManager renderManager) {
		super(renderManager);
	}

	public void doRender(Entity entity1, double x, double y, double z, float entityYaw, float partialTicks) {
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}
}