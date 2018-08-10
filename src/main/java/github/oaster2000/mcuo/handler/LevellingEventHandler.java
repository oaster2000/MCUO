package github.oaster2000.mcuo.handler;

import java.util.Random;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class LevellingEventHandler {

	@SubscribeEvent
	public void onTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		ILevelSystem ls = player.getCapability(CapabilityHandler.LVL_SYS, null);
		int currXP = ls.getExp();
		int currLvl = ls.getLevel();

		if (currLvl < 21) {
			if (currXP >= (4 * currLvl) + 7)
				ls.setLevel(currLvl + 1);
		} else if (currLvl >= 21 && currLvl < 51) {
			if (currXP >= (7 * currLvl))
				ls.setLevel(currLvl + 1);
		} else if (currLvl >= 51) {
			if (currXP >= (40 * currLvl) - 20)
				ls.setLevel(currLvl + 1);
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		Random rand = new Random();
		Entity entity = event.getEntity();
		EntityPlayer player = Minecraft.getMinecraft().player;
		if (player != null) {
			ILevelSystem ls = player.getCapability(CapabilityHandler.LVL_SYS, null);
			DamageSource source = event.getSource();
			if (source.getTrueSource() instanceof EntityPlayer) {
				if (entity instanceof EntityWither || entity instanceof EntityDragon) {
					int xpAdd = (rand.nextInt(20) + 1) * 10;
					ls.setExp(ls.getExp() + xpAdd);
				} else if (entity instanceof EntityPlayer && !(entity.equals(player))) {
					EntityPlayer p2 = (EntityPlayer) entity;
					int xpAdd = (p2.experienceLevel / 4) * (rand.nextInt(2) + 1);
					ls.setExp(ls.getExp() + xpAdd);
				} else {
					int xpAdd = (rand.nextInt(3) + 1) * ((rand.nextInt(2) + 1));
					ls.setExp(ls.getExp() + xpAdd);
				}
			}
		}
	}

}
