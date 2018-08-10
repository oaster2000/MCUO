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
public class ModelOwenSuit extends ModelBiped {
    public ModelRenderer LogoTop;
    public ModelRenderer LogoCentre;
    public ModelRenderer LogoLeft;
    public ModelRenderer LogoBottom;
    public ModelRenderer LogoRight;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer cape;
    public ModelRenderer WristBandR4;
    public ModelRenderer WristBandR3;
    public ModelRenderer WristBandR2;
    public ModelRenderer WristBandR1;
    public ModelRenderer ShoulderR;
    public ModelRenderer RightSleeve1;
    public ModelRenderer RightSleeve2;
    public ModelRenderer RightSleeve3;
    public ModelRenderer ShoulderL;
    public ModelRenderer WristBandL1;
    public ModelRenderer WristBandL2;
    public ModelRenderer WristBandL3;
    public ModelRenderer WristBandL4;
    public ModelRenderer LeftSleeve1;
    public ModelRenderer LeftSleeve2;
    public ModelRenderer LeftSleeve3;
    public ModelRenderer LeftSleeve4;
    public ModelRenderer Mask1;
    public ModelRenderer Mask2;
    public ModelRenderer Mask3;
    public ModelRenderer Mask4;
    public ModelRenderer Mask5;
    public ModelRenderer Mask6;
    public ModelRenderer Mask8;
    public ModelRenderer Mask9;
    public ModelRenderer Mask10;
    public ModelRenderer Mask7;
    public ModelRenderer Mask11;
    public ModelRenderer Mask12;
    public ModelRenderer Mask13;
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
    public ModelRenderer Belt1;
    public ModelRenderer Belt2;
    public ModelRenderer Belt3;
    public ModelRenderer Belt4;
    public ModelRenderer Leg1R;
    public ModelRenderer Knee1R;
    public ModelRenderer Knee2R;
    public ModelRenderer Knee3R;
    public ModelRenderer Knee4R;
    public ModelRenderer Knee5R;
    public ModelRenderer Boot1R;
    public ModelRenderer Leg2R;
    public ModelRenderer Knee6R;
    public ModelRenderer Leg3R;
    public ModelRenderer Boot2R;
    public ModelRenderer Leg4R;
    public ModelRenderer Boot3R;
    public ModelRenderer Boot4R;
    public ModelRenderer Knee2L;
    public ModelRenderer Knee1L;
    public ModelRenderer Knee3L;
    public ModelRenderer Knee4L;
    public ModelRenderer Knee5L;
    public ModelRenderer Knee6L;
    public ModelRenderer Leg1L;
    public ModelRenderer Leg2L;
    public ModelRenderer Leg3L;
    public ModelRenderer Leg4L;
    public ModelRenderer Boot1L;
    public ModelRenderer Boot3L;
    public ModelRenderer Boot2L;
    public ModelRenderer Boot4L;

