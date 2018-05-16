package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelOwenLogo extends ModelBiped {
    public ModelRenderer LogoTop;
    public ModelRenderer LogoCentre;
    public ModelRenderer LogoLeft;
    public ModelRenderer LogoBottom;
    public ModelRenderer LogoRight;

    public ModelOwenLogo(float expand) {
		super(expand, 0, 96, 64);
		
        this.LogoLeft = new ModelRenderer(this, 64, 4);
        this.LogoLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoLeft.addBox(-3.0F, 4.0F, -5.0F, 1, 2, 1, 0.0F);
        this.LogoRight = new ModelRenderer(this, 82, 5);
        this.LogoRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoRight.addBox(2.0F, 4.0F, -5.0F, 1, 2, 1, 0.0F);
        this.LogoBottom = new ModelRenderer(this, 72, 11);
        this.LogoBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoBottom.addBox(-1.0F, 7.0F, -5.0F, 2, 1, 1, 0.0F);
        this.LogoTop = new ModelRenderer(this, 72, 0);
        this.LogoTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoTop.addBox(-1.0F, 2.0F, -5.0F, 2, 1, 1, 0.0F);
        this.LogoCentre = new ModelRenderer(this, 70, 4);
        this.LogoCentre.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoCentre.addBox(-2.0F, 3.0F, -5.0F, 4, 4, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
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
