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
public class ModelOwenChest extends ModelBiped {
    public ModelRenderer LogoTop;
    public ModelRenderer LogoCentre;
    public ModelRenderer LogoLeft;
    public ModelRenderer LogoBottom;
    public ModelRenderer LogoRight;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderL;
    public ModelRenderer WristBandR1;
    public ModelRenderer WristBandR2;
    public ModelRenderer WristBandR3;
    public ModelRenderer WristBandR4;
    public ModelRenderer WristBandL1;
    public ModelRenderer WristBandL2;
    public ModelRenderer WristBandL3;
    public ModelRenderer WristBandL4;

    public ModelOwenChest(float expand) {
		super(expand, 0, 96, 64);
        
		this.ShoulderR = new ModelRenderer(this, 64, 15);
        this.ShoulderR.mirror = true;
        this.ShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR.addBox(-1.0F, -4.0F, -2.5F, 5, 5, 5, 0.0F);
        
        this.WristBandR2 = new ModelRenderer(this, 64, 26);
        this.WristBandR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR2.addBox(2.2F, 4.0F, -2.0F, 1, 1, 4, 0.0F);
        
        this.WristBandL2 = new ModelRenderer(this, 64, 26);
        this.WristBandL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL2.addBox(-3.2F, 4.0F, -2.0F, 1, 1, 4, 0.0F);
        
        this.ShoulderL = new ModelRenderer(this, 64, 15);
        this.ShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL.addBox(-4.0F, -4.0F, -2.5F, 5, 5, 5, 0.0F);
        
        this.WristBandL4 = new ModelRenderer(this, 64, 26);
        this.WristBandL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL4.addBox(0.8F, 4.0F, -2.2F, 1, 1, 4, 0.0F);
        
        this.WristBandR1 = new ModelRenderer(this, 64, 32);
        this.WristBandR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR1.addBox(-1.0F, 4.0F, -2.2F, 4, 1, 1, 0.0F);
        
        this.LogoBottom = new ModelRenderer(this, 72, 11);
        this.LogoBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoBottom.addBox(-1.0F, 7.0F, -5.0F, 2, 1, 1, 0.0F);
        
        this.WristBandL3 = new ModelRenderer(this, 64, 32);
        this.WristBandL3.mirror = true;
        this.WristBandL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL3.addBox(-3.0F, 4.0F, 1.2F, 4, 1, 1, 0.0F);
        
        this.LogoTop = new ModelRenderer(this, 72, 0);
        this.LogoTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoTop.addBox(-1.0F, 2.0F, -5.0F, 2, 1, 1, 0.0F);
        
        this.WristBandL1 = new ModelRenderer(this, 64, 32);
        this.WristBandL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL1.addBox(-3.0F, 4.0F, -2.2F, 4, 1, 1, 0.0F);
        
        this.LogoLeft = new ModelRenderer(this, 64, 4);
        this.LogoLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoLeft.addBox(-3.0F, 4.0F, -5.0F, 1, 2, 1, 0.0F);
        
        this.WristBandR3 = new ModelRenderer(this, 64, 32);
        this.WristBandR3.mirror = true;
        this.WristBandR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR3.addBox(-1.0F, 4.0F, 1.2F, 4, 1, 1, 0.0F);
        
        this.LogoRight = new ModelRenderer(this, 82, 5);
        this.LogoRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoRight.addBox(2.0F, 4.0F, -5.0F, 1, 2, 1, 0.0F);
        
        this.LogoCentre = new ModelRenderer(this, 70, 4);
        this.LogoCentre.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoCentre.addBox(-2.0F, 3.0F, -5.0F, 4, 4, 1, 0.0F);
        
        this.WristBandR4 = new ModelRenderer(this, 64, 26);
        this.WristBandR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR4.addBox(-1.8F, 4.0F, -2.2F, 1, 1, 4, 0.0F);
        
        this.bipedLeftArm.addChild(WristBandR1);
        this.bipedLeftArm.addChild(WristBandR2);
        this.bipedLeftArm.addChild(WristBandR3);
        this.bipedLeftArm.addChild(WristBandR4);
        this.bipedLeftArm.addChild(ShoulderR);
        
        this.bipedRightArm.addChild(WristBandL1);
        this.bipedRightArm.addChild(WristBandL2);
        this.bipedRightArm.addChild(WristBandL3);
        this.bipedRightArm.addChild(WristBandL4);
        this.bipedRightArm.addChild(ShoulderL);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LogoBottom.offsetX, this.LogoBottom.offsetY, this.LogoBottom.offsetZ);
        GlStateManager.translate(this.LogoBottom.rotationPointX * f5, this.LogoBottom.rotationPointY * f5, this.LogoBottom.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoBottom.offsetX, -this.LogoBottom.offsetY, -this.LogoBottom.offsetZ);
        GlStateManager.translate(-this.LogoBottom.rotationPointX * f5, -this.LogoBottom.rotationPointY * f5, -this.LogoBottom.rotationPointZ * f5);
        this.LogoBottom.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LogoTop.offsetX, this.LogoTop.offsetY, this.LogoTop.offsetZ);
        GlStateManager.translate(this.LogoTop.rotationPointX * f5, this.LogoTop.rotationPointY * f5, this.LogoTop.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoTop.offsetX, -this.LogoTop.offsetY, -this.LogoTop.offsetZ);
        GlStateManager.translate(-this.LogoTop.rotationPointX * f5, -this.LogoTop.rotationPointY * f5, -this.LogoTop.rotationPointZ * f5);
        this.LogoTop.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LogoLeft.offsetX, this.LogoLeft.offsetY, this.LogoLeft.offsetZ);
        GlStateManager.translate(this.LogoLeft.rotationPointX * f5, this.LogoLeft.rotationPointY * f5, this.LogoLeft.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoLeft.offsetX, -this.LogoLeft.offsetY, -this.LogoLeft.offsetZ);
        GlStateManager.translate(-this.LogoLeft.rotationPointX * f5, -this.LogoLeft.rotationPointY * f5, -this.LogoLeft.rotationPointZ * f5);
        this.LogoLeft.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LogoRight.offsetX, this.LogoRight.offsetY, this.LogoRight.offsetZ);
        GlStateManager.translate(this.LogoRight.rotationPointX * f5, this.LogoRight.rotationPointY * f5, this.LogoRight.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoRight.offsetX, -this.LogoRight.offsetY, -this.LogoRight.offsetZ);
        GlStateManager.translate(-this.LogoRight.rotationPointX * f5, -this.LogoRight.rotationPointY * f5, -this.LogoRight.rotationPointZ * f5);
        this.LogoRight.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LogoCentre.offsetX, this.LogoCentre.offsetY, this.LogoCentre.offsetZ);
        GlStateManager.translate(this.LogoCentre.rotationPointX * f5, this.LogoCentre.rotationPointY * f5, this.LogoCentre.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoCentre.offsetX, -this.LogoCentre.offsetY, -this.LogoCentre.offsetZ);
        GlStateManager.translate(-this.LogoCentre.rotationPointX * f5, -this.LogoCentre.rotationPointY * f5, -this.LogoCentre.rotationPointZ * f5);
        this.LogoCentre.render(f5);
        GlStateManager.popMatrix();
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
