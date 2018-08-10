package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPowers extends ModelBiped {
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer Torso;
    public ModelRenderer RightArm;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftPower1;
    public ModelRenderer LeftPower2;
    public ModelRenderer LeftPower3;
    public ModelRenderer LeftPower4;
    public ModelRenderer LeftPower5;
    public ModelRenderer RightPower1;
    public ModelRenderer RightPower2;
    public ModelRenderer RightPower3;
    public ModelRenderer RightPower4;
    public ModelRenderer RightPower5;

    public ModelPowers(float expand) {
    	super(expand, 0, 96, 64);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, expand * 2);
        this.LeftPower2 = new ModelRenderer(this, 64, 10);
        this.LeftPower2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPower2.addBox(-3.0F, 6.3F, 1.2F, 4, 4, 1, expand * 2);
        this.RightPower3 = new ModelRenderer(this, 75, 25);
        this.RightPower3.mirror = true;
        this.RightPower3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPower3.addBox(-1.2F, 6.2F, -2.0F, 1, 4, 4, expand * 2);
        this.RightPower2 = new ModelRenderer(this, 80, 25);
        this.RightPower2.mirror = true;
        this.RightPower2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPower2.addBox(-1.0F, 6.2F, 1.2F, 4, 4, 1, expand * 2);
        this.LeftPower5 = new ModelRenderer(this, 75, 13);
        this.LeftPower5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPower5.addBox(-3.0F, 9.2F, -2.0F, 4, 1, 4, expand * 2);
        this.RightPower4 = new ModelRenderer(this, 65, 17);
        this.RightPower4.mirror = true;
        this.RightPower4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPower4.addBox(2.2F, 6.2F, -2.0F, 1, 4, 4, expand * 2);
        this.Torso = new ModelRenderer(this, 16, 16);
        this.Torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, expand * 2);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, expand * 2);
        this.RightPower5 = new ModelRenderer(this, 81, 0);
        this.RightPower5.mirror = true;
        this.RightPower5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPower5.addBox(-1.0F, 9.2F, -2.0F, 4, 1, 4, expand * 2);
        this.LeftPower3 = new ModelRenderer(this, 75, 0);
        this.LeftPower3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPower3.addBox(0.2F, 6.2F, -2.0F, 1, 4, 4, expand * 2);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, expand * 2);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, expand * 2);
        this.LeftPower4 = new ModelRenderer(this, 83, 9);
        this.LeftPower4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPower4.addBox(-3.3F, 6.2F, -2.0F, 1, 4, 4, expand * 2);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, expand * 2);
        this.RightPower1 = new ModelRenderer(this, 72, 17);
        this.RightPower1.mirror = true;
        this.RightPower1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPower1.addBox(-1.0F, 6.2F, -2.2F, 4, 4, 1, expand * 2);
        this.LeftPower1 = new ModelRenderer(this, 64, 0);
        this.LeftPower1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPower1.addBox(-3.0F, 6.2F, -2.2F, 4, 4, 1, expand * 2);
        
        this.RightArm.addChild(this.LeftPower1);
        this.RightArm.addChild(this.LeftPower2);
        this.RightArm.addChild(this.LeftPower3);
        this.RightArm.addChild(this.LeftPower4);
        this.RightArm.addChild(this.LeftPower5);
        
        this.LeftArm.addChild(this.RightPower1);
        this.LeftArm.addChild(this.RightPower2);
        this.LeftArm.addChild(this.RightPower3);
        this.LeftArm.addChild(this.RightPower4);
        this.LeftArm.addChild(this.RightPower5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	this.LeftArm.render(f5);
    	this.RightArm.render(f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
    
    @SuppressWarnings("incomplete-switch")
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getTicksElytraFlying() > 4;

        this.RightArm.rotationPointZ = 0.0F;
        this.RightArm.rotationPointX = -5.0F;
        this.LeftArm.rotationPointZ = 0.0F;
        this.LeftArm.rotationPointX = 5.0F;
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

        this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.RightArm.rotateAngleZ = 0.0F;
        this.LeftArm.rotateAngleZ = 0.0F;


        if (this.isRiding)
        {
            this.RightArm.rotateAngleX += -((float)Math.PI / 5F);
            this.LeftArm.rotateAngleX += -((float)Math.PI / 5F);
        }

        this.RightArm.rotateAngleY = 0.0F;
        this.RightArm.rotateAngleZ = 0.0F;

        switch (this.leftArmPose)
        {
            case EMPTY:
                this.LeftArm.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.LeftArm.rotateAngleX = this.LeftArm.rotateAngleX * 0.5F - 0.9424779F;
                this.LeftArm.rotateAngleY = 0.5235988F;
                break;
            case ITEM:
                this.LeftArm.rotateAngleX = this.LeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.LeftArm.rotateAngleY = 0.0F;
        }

        switch (this.rightArmPose)
        {
            case EMPTY:
                this.RightArm.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.RightArm.rotateAngleX = this.RightArm.rotateAngleX * 0.5F - 0.9424779F;
                this.RightArm.rotateAngleY = -0.5235988F;
                break;
            case ITEM:
                this.RightArm.rotateAngleX = this.RightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.RightArm.rotateAngleY = 0.0F;
        }

        if (this.swingProgress > 0.0F)
        {
            EnumHandSide enumhandside = this.getMainHand(entityIn);
            ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
            float f1 = this.swingProgress;

            this.RightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
            this.RightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
            this.LeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
            this.LeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
            this.RightArm.rotateAngleY += this.bipedBody.rotateAngleY;
            this.LeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
            this.LeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
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
            this.RightArm.rotateAngleX += 0.4F;
            this.LeftArm.rotateAngleX += 0.4F;
        }

        this.RightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.LeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.RightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.LeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

        if (this.rightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
        {
            this.RightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY;
            this.LeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY + 0.4F;
            this.RightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.LeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
        }
        else if (this.leftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
        {
            this.RightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY - 0.4F;
            this.LeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY;
            this.RightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.LeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
        }
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