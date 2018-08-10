package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author Created using Tabula 7.0.0
 */
public class ModelHelmet1 extends ModelBiped {
	public ModelRenderer HelmetRight;
	public ModelRenderer HelmetLeft;
	public ModelRenderer HelmetTop;
	public ModelRenderer HelmetBack;
	public ModelRenderer HelmetTopDetail1;
	public ModelRenderer HelmetBackDetail1;
	public ModelRenderer HelmetFront1;
	public ModelRenderer HelmetFront2;
	public ModelRenderer HelmetFront3;
	public ModelRenderer HelmetFront4;
	public ModelRenderer HelmetFront5;
	public ModelRenderer head;

	public ModelHelmet1(float expand) {
		super(expand, 0, 128, 64);

		this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(0F, 0F, 0F, 0, 0, 0, expand);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		this.HelmetBackDetail1 = new ModelRenderer(this, 64, 0);
		this.HelmetBackDetail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetBackDetail1.addBox(-1.0F, -7.0F, 5.0F, 2, 6, 1, 0.0F);

		this.HelmetFront3 = new ModelRenderer(this, 64, 0);
		this.HelmetFront3.mirror = true;
		this.HelmetFront3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetFront3.addBox(-4.0F, -4.0F, -5.0F, 1, 1, 1, 0.0F);

		this.HelmetTopDetail1 = new ModelRenderer(this, 64, 0);
		this.HelmetTopDetail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetTopDetail1.addBox(-1.0F, -10.0F, -3.0F, 2, 1, 6, 0.0F);

		this.HelmetBack = new ModelRenderer(this, 64, 0);
		this.HelmetBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetBack.addBox(-4.0F, -8.0F, 4.0F, 8, 8, 1, 0.0F);

		this.HelmetFront4 = new ModelRenderer(this, 64, 0);
		this.HelmetFront4.mirror = true;
		this.HelmetFront4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetFront4.addBox(-1.0F, -4.0F, -5.0F, 2, 1, 1, 0.0F);

		this.HelmetFront1 = new ModelRenderer(this, 64, 0);
		this.HelmetFront1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetFront1.addBox(-4.0F, -8.0F, -5.0F, 8, 4, 1, 0.0F);

		this.HelmetTop = new ModelRenderer(this, 64, 0);
		this.HelmetTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetTop.addBox(-4.0F, -9.0F, -4.0F, 8, 1, 8, 0.0F);

		this.HelmetLeft = new ModelRenderer(this, 64, 0);
		this.HelmetLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetLeft.addBox(-5.0F, -8.0F, -4.0F, 1, 8, 8, 0.0F);

		this.HelmetFront2 = new ModelRenderer(this, 64, 0);
		this.HelmetFront2.mirror = true;
		this.HelmetFront2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetFront2.addBox(-4.0F, -3.0F, -5.0F, 8, 3, 1, 0.0F);

		this.HelmetFront5 = new ModelRenderer(this, 64, 0);
		this.HelmetFront5.mirror = true;
		this.HelmetFront5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetFront5.addBox(3.0F, -4.0F, -5.0F, 1, 1, 1, 0.0F);

		this.HelmetRight = new ModelRenderer(this, 64, 0);
		this.HelmetRight.mirror = true;
		this.HelmetRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HelmetRight.addBox(4.0F, -8.0F, -4.0F, 1, 8, 8, 0.0F);
		
		this.head.addChild(HelmetBack);
		this.head.addChild(HelmetBackDetail1);
		this.head.addChild(HelmetFront1);
		this.head.addChild(HelmetFront2);
		this.head.addChild(HelmetFront3);
		this.head.addChild(HelmetFront4);
		this.head.addChild(HelmetFront5);
		this.head.addChild(HelmetLeft);
		this.head.addChild(HelmetRight);
		this.head.addChild(HelmetTop);
		this.head.addChild(HelmetTopDetail1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float scale) {
		this.setRotationAngles(f, f1, f2, f3, f4, scale, entity);
        GlStateManager.pushMatrix();
        if (this.isChild)
        {
            float i = 2.0F;
            GlStateManager.scale(0.75F, 0.75F, 0.75F);
            GlStateManager.translate(0.0F, 16.0F * scale, 0.0F);
            this.head.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
        }
        else
        {
            if (entity.isSneaking())
            {
                GlStateManager.translate(0.0F, 0.2F, 0.0F);
            }
            this.head.render(scale);
        }
        GlStateManager.popMatrix();
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getTicksElytraFlying() > 4;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;

        if (flag)
        {
            this.head.rotateAngleX = -((float)Math.PI / 4F);
        }
        else
        {
            this.head.rotateAngleX = headPitch * 0.017453292F;
        }
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

        if (this.swingProgress > 0.0F)
        {
            EnumHandSide enumhandside = this.getMainHand(entityIn);
            ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
            float f1 = this.swingProgress;
            f1 = 1.0F - this.swingProgress;
            f1 = f1 * f1;
            f1 = f1 * f1;
            f1 = 1.0F - f1;
            float f2 = MathHelper.sin(f1 * (float)Math.PI);
            float f3 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            modelrenderer.rotateAngleX = (float)((double)modelrenderer.rotateAngleX - ((double)f2 * 1.2D + (double)f3));
            modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F;
        }

        if (this.isSneak)
        {
            this.head.rotationPointY = 1.0F;
        }
        else
        {
            this.head.rotationPointY = 0.0F;
        }
        
        this.bipedHead.rotateAngleY = netHeadYaw * 0.017453292F;

        if (flag)
        {
            this.bipedHead.rotateAngleX = -((float)Math.PI / 4F);
        }
        else
        {
            this.bipedHead.rotateAngleX = headPitch * 0.017453292F;
        }

        this.bipedBody.rotateAngleY = 0.0F;
        this.bipedRightArm.rotationPointZ = 0.0F;
        this.bipedRightArm.rotationPointX = -5.0F;
        this.bipedLeftArm.rotationPointZ = 0.0F;
        this.bipedLeftArm.rotationPointX = 5.0F;

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

        this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
        this.bipedRightLeg.rotateAngleZ = 0.0F;
        this.bipedLeftLeg.rotateAngleZ = 0.0F;

        if (this.isRiding)
        {
            this.bipedRightArm.rotateAngleX += -((float)Math.PI / 5F);
            this.bipedLeftArm.rotateAngleX += -((float)Math.PI / 5F);
            this.bipedRightLeg.rotateAngleX = -1.4137167F;
            this.bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
            this.bipedRightLeg.rotateAngleZ = 0.07853982F;
            this.bipedLeftLeg.rotateAngleX = -1.4137167F;
            this.bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
            this.bipedLeftLeg.rotateAngleZ = -0.07853982F;
        }

        this.bipedRightArm.rotateAngleY = 0.0F;
        this.bipedRightArm.rotateAngleZ = 0.0F;

        switch (this.leftArmPose)
        {
            case EMPTY:
                this.bipedLeftArm.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - 0.9424779F;
                this.bipedLeftArm.rotateAngleY = 0.5235988F;
                break;
            case ITEM:
                this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.bipedLeftArm.rotateAngleY = 0.0F;
        }

        switch (this.rightArmPose)
        {
            case EMPTY:
                this.bipedRightArm.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - 0.9424779F;
                this.bipedRightArm.rotateAngleY = -0.5235988F;
                break;
            case ITEM:
                this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.bipedRightArm.rotateAngleY = 0.0F;
        }

        if (this.swingProgress > 0.0F)
        {
            EnumHandSide enumhandside = this.getMainHand(entityIn);
            ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
            float f1 = this.swingProgress;
            this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;

            if (enumhandside == EnumHandSide.LEFT)
            {
                this.bipedBody.rotateAngleY *= -1.0F;
            }

            this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
            this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
            this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
            this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
            this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
            this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
            this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
            f1 = 1.0F - this.swingProgress;
            f1 = f1 * f1;
            f1 = f1 * f1;
            f1 = 1.0F - f1;
            float f2 = MathHelper.sin(f1 * (float)Math.PI);
            float f3 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
            modelrenderer.rotateAngleX = (float)((double)modelrenderer.rotateAngleX - ((double)f2 * 1.2D + (double)f3));
            modelrenderer.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
            modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F;
        }

        if (this.isSneak)
        {
            this.bipedBody.rotateAngleX = 0.5F;
            this.bipedRightArm.rotateAngleX += 0.4F;
            this.bipedLeftArm.rotateAngleX += 0.4F;
            this.bipedRightLeg.rotationPointZ = 4.0F;
            this.bipedLeftLeg.rotationPointZ = 4.0F;
            this.bipedRightLeg.rotationPointY = 9.0F;
            this.bipedLeftLeg.rotationPointY = 9.0F;
            this.bipedHead.rotationPointY = 1.0F;
        }
        else
        {
            this.bipedBody.rotateAngleX = 0.0F;
            this.bipedRightLeg.rotationPointZ = 0.1F;
            this.bipedLeftLeg.rotationPointZ = 0.1F;
            this.bipedRightLeg.rotationPointY = 12.0F;
            this.bipedLeftLeg.rotationPointY = 12.0F;
            this.bipedHead.rotationPointY = 0.0F;
        }

        this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

        if (this.rightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
        {
            this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY;
            this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY + 0.4F;
            this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
        }
        else if (this.leftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
        {
            this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY - 0.4F;
            this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY;
            this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
        }

        copyModelAngles(this.bipedHead, this.bipedHeadwear);
    }

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}