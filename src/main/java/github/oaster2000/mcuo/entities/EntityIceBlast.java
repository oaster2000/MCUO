package github.oaster2000.mcuo.entities;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityIceBlast extends EntityThrowable implements IEntityAdditionalSpawnData {
	public Entity shootingEntity;
	private float damage = 10.0F;
	private int breakingTime;
	private int prevBreakingTime;
	private int field_75358_j = -1;

	public EntityIceBlast(World par1World) {
		super(par1World);
		this.ignoreFrustumCheck = true;
		this.setEntityBoundingBox(new AxisAlignedBB(this.getPosition()));
	}

	public EntityIceBlast(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
		this.shootingEntity = par2EntityLivingBase;
		this.ignoreFrustumCheck = true;
		this.setEntityBoundingBox(new AxisAlignedBB(this.getPosition()));
	}

	public EntityIceBlast(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
		this.ignoreFrustumCheck = true;
		this.setEntityBoundingBox(new AxisAlignedBB(this.getPosition()));
	}

	protected float func_70182_d() {
		return 4.0F;
	}

	protected float getGravityVelocity() {
		return 0.0F;
	}

	protected void onImpact(RayTraceResult hitPos) {
		if (!this.world.isRemote) {
			if (this.shootingEntity != null) {
				if (hitPos.entityHit != null) {
					if ((hitPos.entityHit instanceof EntityLivingBase)) {
						((EntityLivingBase) hitPos.entityHit).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 200, 10));
						hitPos.entityHit.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)shootingEntity), 0.5f);
					}
				}
			}
			setDead();
		}

		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.1f, 0.1f, 0.1f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY + 0.1f, this.posZ, 0.0f, -0.1f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY - 0.1f, this.posZ, 0.0f, 0.1f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX + 0.1f, this.posY, this.posZ, -0.1f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX - 0.1f, this.posY, this.posZ, 0.1f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ + 0.1f, 0.0f, 0.0f, -0.1f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ - 0.1f, 0.0f, 0.0f, 0.1f);
	}

	public void onUpdate() {
		super.onUpdate();
		if (this.ticksExisted >= 100) {
			setDead();
		}
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY + 0.1f, this.posZ, 0.0f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY - 0.1f, this.posZ, 0.0f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX + 0.1f, this.posY, this.posZ, 0.0f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX - 0.1f, this.posY, this.posZ, 0.0f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ + 0.1f, 0.0f, 0.0f, 0.0f);
		world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ - 0.1f, 0.0f, 0.0f, 0.0f);
	}

	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeInt(this.shootingEntity != null ? this.shootingEntity.getEntityId() : -1);
	}

	public void readSpawnData(ByteBuf buffer) {
		Entity shooter = this.world.getEntityByID(buffer.readInt());
		if ((shooter instanceof EntityLivingBase)) {
			this.shootingEntity = ((EntityLivingBase) shooter);
		}
	}
}