    public ModelOwenSuit(float expand) {
		super(expand, 0, 128, 64);
        this.WristBandL1 = new ModelRenderer(this, 56, 50);
        this.WristBandL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL1.addBox(-3.0F, 5.0F, -2.2F, 4, 1, 1, 0.0F);
        this.WristBandR2 = new ModelRenderer(this, 56, 50);
        this.WristBandR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR2.addBox(2.2F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
        this.Boot3L = new ModelRenderer(this, 56, 50);
        this.Boot3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot3L.addBox(1.2F, 9.0F, -2.0F, 1, 3, 4, 0.0F);
        this.WristBandR3 = new ModelRenderer(this, 56, 50);
        this.WristBandR3.mirror = true;
        this.WristBandR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR3.addBox(-1.0F, 5.0F, 1.2F, 4, 1, 1, 0.0F);
        this.Torso9 = new ModelRenderer(this, 70, 29);
        this.Torso9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso9.addBox(3.2F, 0.0F, -2.0F, 1, 12, 4, 0.0F);
        this.Leg2R = new ModelRenderer(this, 58, 31);
        this.Leg2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2R.addBox(-2.0F, 0.0F, 1.1F, 4, 9, 1, 0.0F);
        this.LeftSleeve3 = new ModelRenderer(this, 57, 35);
        this.LeftSleeve3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftSleeve3.addBox(-3.0F, -2.0F, 1.2F, 4, 5, 1, 0.0F);
        this.WristBandL2 = new ModelRenderer(this, 56, 50);
        this.WristBandL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL2.addBox(-3.2F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
        this.RightSleeve3 = new ModelRenderer(this, 57, 35);
        this.RightSleeve3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightSleeve3.addBox(-1.0F, -2.0F, 1.2F, 4, 5, 1, 0.0F);
        this.Torso10 = new ModelRenderer(this, 71, 28);
        this.Torso10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso10.addBox(-4.2F, 0.0F, -2.0F, 1, 12, 4, 0.0F);
        this.Mask1 = new ModelRenderer(this, 56, 46);
        this.Mask1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask1.addBox(-4.8F, -4.8F, -4.2F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Mask1, 0.0F, 0.0F, 0.18203784098300857F);
        this.ShoulderL = new ModelRenderer(this, 64, 15);
        this.ShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL.addBox(-4.0F, -3.0F, -2.5F, 5, 5, 5, 0.0F);
        this.LeftSleeve1 = new ModelRenderer(this, 57, 35);
        this.LeftSleeve1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftSleeve1.addBox(-3.0F, -2.0F, -2.2F, 4, 5, 1, 0.0F);
        this.Mask6 = new ModelRenderer(this, 60, 56);
        this.Mask6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask6.addBox(-4.0F, -5.0F, -4.2F, 1, 3, 1, 0.0F);
        this.cape = new ModelRenderer(this, 96, 38);
        this.cape.addBox(-9F, 0F, 2F, 18, 23, 0);
        this.cape.setRotationPoint(0F, 0F, 0F);
        setRotateAngle(cape, 0.122173F, 0F, 0F);
        this.Torso2 = new ModelRenderer(this, 64, 40);
        this.Torso2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso2.addBox(-2.0F, 1.0F, -2.2F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Torso2, 0.0F, 0.0F, 0.5009094953223726F);
        this.Belt2 = new ModelRenderer(this, 59, 48);
        this.Belt2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt2.addBox(-4.0F, 10.0F, 1.3F, 8, 1, 1, 0.0F);
        this.Leg4L = new ModelRenderer(this, 58, 31);
        this.Leg4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg4L.addBox(-2.1F, 0.0F, -2.0F, 1, 9, 4, 0.0F);
        this.Knee2R = new ModelRenderer(this, 58, 46);
        this.Knee2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee2R.addBox(-1.0F, 3.0F, -2.2F, 2, 1, 1, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Boot4R = new ModelRenderer(this, 56, 50);
        this.Boot4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot4R.addBox(-2.2F, 9.0F, -2.0F, 1, 3, 4, 0.0F);
        this.LogoLeft = new ModelRenderer(this, 64, 4);
        this.LogoLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoLeft.addBox(-3.0F, 4.0F, -5.0F, 1, 2, 1, 0.0F);
        this.Mask7 = new ModelRenderer(this, 60, 56);
        this.Mask7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask7.addBox(-1.0F, -4.8F, -4.1F, 2, 3, 1, 0.0F);
        this.Boot2L = new ModelRenderer(this, 56, 50);
        this.Boot2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot2L.addBox(-2.0F, 9.0F, 1.2F, 4, 3, 1, 0.0F);
        this.Leg2L = new ModelRenderer(this, 58, 31);
        this.Leg2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2L.addBox(-2.0F, 0.0F, 1.1F, 4, 9, 1, 0.0F);
        this.Knee3R = new ModelRenderer(this, 58, 48);
        this.Knee3R.mirror = true;
        this.Knee3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee3R.addBox(-1.9F, 3.0F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee3R, 0.0F, 0.0F, -0.5918411493512771F);
        this.Leg4R = new ModelRenderer(this, 58, 31);
        this.Leg4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg4R.addBox(-2.1F, 0.0F, -2.0F, 1, 9, 4, 0.0F);
        this.Mask3 = new ModelRenderer(this, 64, 46);
        this.Mask3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask3.addBox(-3.6F, -2.7F, -4.2F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Mask3, 0.0F, 0.0F, -0.18203784098300857F);
        this.Mask8 = new ModelRenderer(this, 69, 56);
        this.Mask8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask8.addBox(1.0F, -3.0F, -4.1F, 2, 1, 1, 0.0F);
        this.LogoRight = new ModelRenderer(this, 82, 5);
        this.LogoRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoRight.addBox(2.0F, 4.0F, -5.0F, 1, 2, 1, 0.0F);
        this.Knee3L = new ModelRenderer(this, 58, 48);
        this.Knee3L.mirror = true;
        this.Knee3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee3L.addBox(-1.9F, 3.0F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee3L, 0.0F, 0.0F, -0.5918411493512771F);
        this.LeftSleeve2 = new ModelRenderer(this, 57, 35);
        this.LeftSleeve2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftSleeve2.addBox(-3.2F, -2.0F, -2.0F, 1, 5, 4, 0.0F);
        this.ShoulderR = new ModelRenderer(this, 64, 15);
        this.ShoulderR.mirror = true;
        this.ShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR.addBox(-1.0F, -3.0F, -2.5F, 5, 5, 5, 0.0F);
        this.WristBandL3 = new ModelRenderer(this, 56, 50);
        this.WristBandL3.mirror = true;
        this.WristBandL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL3.addBox(-3.0F, 5.0F, 1.2F, 4, 1, 1, 0.0F);
        this.Leg1L = new ModelRenderer(this, 58, 31);
        this.Leg1L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg1L.addBox(-2.0F, 0.0F, -2.1F, 4, 9, 1, 0.0F);
        this.Torso1 = new ModelRenderer(this, 64, 33);
        this.Torso1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso1.addBox(-4.0F, 2.0F, -2.2F, 8, 10, 1, 0.0F);
        this.Torso7 = new ModelRenderer(this, 64, 40);
        this.Torso7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso7.addBox(-2.0F, 1.0F, -2.2F, 1, 1, 1, 0.0F);
        this.Torso11 = new ModelRenderer(this, 64, 30);
        this.Torso11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso11.addBox(-4.0F, 0.0F, 1.2F, 8, 12, 1, 0.0F);
        this.Leg3L = new ModelRenderer(this, 58, 31);
        this.Leg3L.setRotationPoint(1.1F, 0.0F, -2.0F);
        this.Leg3L.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        this.WristBandR4 = new ModelRenderer(this, 56, 50);
        this.WristBandR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR4.addBox(-1.2F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
        this.RightSleeve2 = new ModelRenderer(this, 57, 35);
        this.RightSleeve2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightSleeve2.addBox(2.2F, -2.0F, -2.0F, 1, 5, 4, 0.0F);
        this.LogoCentre = new ModelRenderer(this, 70, 4);
        this.LogoCentre.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoCentre.addBox(-2.0F, 3.0F, -5.0F, 4, 4, 1, 0.0F);
        this.Torso3 = new ModelRenderer(this, 64, 40);
        this.Torso3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso3.addBox(-1.0F, 1.0F, -2.2F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Torso3, 0.0F, 0.0F, -0.5009094953223726F);
        this.LogoBottom = new ModelRenderer(this, 72, 11);
        this.LogoBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoBottom.addBox(-1.0F, 7.0F, -5.0F, 2, 1, 1, 0.0F);
        this.Knee6R = new ModelRenderer(this, 58, 49);
        this.Knee6R.mirror = true;
        this.Knee6R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee6R.addBox(3.4F, 2.8F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee6R, 0.0F, 0.0F, 0.5918411493512771F);
        this.Leg3R = new ModelRenderer(this, 58, 31);
        this.Leg3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3R.addBox(1.1F, 0.0F, -2.0F, 1, 9, 4, 0.0F);
        this.Knee5R = new ModelRenderer(this, 58, 48);
        this.Knee5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee5R.addBox(-1.0F, 5.5F, -2.2F, 2, 1, 1, 0.0F);
        this.WristBandL4 = new ModelRenderer(this, 56, 50);
        this.WristBandL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandL4.addBox(0.2F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
        this.Mask12 = new ModelRenderer(this, 60, 56);
        this.Mask12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask12.addBox(3.2F, -5.5F, -4.0F, 1, 4, 1, 0.0F);
        this.Torso6 = new ModelRenderer(this, 64, 40);
        this.Torso6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso6.addBox(1.0F, 1.0F, -2.2F, 1, 1, 1, 0.0F);
        this.Torso8 = new ModelRenderer(this, 64, 40);
        this.Torso8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso8.addBox(-1.0F, 1.3F, -2.2F, 2, 1, 1, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Mask5 = new ModelRenderer(this, 60, 56);
        this.Mask5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask5.addBox(3.0F, -5.0F, -4.2F, 1, 3, 1, 0.0F);
        this.Torso5 = new ModelRenderer(this, 64, 40);
        this.Torso5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso5.addBox(2.0F, 0.0F, -2.2F, 2, 2, 1, 0.0F);
        this.Knee4L = new ModelRenderer(this, 58, 47);
        this.Knee4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee4L.addBox(-4.5F, 2.9F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee4L, 0.0F, 0.0F, -0.5918411493512771F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Knee1R = new ModelRenderer(this, 58, 46);
        this.Knee1R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee1R.addBox(0.9F, 3.1F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee1R, 0.0F, 0.0F, 0.5918411493512771F);
        this.Knee2L = new ModelRenderer(this, 58, 46);
        this.Knee2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee2L.addBox(-1.0F, 3.0F, -2.2F, 2, 1, 1, 0.0F);
        this.Knee1L = new ModelRenderer(this, 58, 46);
        this.Knee1L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee1L.addBox(0.9F, 3.1F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee1L, 0.0F, 0.0F, 0.5918411493512771F);
        this.Belt4 = new ModelRenderer(this, 59, 48);
        this.Belt4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt4.addBox(-4.3F, 10.0F, -2.0F, 1, 1, 4, 0.0F);
        this.Leg1R = new ModelRenderer(this, 58, 31);
        this.Leg1R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg1R.addBox(-2.0F, 0.0F, -2.1F, 4, 9, 1, 0.0F);
        this.Mask10 = new ModelRenderer(this, 69, 56);
        this.Mask10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask10.addBox(-3.0F, -3.0F, -4.2F, 2, 1, 1, 0.0F);
        this.Knee4R = new ModelRenderer(this, 58, 47);
        this.Knee4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee4R.addBox(-4.5F, 2.9F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee4R, 0.0F, 0.0F, -0.5918411493512771F);
        this.Knee5L = new ModelRenderer(this, 58, 48);
        this.Knee5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee5L.addBox(-1.0F, 5.5F, -2.2F, 2, 1, 1, 0.0F);
        this.LeftSleeve4 = new ModelRenderer(this, 57, 35);
        this.LeftSleeve4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftSleeve4.addBox(0.3F, -2.0F, -2.0F, 1, 5, 4, 0.0F);
        this.Boot1R = new ModelRenderer(this, 56, 50);
        this.Boot1R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot1R.addBox(-2.0F, 9.0F, -2.3F, 4, 3, 1, 0.0F);
        this.Boot3R = new ModelRenderer(this, 56, 50);
        this.Boot3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot3R.addBox(1.2F, 9.0F, -2.0F, 1, 3, 4, 0.0F);
        this.Boot1L = new ModelRenderer(this, 56, 50);
        this.Boot1L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot1L.addBox(-2.0F, 9.0F, -2.2F, 4, 3, 1, 0.0F);
        this.Knee6L = new ModelRenderer(this, 58, 49);
        this.Knee6L.mirror = true;
        this.Knee6L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Knee6L.addBox(3.4F, 2.8F, -2.2F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Knee6L, 0.0F, 0.0F, 0.5918411493512771F);
        this.Belt3 = new ModelRenderer(this, 59, 48);
        this.Belt3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt3.addBox(3.3F, 10.0F, -2.0F, 1, 1, 4, 0.0F);
        this.WristBandR1 = new ModelRenderer(this, 56, 50);
        this.WristBandR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WristBandR1.addBox(-1.0F, 5.0F, -2.2F, 4, 1, 1, 0.0F);
        this.Belt1 = new ModelRenderer(this, 59, 48);
        this.Belt1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt1.addBox(-4.0F, 10.0F, -2.3F, 8, 1, 1, 0.0F);
        this.Boot4L = new ModelRenderer(this, 56, 50);
        this.Boot4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot4L.addBox(1.2F, 9.0F, -2.0F, 1, 3, 4, 0.0F);
        this.RightSleeve1 = new ModelRenderer(this, 57, 35);
        this.RightSleeve1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightSleeve1.addBox(-1.0F, -2.0F, -2.2F, 4, 5, 1, 0.0F);
        this.Torso4 = new ModelRenderer(this, 64, 40);
        this.Torso4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso4.addBox(-4.0F, 0.0F, -2.2F, 2, 2, 1, 0.0F);
        this.Mask4 = new ModelRenderer(this, 70, 46);
        this.Mask4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask4.addBox(-0.4F, -2.7F, -4.2F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Mask4, 0.0F, 0.0F, 0.18203784098300857F);
        this.LogoTop = new ModelRenderer(this, 72, 0);
        this.LogoTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LogoTop.addBox(-1.0F, 2.0F, -5.0F, 2, 1, 1, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Mask2 = new ModelRenderer(this, 70, 46);
        this.Mask2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask2.addBox(0.8F, -4.8F, -4.2F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Mask2, 0.0F, 0.0F, -0.18203784098300857F);
        this.Mask9 = new ModelRenderer(this, 69, 56);
        this.Mask9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask9.addBox(1.0F, -5.0F, -4.1F, 2, 1, 1, 0.0F);
        this.Boot2R = new ModelRenderer(this, 56, 50);
        this.Boot2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Boot2R.addBox(-2.0F, 9.0F, 1.2F, 4, 3, 1, 0.0F);
        this.Mask13 = new ModelRenderer(this, 60, 56);
        this.Mask13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask13.addBox(-4.2F, -5.5F, -4.0F, 1, 4, 1, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Mask11 = new ModelRenderer(this, 69, 56);
        this.Mask11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask11.addBox(-3.0F, -5.0F, -4.1F, 2, 1, 1, 0.0F);
        
        this.bipedLeftArm.addChild(WristBandR1);
        this.bipedLeftArm.addChild(WristBandR2);
        this.bipedLeftArm.addChild(WristBandR3);
        this.bipedLeftArm.addChild(WristBandR4);
        this.bipedLeftArm.addChild(ShoulderR);
        this.bipedLeftArm.addChild(this.RightSleeve1);
        this.bipedLeftArm.addChild(this.RightSleeve2);
        this.bipedLeftArm.addChild(this.RightSleeve3);
        
        this.bipedRightArm.addChild(WristBandL1);
        this.bipedRightArm.addChild(WristBandL2);
        this.bipedRightArm.addChild(WristBandL3);
        this.bipedRightArm.addChild(WristBandL4);
        this.bipedRightArm.addChild(ShoulderL);
        this.bipedRightArm.addChild(this.LeftSleeve3);
        this.bipedRightArm.addChild(this.LeftSleeve2);
        this.bipedRightArm.addChild(this.LeftSleeve4);
        this.bipedRightArm.addChild(this.LeftSleeve1);
        
        this.bipedBody.addChild(this.Torso5);
        this.bipedBody.addChild(this.Torso4);
        this.bipedBody.addChild(this.Torso8);
        this.bipedBody.addChild(this.Torso11);
        this.bipedBody.addChild(this.Torso2);
        this.bipedBody.addChild(this.Torso3);
        this.bipedBody.addChild(this.Torso10);
        this.bipedBody.addChild(this.Torso7);
        this.bipedBody.addChild(this.Torso6);
        this.bipedBody.addChild(this.Torso1);
        this.bipedBody.addChild(this.Torso9);
        this.bipedBody.addChild(Belt1);
        this.bipedBody.addChild(Belt2);
        this.bipedBody.addChild(Belt3);
        this.bipedBody.addChild(Belt4);
        this.bipedBody.addChild(this.cape);
        
        this.bipedLeftLeg.addChild(Boot1L);
        this.bipedLeftLeg.addChild(Boot2L);
        this.bipedLeftLeg.addChild(Boot3L);
        this.bipedLeftLeg.addChild(Boot4L);
        this.bipedLeftLeg.addChild(Leg1L);
        this.bipedLeftLeg.addChild(Leg2L);
        this.bipedLeftLeg.addChild(Leg3L);
        this.bipedLeftLeg.addChild(Leg4L);
        this.bipedLeftLeg.addChild(Knee1L);
        this.bipedLeftLeg.addChild(Knee2L);
        this.bipedLeftLeg.addChild(Knee3L);
        this.bipedLeftLeg.addChild(Knee4L);
        this.bipedLeftLeg.addChild(Knee5L);
        this.bipedLeftLeg.addChild(Knee6L);
        
        this.bipedRightLeg.addChild(Boot1R);
        this.bipedRightLeg.addChild(Boot2R);
        this.bipedRightLeg.addChild(Boot3R);
        this.bipedRightLeg.addChild(Boot4R);
        this.bipedRightLeg.addChild(Leg1R);
        this.bipedRightLeg.addChild(Leg2R);
        this.bipedRightLeg.addChild(Leg3R);
        this.bipedRightLeg.addChild(Leg4R);
        this.bipedRightLeg.addChild(Knee1R);
        this.bipedRightLeg.addChild(Knee2R);
        this.bipedRightLeg.addChild(Knee3R);
        this.bipedRightLeg.addChild(Knee4R);
        this.bipedRightLeg.addChild(Knee5R);
        this.bipedRightLeg.addChild(Knee6R);
        
        this.bipedHead.addChild(Mask1);
        this.bipedHead.addChild(Mask2);
        this.bipedHead.addChild(Mask3);
        this.bipedHead.addChild(Mask4);
        this.bipedHead.addChild(Mask5);
        this.bipedHead.addChild(Mask6);
        this.bipedHead.addChild(Mask7);
        this.bipedHead.addChild(Mask8);
        this.bipedHead.addChild(Mask9);
        this.bipedHead.addChild(Mask10);
        this.bipedHead.addChild(Mask11);
        this.bipedHead.addChild(Mask12);
        this.bipedHead.addChild(Mask13);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.LogoRight.offsetX, this.LogoRight.offsetY, this.LogoRight.offsetZ);
        GlStateManager.translate(this.LogoRight.rotationPointX * f5, this.LogoRight.rotationPointY * f5, this.LogoRight.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoRight.offsetX, -this.LogoRight.offsetY, -this.LogoRight.offsetZ);
        GlStateManager.translate(-this.LogoRight.rotationPointX * f5, -this.LogoRight.rotationPointY * f5, -this.LogoRight.rotationPointZ * f5);
        this.LogoRight.render(f5);
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
        GlStateManager.translate(this.LogoTop.offsetX, this.LogoTop.offsetY, this.LogoTop.offsetZ);
        GlStateManager.translate(this.LogoTop.rotationPointX * f5, this.LogoTop.rotationPointY * f5, this.LogoTop.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoTop.offsetX, -this.LogoTop.offsetY, -this.LogoTop.offsetZ);
        GlStateManager.translate(-this.LogoTop.rotationPointX * f5, -this.LogoTop.rotationPointY * f5, -this.LogoTop.rotationPointZ * f5);
        this.LogoTop.render(f5);
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
        GlStateManager.translate(this.LogoCentre.offsetX, this.LogoCentre.offsetY, this.LogoCentre.offsetZ);
        GlStateManager.translate(this.LogoCentre.rotationPointX * f5, this.LogoCentre.rotationPointY * f5, this.LogoCentre.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.5D);
        GlStateManager.translate(-this.LogoCentre.offsetX, -this.LogoCentre.offsetY, -this.LogoCentre.offsetZ);
        GlStateManager.translate(-this.LogoCentre.rotationPointX * f5, -this.LogoCentre.rotationPointY * f5, -this.LogoCentre.rotationPointZ * f5);
        this.LogoCentre.render(f5);
        GlStateManager.popMatrix();
    }
    
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
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}