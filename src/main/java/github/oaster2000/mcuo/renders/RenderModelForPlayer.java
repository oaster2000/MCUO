package github.oaster2000.mcuo.renders;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderModelForPlayer extends RenderLivingBase {
	private ResourceLocation texture;
	String type = "";

	public RenderModelForPlayer(RenderManager rm, ModelBase model, String textureName, float shadowSize, String type) {
		super(rm, model, shadowSize);
		if (textureName != null)
			this.texture = new ResourceLocation(textureName + "_default.png");
		if (model != null)
			this.mainModel = model;
		this.type = type;
	}

	// Call the doRender function directly inside EventChangePlayerModel class in
	// the onRenderPlayerPre() method to render the model you want
	@Override
	public void doRender(EntityLivingBase entity, double x, double y, double z, float par8, float par9) {
		super.doRender(entity, x, y, z, par8, par9);
		GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        setModelColor();
        this.mainModel.swingProgress = this.getSwingProgress(entity, par9);
        boolean shouldSit = entity.isRiding() && (entity.getRidingEntity() != null && entity.getRidingEntity().shouldRiderSit());
        this.mainModel.isRiding = shouldSit;
        this.mainModel.isChild = entity.isChild();

        try
        {
            float f = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, par9);
            float f1 = this.interpolateRotation(entity.prevRotationYawHead, entity.rotationYawHead, par9);
            float f2 = f1 - f;

            if (shouldSit && entity.getRidingEntity() instanceof EntityLivingBase)
            {
                EntityLivingBase entitylivingbase = (EntityLivingBase)entity.getRidingEntity();
                f = this.interpolateRotation(entitylivingbase.prevRenderYawOffset, entitylivingbase.renderYawOffset, par9);
                f2 = f1 - f;
                float f3 = MathHelper.wrapDegrees(f2);

                if (f3 < -85.0F)
                {
                    f3 = -85.0F;
                }

                if (f3 >= 85.0F)
                {
                    f3 = 85.0F;
                }

                f = f1 - f3;

                if (f3 * f3 > 2500.0F)
                {
                    f += f3 * 0.2F;
                }

                f2 = f1 - f;
            }

            float f7 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * par9;
            this.renderLivingAt(entity, x, y, z);
            float f8 = this.handleRotationFloat(entity, par9);
            this.applyRotations(entity, f8, f, par9);
            float f4 = this.prepareScale(entity, par9);
            float f5 = 0.0F;
            float f6 = 0.0F;

            if (!entity.isRiding())
            {
                f5 = entity.prevLimbSwingAmount + (entity.limbSwingAmount - entity.prevLimbSwingAmount) * par9;
                f6 = entity.limbSwing - entity.limbSwingAmount * (1.0F - par9);

                if (entity.isChild())
                {
                    f6 *= 3.0F;
                }

                if (f5 > 1.0F)
                {
                    f5 = 1.0F;
                }
                f2 = f1 - f; // Forge: Fix MC-1207
            }

            GlStateManager.enableAlpha();
            this.mainModel.setLivingAnimations(entity, f6, f5, par9);
            this.mainModel.setRotationAngles(f6, f5, f8, f2, f7, f4, entity);

            if (this.renderOutlines)
            {
                boolean flag1 = this.setScoreTeamColor(entity);
                GlStateManager.enableColorMaterial();
                GlStateManager.enableOutlineMode(this.getTeamColor(entity));

                if (!this.renderMarker)
                {
                    this.renderModel(entity, f6, f5, f8, f2, f7, f4);
                }

                if (!(entity instanceof EntityPlayer) || !((EntityPlayer)entity).isSpectator())
                {
                    this.renderLayers(entity, f6, f5, par9, f8, f2, f7, f4);
                }

                GlStateManager.disableOutlineMode();
                GlStateManager.disableColorMaterial();

                if (flag1)
                {
                    this.unsetScoreTeamColor();
                }
            }
            else
            {
                boolean flag = this.setDoRenderBrightness(entity, par9);
                this.renderModel(entity, f6, f5, f8, f2, f7, f4);

                if (flag)
                {
                    this.unsetBrightness();
                }
                GlStateManager.depthMask(true);

                if (!(entity instanceof EntityPlayer) || !((EntityPlayer)entity).isSpectator())
                {
                	this.renderLayers(entity, f6, f5, par9, f8, f2, f7, f4);
                }
            }

            GlStateManager.disableRescaleNormal();
        }
        catch (Exception exception)
        {
        }

        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }

	private void setModelColor() {
        switch(type) {
        case "HELM":
        	float R = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getHelmColorR();
        	float G = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getHelmColorG();
        	float B = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getHelmColorB();
        	GlStateManager.color(R, G, B);
        	return;
        case "TORSO":
        	float RT = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getTorsoColorR();
        	float GT = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getTorsoColorG();
        	float BT = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getTorsoColorB();
        	GlStateManager.color(RT, GT, BT);
        	return;
        case "CAPE":
        	float RC = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getCapeColorR();
        	float GC = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getCapeColorG();
        	float BC = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null).getCapeColorB();
        	GlStateManager.color(RC, GC, BC);
        	return;
        }
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.texture;
	}

}