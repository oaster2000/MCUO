package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelTorso1 - oaster2000
 * Created using Tabula 7.0.0
 */
public class ModelTorso1 extends ModelBiped {
    public ModelRenderer RightArm;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer Torso1;
    public ModelRenderer Torso2;
    public ModelRenderer Torso3;
    public ModelRenderer Torso4;
    public ModelRenderer Torso5;
    public ModelRenderer Torso6;
    public ModelRenderer Torso7;
    public ModelRenderer Torso8;
    public ModelRenderer Torso9;
    public ModelRenderer Torso10;
    public ModelRenderer Torso11;
    public ModelRenderer Torso12;
    public ModelRenderer Torso13;
    public ModelRenderer Torso15;
    public ModelRenderer Torso16;
    public ModelRenderer Torso14;
    public ModelRenderer Torso17;

    public ModelTorso1(float expand) {
		super(expand, 0, 96, 64);
        this.Torso5 = new ModelRenderer(this, 56, 50);
        this.Torso5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso5.addBox(2.0F, 0.0F, -2.2F, 2, 2, 1, 0.0F);
        this.Torso9 = new ModelRenderer(this, 56, 47);
        this.Torso9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso9.addBox(3.2F, 0.0F, -2.0F, 1, 12, 4, 0.0F);
        this.Torso12 = new ModelRenderer(this, 65, 35);
        this.Torso12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso12.addBox(3.0F, 6.9F, -2.3F, 1, 1, 1, 0.0F);
        this.Torso17 = new ModelRenderer(this, 56, 43);
        this.Torso17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso17.addBox(-4.0F, 0.0F, 1.2F, 8, 12, 1, 0.0F);
        this.Torso15 = new ModelRenderer(this, 65, 35);
        this.Torso15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso15.addBox(3.0F, 0.0F, -2.3F, 1, 1, 1, 0.0F);
        this.Torso11 = new ModelRenderer(this, 65, 35);
        this.Torso11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso11.addBox(-4.0F, 0.0F, -2.3F, 1, 1, 1, 0.0F);
        this.Torso3 = new ModelRenderer(this, 56, 50);
        this.Torso3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso3.addBox(-4.0F, 2.0F, -2.2F, 8, 10, 1, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Torso13 = new ModelRenderer(this, 65, 35);
        this.Torso13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso13.addBox(-8.0F, 2.3F, -2.3F, 10, 1, 1, 0.0F);
        this.setRotateAngle(Torso13, 0.0F, 0.0F, -0.7853981633974483F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Torso4 = new ModelRenderer(this, 56, 50);
        this.Torso4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso4.addBox(-4.0F, 0.0F, -2.2F, 2, 2, 1, 0.0F);
        this.Torso6 = new ModelRenderer(this, 56, 50);
        this.Torso6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso6.addBox(1.0F, 1.0F, -2.2F, 1, 1, 1, 0.0F);
        this.Torso10 = new ModelRenderer(this, 65, 35);
        this.Torso10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso10.addBox(-2.0F, 2.3F, -2.3F, 10, 1, 1, 0.0F);
        this.setRotateAngle(Torso10, 0.0F, 0.0F, 0.7853981633974483F);
        this.Torso14 = new ModelRenderer(this, 65, 35);
        this.Torso14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso14.addBox(-4.0F, 6.9F, -2.3F, 1, 1, 1, 0.0F);
        this.Torso2 = new ModelRenderer(this, 56, 50);
        this.Torso2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso2.addBox(-1.0F, 1.0F, -2.2F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Torso2, 0.0F, 0.0F, -0.5009094953223726F);
        this.Torso1 = new ModelRenderer(this, 56, 50);
        this.Torso1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso1.addBox(-2.0F, 1.0F, -2.2F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Torso1, 0.0F, 0.0F, 0.5009094953223726F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Torso8 = new ModelRenderer(this, 56, 50);
        this.Torso8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso8.addBox(-1.0F, 1.5F, -2.2F, 2, 1, 1, 0.0F);
        this.Torso16 = new ModelRenderer(this, 56, 45);
        this.Torso16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso16.addBox(-4.2F, 0.0F, -2.0F, 1, 12, 4, 0.0F);
        this.Torso7 = new ModelRenderer(this, 56, 50);
        this.Torso7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso7.addBox(-2.0F, 1.0F, -2.2F, 1, 1, 1, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.bipedBody.addChild(this.Torso5);
        this.bipedBody.addChild(this.Torso9);
        this.bipedBody.addChild(this.Torso12);
        this.bipedBody.addChild(this.Torso17);
        this.bipedBody.addChild(this.Torso15);
        this.bipedBody.addChild(this.Torso11);
        this.bipedBody.addChild(this.Torso3);
        this.bipedBody.addChild(this.Torso13);
        this.bipedBody.addChild(this.Torso4);
        this.bipedBody.addChild(this.Torso6);
        this.bipedBody.addChild(this.Torso10);
        this.bipedBody.addChild(this.Torso14);
        this.bipedBody.addChild(this.Torso2);
        this.bipedBody.addChild(this.Torso1);
        this.bipedBody.addChild(this.Torso8);
        this.bipedBody.addChild(this.Torso16);
        this.bipedBody.addChild(this.Torso7);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
