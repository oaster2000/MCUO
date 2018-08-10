package github.oaster2000.mcuo.handler;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.missions.MissionsServerSyncMessage;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.missions.Missions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class EventMissionsHandler {
	
	@SubscribeEvent
	public void onDeath(LivingDeathEvent event) {
		if(event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
			IMissions missions = player.getCapability(CapabilityHandler.MISSIONS, null);
			if(event.getSource().damageType.equals("magic")) {
				event.setCanceled(true);
				player.setHealth(10.0f);
				Missions.origins.setComplete(true);
				if(missions.getCurrentMissionID() == 0) {
					if(mcuo.getType() == 0) {
						missions.setCurrentMissionID(1);
						MCUO.NETWORK.sendToAll(new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(), missions.getVillainKillCount(), missions.getCurrentMissionID()));
					} else if(mcuo.getType() == 1) {
						missions.setCurrentMissionID(2);
						MCUO.NETWORK.sendToAll(new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(), missions.getVillainKillCount(), missions.getCurrentMissionID()));
					} else if(mcuo.getType() == 2) {
						missions.setCurrentMissionID(3);
						MCUO.NETWORK.sendToAll(new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(), missions.getVillainKillCount(), missions.getCurrentMissionID()));
					}
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event) 
	{
		if(event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			if(event.getSource().damageType.equals("lightningBolt")) {
				Missions.origins.setComplete(true);
			}
		}
	}
}
