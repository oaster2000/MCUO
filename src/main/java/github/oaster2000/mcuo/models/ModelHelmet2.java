package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelHelmet2 extends ModelBiped {
    public ModelRenderer head;
    public ModelRenderer Helmet1;
    public ModelRenderer Helmet2;
    public ModelRenderer Helmet3;
    public ModelRenderer Helmet4;
    public ModelRenderer Helmet5;
    public ModelRenderer Helmet6;
    public ModelRenderer Helmet7;
    public ModelRenderer Helmet8;
    public ModelRenderer Helmet9;
    public ModelRenderer Helmet10;
    public ModelRenderer Helmet11;
    public ModelRenderer Helmet12;
    public ModelRenderer Helmet13;
    public ModelRenderer Helmet14;
    public ModelRenderer Helmet15;
    public ModelRenderer Helmet16;
    public ModelRenderer Helmet17;
    public ModelRenderer Helmet18;
    public ModelRenderer Helmet19;
    public ModelRenderer Helmet20;
    public ModelRenderer Helmet21;
    public ModelRenderer Helmet22;
    public ModelRenderer Helmet23;
    public ModelRenderer Helmet24;
    public ModelRenderer Helmet25;

    public ModelHelmet2(float expand) {
		super(expand, 0, 96, 64);
        this.Helmet22 = new ModelRenderer(this, 56, 3);
        this.Helmet22.mirror = true;
        this.Helmet22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet22.addBox(3.18F, -8.0F, -1.2F, 1, 4, 3, 0.0F);
        this.Helmet18 = new ModelRenderer(this, 56, 1);
        this.Helmet18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet18.addBox(-3.5F, -2.6F, 3.19F, 7, 1, 1, 0.0F);
        this.Helmet10 = new ModelRenderer(this, 56, 0);
        this.Helmet10.mirror = true;
        this.Helmet10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet10.addBox(-0.4F, -5.1F, -0.8F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Helmet10, 0.7853981633974483F, 0.0F, 0.091106186954104F);
        this.Helmet20 = new ModelRenderer(this, 56, 0);
        this.Helmet20.mirror = true;
        this.Helmet20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet20.addBox(3.2F, -8.0F, -4.0F, 1, 5, 3, 0.0F);
        this.Helmet3 = new ModelRenderer(this, 56, 1);
        this.Helmet3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet3.addBox(-0.2F, -4.0F, -4.2F, 1, 1, 1, 0.0F);
        this.Helmet1 = new ModelRenderer(this, 56, 0);
        this.Helmet1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet1.addBox(-3.0F, -5.0F, -4.2F, 6, 1, 1, 0.0F);
        this.Helmet12 = new ModelRenderer(this, 56, 1);
        this.Helmet12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet12.addBox(-4.19F, -3.7F, -3.99F, 1, 1, 3, 0.0F);
        this.Helmet13 = new ModelRenderer(this, 56, 3);
        this.Helmet13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet13.addBox(-4.18F, -8.0F, -1.2F, 1, 4, 3, 0.0F);
        this.Helmet8 = new ModelRenderer(this, 56, 0);
        this.Helmet8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet8.addBox(3.0F, -5.0F, -4.2F, 1, 2, 1, 0.0F);
        this.Helmet2 = new ModelRenderer(this, 56, 1);
        this.Helmet2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet2.addBox(-0.8F, -4.0F, -4.2F, 1, 1, 1, 0.0F);
        this.Helmet14 = new ModelRenderer(this, 56, 1);
        this.Helmet14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet14.addBox(-4.2F, -8.0F, 1.0F, 1, 6, 3, 0.0F);
        this.Helmet7 = new ModelRenderer(this, 56, 0);
        this.Helmet7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet7.addBox(-4.0F, -8.0F, -4.2F, 8, 3, 1, 0.0F);
        this.Helmet16 = new ModelRenderer(this, 56, 1);
        this.Helmet16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet16.addBox(-4.19F, -2.6F, 1.19F, 1, 1, 3, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.Helmet9 = new ModelRenderer(this, 56, 1);
        this.Helmet9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet9.addBox(3.0F, -3.7F, -4.19F, 1, 1, 1, 0.0F);
        this.Helmet21 = new ModelRenderer(this, 56, 1);
        this.Helmet21.mirror = true;
        this.Helmet21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet21.addBox(3.19F, -3.7F, -4.0F, 1, 1, 3, 0.0F);
        this.Helmet24 = new ModelRenderer(this, 56, 2);
        this.Helmet24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet24.addBox(3.18F, -4.3F, -1.3F, 1, 1, 1, 0.0F);
        this.Helmet23 = new ModelRenderer(this, 56, 1);
        this.Helmet23.mirror = true;
        this.Helmet23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet23.addBox(3.2F, -8.0F, 1.0F, 1, 6, 3, 0.0F);
        this.Helmet6 = new ModelRenderer(this, 56, 1);
        this.Helmet6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet6.addBox(-4.0F, -3.7F, -4.19F, 1, 1, 1, 0.0F);
        this.Helmet4 = new ModelRenderer(this, 56, 0);
        this.Helmet4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet4.addBox(-3.6F, -5.1F, -0.8F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Helmet4, 0.7853981633974483F, 0.0F, -0.091106186954104F);
        this.Helmet5 = new ModelRenderer(this, 56, 0);
        this.Helmet5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet5.addBox(-4.0F, -5.0F, -4.2F, 1, 2, 1, 0.0F);
        this.Helmet11 = new ModelRenderer(this, 56, 0);
        this.Helmet11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet11.addBox(-4.2F, -8.0F, -4.0F, 1, 5, 3, 0.0F);
        this.Helmet25 = new ModelRenderer(this, 56, 1);
        this.Helmet25.mirror = true;
        this.Helmet25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet25.addBox(3.19F, -2.6F, 1.19F, 1, 1, 3, 0.0F);
        this.Helmet19 = new ModelRenderer(this, 56, 10);
        this.Helmet19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet19.addBox(-4.0F, -8.2F, -4.0F, 8, 1, 8, 0.0F);
        this.Helmet17 = new ModelRenderer(this, 56, 0);
        this.Helmet17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet17.addBox(-4.0F, -8.0F, 3.2F, 8, 6, 1, 0.0F);
        this.Helmet15 = new ModelRenderer(this, 56, 2);
        this.Helmet15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet15.addBox(-4.18F, -4.3F, -1.3F, 1, 1, 1, 0.0F);
        this.head.addChild(this.Helmet22);
        this.head.addChild(this.Helmet18);
        this.head.addChild(this.Helmet10);
        this.head.addChild(this.Helmet20);
        this.head.addChild(this.Helmet3);
        this.head.addChild(this.Helmet1);
        this.head.addChild(this.Helmet12);
        this.head.addChild(this.Helmet13);
        this.head.addChild(this.Helmet8);
        this.head.addChild(this.Helmet2);
        this.head.addChild(this.Helmet14);
        this.head.addChild(this.Helmet7);
        this.head.addChild(this.Helmet16);
        this.head.addChild(this.Helmet9);
        this.head.addChild(this.Helmet21);
        this.head.addChild(this.Helmet24);
        this.head.addChild(this.Helmet23);
        this.head.addChild(this.Helmet6);
        this.head.addChild(this.Helmet4);
        this.head.addChild(this.Helmet5);
        this.head.addChild(this.Helmet11);
        this.head.addChild(this.Helmet25);
        this.head.addChild(this.Helmet19);
        this.head.addChild(this.Helmet17);
        this.head.addChild(this.Helmet15);
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
