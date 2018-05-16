package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCape1 - oaster2000
 * Created using Tabula 7.0.0
 */
public class ModelCape1 extends ModelBiped {
    public ModelRenderer cape;

    public ModelCape1(float expand) {
		super(expand, 0, 96, 64);
        this.cape = new ModelRenderer(this, 56, 23);
        this.cape.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cape.addBox(-6.0F, 1.0F, 2.0F, 12, 18, 1, 0.0F);
        this.setRotateAngle(cape, 0.122173F, 0.0F, 0.0F);
        this.bipedBody.addChild(this.cape);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
    
    @SuppressWarnings("incomplete-switch")
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    	boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getTicksElytraFlying() > 4;
        float f = 1.0F;

        if (flag)
        {
            f = (float)(entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
            f = f / 0.2F;
            f = f * f * f;
        }

        if (f < 1.0F)
        {
            f = 1.0F;
        }

  	  	this.cape.rotateAngleX = MathHelper.cos(0.6662F) * 2.0F * limbSwingAmount * 0.5F + 0.19198621771937624F;
  	  	
        if (this.isRiding)
        {
            this.cape.rotateAngleX += -((float)Math.PI / 5F);
        }

        this.cape.rotateAngleY = 0.0F;

        if (this.swingProgress > 0.0F)
        {
            float f1 = this.swingProgress;
            this.cape.rotateAngleY += this.bipedBody.rotateAngleY;
        }
        this.cape.rotateAngleX += (MathHelper.sin(ageInTicks * 0.067F) * 0.05F) + 0.122173F;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
