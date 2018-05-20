package github.oaster2000.mcuo.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelKermitSuit extends ModelBiped {
    public ModelRenderer RightArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer Torso;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer Reactor1;
    public ModelRenderer Reactor2;
    public ModelRenderer Reactor3;
    public ModelRenderer Reactor4;
    public ModelRenderer Reactor5;
    public ModelRenderer Reactor6;
    public ModelRenderer Reactor7;
    public ModelRenderer Reactor8;
    public ModelRenderer Reactor9;
    public ModelRenderer Reactor10;
    public ModelRenderer Reactor11;
    public ModelRenderer Reactor12;
    public ModelRenderer Reactor13;
    public ModelRenderer Reactor14;
    public ModelRenderer Reactor15;
    public ModelRenderer Reactor16;
    public ModelRenderer Reactor17;
    public ModelRenderer Reactor18;
    public ModelRenderer Reactor19;
    public ModelRenderer Reactor20;
    public ModelRenderer Reactor21;
    public ModelRenderer Reactor22;
    public ModelRenderer Reactor23;
    public ModelRenderer Reactor24;
    public ModelRenderer Reactor25;

    public ModelKermitSuit(float expand) {
    	super(0, 0, 100, 50);
        this.Reactor25 = new ModelRenderer(this, 28, 35);
        this.Reactor25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor25.addBox(-0.5F, 3.1F, -2.02F, 1, 1, 1, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Reactor23 = new ModelRenderer(this, 25, 35);
        this.Reactor23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor23.addBox(-0.2F, 1.1F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor23, 0.4241150082346221F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Reactor4 = new ModelRenderer(this, 0, 34);
        this.Reactor4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor4.addBox(2.5F, -0.3F, -2.3F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor4, -0.7853981633974483F, 0.0F, 1.5707963267948966F);
        this.Reactor10 = new ModelRenderer(this, 12, 34);
        this.Reactor10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor10.addBox(1.55F, 2.0F, 0.1F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Reactor10, -0.7853981633974483F, 0.0F, 1.0471975511965976F);
        this.Reactor20 = new ModelRenderer(this, 26, 35);
        this.Reactor20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor20.addBox(-3.3F, 1.2F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor20, 0.4241150082346221F, 0.0F, -1.0471975511965976F);
        this.Reactor8 = new ModelRenderer(this, 0, 34);
        this.Reactor8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor8.addBox(-2.65F, 2.8F, 0.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor8, -0.7853981633974483F, 0.0F, -0.7853981633974483F);
        this.Reactor13 = new ModelRenderer(this, 12, 34);
        this.Reactor13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor13.addBox(2.2F, 1.75F, -0.2F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor13, -0.7853981633974483F, 0.0F, 1.0471975511965976F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Reactor19 = new ModelRenderer(this, 25, 35);
        this.Reactor19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor19.addBox(-2.8F, 1.2F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor19, 0.4241150082346221F, 0.0F, -1.0471975511965976F);
        this.Reactor9 = new ModelRenderer(this, 12, 35);
        this.Reactor9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor9.addBox(-1.0F, 2.15F, 0.25F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Reactor9, -0.7853981633974483F, 0.0F, 0.0F);
        this.Reactor18 = new ModelRenderer(this, 27, 35);
        this.Reactor18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor18.addBox(-3.1F, 1.2F, -2.9F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor18, 0.4241150082346221F, 0.0F, -1.0471975511965976F);
        this.Reactor1 = new ModelRenderer(this, 0, 34);
        this.Reactor1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor1.addBox(-0.5F, 1.85F, -0.15F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor1, -0.7853981633974483F, 0.0F, 0.0F);
        this.Reactor3 = new ModelRenderer(this, 0, 34);
        this.Reactor3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor3.addBox(2.5F, 1.3F, -0.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor3, -0.7853981633974483F, 0.0F, 1.5707963267948966F);
        this.Reactor24 = new ModelRenderer(this, 28, 35);
        this.Reactor24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor24.addBox(-1.0F, 2.4F, -2.02F, 2, 1, 1, 0.0F);
        this.Reactor6 = new ModelRenderer(this, 0, 34);
        this.Reactor6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor6.addBox(1.65F, 2.8F, 0.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor6, -0.7853981633974483F, 0.0F, 0.7853981633974483F);
        this.Reactor16 = new ModelRenderer(this, 26, 35);
        this.Reactor16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor16.addBox(2.3F, 1.2F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor16, 0.4241150082346221F, 0.0F, 1.0471975511965976F);
        this.Reactor15 = new ModelRenderer(this, 26, 35);
        this.Reactor15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor15.addBox(2.1F, 1.2F, -2.9F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor15, 0.4241150082346221F, 0.0F, 1.0471975511965976F);
        this.Reactor5 = new ModelRenderer(this, 0, 34);
        this.Reactor5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor5.addBox(1.65F, 1.2F, -0.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor5, -0.7853981633974483F, 0.0F, 0.7853981633974483F);
        this.Reactor14 = new ModelRenderer(this, 11, 34);
        this.Reactor14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor14.addBox(-3.2F, 1.75F, -0.2F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor14, -0.7853981633974483F, 0.0F, -1.0471975511965976F);
        this.Reactor22 = new ModelRenderer(this, 26, 35);
        this.Reactor22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor22.addBox(-0.8F, 1.1F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor22, 0.4241150082346221F, 0.0F, 0.0F);
        this.Torso = new ModelRenderer(this, 16, 16);
        this.Torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Reactor17 = new ModelRenderer(this, 25, 35);
        this.Reactor17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor17.addBox(1.9F, 1.2F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor17, 0.4241150082346221F, 0.0F, 1.0471975511965976F);
        this.Reactor2 = new ModelRenderer(this, 0, 34);
        this.Reactor2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor2.addBox(-0.5F, 3.4F, 1.4F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor2, -0.7853981633974483F, 0.0F, 0.0F);
        this.Reactor7 = new ModelRenderer(this, 0, 34);
        this.Reactor7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor7.addBox(-2.65F, 1.2F, -0.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor7, -0.7853981633974483F, 0.0F, -0.7853981633974483F);
        this.Reactor11 = new ModelRenderer(this, 12, 34);
        this.Reactor11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor11.addBox(-3.55F, 2.0F, 0.1F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Reactor11, -0.7853981633974483F, 0.0F, -1.0471975511965976F);
        this.Reactor21 = new ModelRenderer(this, 26, 35);
        this.Reactor21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor21.addBox(-0.5F, 0.93F, -2.8F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor21, 0.4241150082346221F, 0.0F, 0.0F);
        this.Reactor12 = new ModelRenderer(this, 13, 34);
        this.Reactor12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Reactor12.addBox(-0.5F, 2.5F, 0.55F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Reactor12, -0.7853981633974483F, 0.0F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.bipedBody.addChild(this.Reactor25);
        this.bipedBody.addChild(this.Reactor23);
        this.bipedBody.addChild(this.Reactor4);
        this.bipedBody.addChild(this.Reactor10);
        this.bipedBody.addChild(this.Reactor20);
        this.bipedBody.addChild(this.Reactor8);
        this.bipedBody.addChild(this.Reactor13);
        this.bipedBody.addChild(this.Reactor19);
        this.bipedBody.addChild(this.Reactor9);
        this.bipedBody.addChild(this.Reactor18);
        this.bipedBody.addChild(this.Reactor1);
        this.bipedBody.addChild(this.Reactor3);
        this.bipedBody.addChild(this.Reactor24);
        this.bipedBody.addChild(this.Reactor6);
        this.bipedBody.addChild(this.Reactor16);
        this.bipedBody.addChild(this.Reactor15);
        this.bipedBody.addChild(this.Reactor5);
        this.bipedBody.addChild(this.Reactor14);
        this.bipedBody.addChild(this.Reactor22);
        this.bipedBody.addChild(this.Reactor17);
        this.bipedBody.addChild(this.Reactor2);
        this.bipedBody.addChild(this.Reactor7);
        this.bipedBody.addChild(this.Reactor11);
        this.bipedBody.addChild(this.Reactor21);
        this.bipedBody.addChild(this.Reactor12);
        
        this.bipedRightArm.addChild(RightArm);
        this.bipedLeftArm.addChild(LeftArm);
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
