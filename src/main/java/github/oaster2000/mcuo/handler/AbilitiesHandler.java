package github.oaster2000.mcuo.handler;

import org.lwjgl.input.Keyboard;

import github.oaster2000.mcuo.abilities.Abilities;
import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.keybindings.Keybinds;
import github.oaster2000.mcuo.missions.Missions;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class AbilitiesHandler {

	boolean pressed = false;

	@SubscribeEvent
	public void onTick(TickEvent.PlayerTickEvent event) {
		int key = Keyboard.getEventKey();
		boolean isDown = Keyboard.getEventKeyState();
		EntityPlayer player = event.player;
		IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
		ILevelSystem ls = player.getCapability(CapabilityHandler.LVL_SYS, null);

		if (isDown && Keyboard.isKeyDown(Keyboard.KEY_SPACE)
				&& !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
				&& Minecraft.getMinecraft().currentScreen == null && Abilities.isFlying) {
			if (Missions.origins.isComplete() && ls.getLevel() > 10) {
				if (mcuo.getPowers() == 1) {
					if (player.motionY > 0.0D) {
						player.motionY += 0.084999999105930327D;
					} else {
						player.motionY += 0.11699999910593033D;
					}

					if (player.motionY <= 0.0D && player.isSneaking() == false) {
						player.motionY /= 1.1499999761581421D;
						player.motionY /= 1.1499999761581421D;
						player.motionY /= 1.1499999761581421D;
					}

					double YPos = player.posY - 0.25;

					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos, player.posZ, 0.0D, -0.5D,
							0.0D);

					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX + 0.05f, YPos, player.posZ, 0.0D,
							-0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX - 0.05f, YPos, player.posZ, 0.0D,
							-0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos + 0.05f, player.posZ, 0.0D,
							-0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos - 0.05f, player.posZ, 0.0D,
							-0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos, player.posZ + 0.05f, 0.0D,
							-0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos, player.posZ - 0.05f, 0.0D,
							-0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX + 0.05f, YPos + 0.05f, player.posZ,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX - 0.05f, YPos - 0.05f, player.posZ,
							0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX + 0.05f, YPos, player.posZ + 0.05f,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX - 0.05f, YPos, player.posZ - 0.05f,
							0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos + 0.05f, player.posZ + 0.05f,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX, YPos - 0.05f, player.posZ - 0.05f,
							0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX + 0.05f, YPos + 0.05f,
							player.posZ + 0.05f, 0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.FLAME, player.posX - 0.05f, YPos - 0.05f,
							player.posZ - 0.05f, 0.0D, -0.5D, 0.0D);

				} else if (mcuo.getPowers() == 2) {
					if (player.motionY > 0.0D) {
						player.motionY += 0.084999999105930327D;
					} else {
						player.motionY += 0.11699999910593033D;
					}

					if (player.motionY <= 0.0D && player.isSneaking() == false) {
						player.motionY /= 1.1499999761581421D;
						player.motionY /= 1.1499999761581421D;
						player.motionY /= 1.1499999761581421D;
					}

					double YPos = player.posY - 0.25;

					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos, player.posZ, 0.0D,
							-0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX + 0.05f, YPos, player.posZ,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX - 0.05f, YPos, player.posZ,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos + 0.05f, player.posZ,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos - 0.05f, player.posZ,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos, player.posZ + 0.05f,
							0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos, player.posZ - 0.05f,
							0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX + 0.05f, YPos + 0.05f,
							player.posZ, 0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX - 0.05f, YPos - 0.05f,
							player.posZ, 0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX + 0.05f, YPos,
							player.posZ + 0.05f, 0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX - 0.05f, YPos,
							player.posZ - 0.05f, 0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos + 0.05f,
							player.posZ + 0.05f, 0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX, YPos - 0.05f,
							player.posZ - 0.05f, 0.0D, -0.5D, 0.0D);

					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX + 0.05f, YPos + 0.05f,
							player.posZ + 0.05f, 0.0D, -0.5D, 0.0D);
					player.world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, player.posX - 0.05f, YPos - 0.05f,
							player.posZ - 0.05f, 0.0D, -0.5D, 0.0D);

				}
			}
		}

		if (isDown && key == Keybinds.ability2.getKeyCode()
				&& !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
				&& Minecraft.getMinecraft().currentScreen == null) {
			if (Abilities.isFlying && !pressed) {
				Abilities.isFlying = false;
				pressed = true;
			} else if (!Abilities.isFlying && !pressed) {
				Abilities.isFlying = true;
				pressed = true;
			}
		} else {
			pressed = false;
		}

		if (isDown && key == Keybinds.ability3.getKeyCode()
				&& !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
				&& Minecraft.getMinecraft().currentScreen == null) {
			if (!Abilities.isStrong) {
				Abilities.isStrong = true;
			}
		} else if (!player.isPotionActive(MobEffects.STRENGTH)) {
			Abilities.isStrong = false;
		}
	}

	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			if (event.getSource().damageType.equals("fall") && Abilities.isFlying) {
				event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent
	public void onLivingAttackEvent(AttackEntityEvent event) {
		if (Abilities.isStrong) {
			EntityPlayer player = event.getEntityPlayer();
			IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
			if (mcuo.getPowers() == 1) {
				event.getEntityLiving().setFire(25);
			}
			if (mcuo.getPowers() == 2) {
				event.getEntityLiving().addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 600, 5));
			}
		}
	}

}
