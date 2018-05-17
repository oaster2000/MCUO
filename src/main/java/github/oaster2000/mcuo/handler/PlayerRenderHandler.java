package github.oaster2000.mcuo.handler;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.common.Reference;
import github.oaster2000.mcuo.models.ModelCape1;
import github.oaster2000.mcuo.models.ModelHelmet1;
import github.oaster2000.mcuo.models.ModelHelmet2;
import github.oaster2000.mcuo.models.ModelMaskSmall;
import github.oaster2000.mcuo.models.ModelOwenSuit;
import github.oaster2000.mcuo.models.ModelTorso1;
import github.oaster2000.mcuo.renders.RenderModelForPlayer;
import github.oaster2000.mcuo.renders.RenderModelForPlayerNoColor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PlayerRenderHandler {
	
	static EntityPlayer player = Minecraft.getMinecraft().player;
	static IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);

	@SubscribeEvent
	public static void renderPlayer(RenderPlayerEvent.Pre pre) {
		if (mcuo.getHelmType() > 0 || Reference.isUserOaster) {
			pre.getRenderer().getMainModel().bipedHeadwear.isHidden = true;
		} else {
			pre.getRenderer().getMainModel().bipedHeadwear.isHidden = false;
		}
	}

	@SubscribeEvent
	public static void renderPlayer(RenderPlayerEvent.Post post) {
		if (Reference.isUserOaster) {
			ModelBiped model = new ModelOwenSuit(0.05f);
			model.isSneak = post.getEntityPlayer().isSneaking();
			final Render renderCustomModel = new RenderModelForPlayerNoColor(post.getRenderer().getRenderManager(),
					model, "mcuo:textures/models/owenlogo", 1.0f);
			renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
		} else {

			if (mcuo.getHelmType() == 1) {
				ModelBiped model = new ModelHelmet1(0.05f);
				model.isSneak = post.getEntityPlayer().isSneaking();
				final Render renderCustomModel = new RenderModelForPlayer(post.getRenderer().getRenderManager(), model,
						"mcuo:textures/models/helmet1", 1.0f, "HELM");
				renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
			}

			if (mcuo.getHelmType() == 2) {
				ModelBiped model = new ModelMaskSmall(0.05f);
				model.isSneak = post.getEntityPlayer().isSneaking();
				final Render renderCustomModel = new RenderModelForPlayer(post.getRenderer().getRenderManager(), model,
						"mcuo:textures/models/smallMask", 1.0f, "HELM");
				renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
			}

			if (mcuo.getHelmType() == 3) {
				ModelBiped model = new ModelHelmet2(0.05f);
				model.isSneak = post.getEntityPlayer().isSneaking();
				final Render renderCustomModel = new RenderModelForPlayer(post.getRenderer().getRenderManager(), model,
						"mcuo:textures/models/helmet2", 1.0f, "HELM");
				renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
			}
			
			if(mcuo.getTorsoType() == 1) {
				ModelBiped model = new ModelTorso1(0.05f);
				model.isSneak = post.getEntityPlayer().isSneaking();
				final Render renderCustomModel = new RenderModelForPlayer(post.getRenderer().getRenderManager(), model,
						"mcuo:textures/models/torso1", 1.0f, "TORSO");
				renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
			}
			
			if (mcuo.getCapeType() == 1) {
				ModelBiped model = new ModelCape1(0.05f);
				model.isSneak = post.getEntityPlayer().isSneaking();
				final Render renderCustomModel = new RenderModelForPlayer(post.getRenderer().getRenderManager(), model,
						"mcuo:textures/models/cape1", 1.0f, "CAPE");
				renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
			}
			
			if (mcuo.getCapeType() == 2) {
				ModelBiped model = new ModelCape1(0.05f);
				model.isSneak = post.getEntityPlayer().isSneaking();
				final Render renderCustomModel = new RenderModelForPlayer(post.getRenderer().getRenderManager(), model,
						"mcuo:textures/models/cape2", 1.0f, "CAPE");
				renderCustomModel.doRender(post.getEntity(), 0F, -0.1075f, 0F, 0F, 0.0625F);
			}
		}
	}
}
