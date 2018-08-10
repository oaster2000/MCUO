package github.oaster2000.mcuo.capability;

import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.render.IMCUO;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@Mod.EventBusSubscriber
public class CapabilityEventHandler {

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
		if (!(event.getObject() instanceof EntityPlayer))
			return;
		IMCUO mcuo = CapabilityHandler.MCUO.getDefaultInstance();
		ILevelSystem ls = CapabilityHandler.LVL_SYS.getDefaultInstance();
		IMissions missions = CapabilityHandler.MISSIONS.getDefaultInstance();
		event.addCapability(mcuo.getKey(), mcuo.getProvider());
		event.addCapability(ls.getKey(), ls.getProvider());
		event.addCapability(missions.getKey(), missions.getProvider());
	}

	@SubscribeEvent
	public void onJoin(PlayerLoggedInEvent event) {
		if (event.player instanceof EntityPlayerMP) {
			IMCUO mcuo = event.player.getCapability(CapabilityHandler.MCUO, null);
			ILevelSystem ls = event.player.getCapability(CapabilityHandler.LVL_SYS, null);
			IMissions missions = event.player.getCapability(CapabilityHandler.MISSIONS, null);
			if (mcuo != null && mcuo.hasCreatedCharacter()) 
				mcuo.dataChanged((EntityPlayerMP) event.player);
			if (ls != null && ls.getExp() > 0) 
				ls.dataChanged((EntityPlayerMP) event.player);
			if (missions != null && missions.getCurrentMissionID() > 0)
				missions.dataChanged((EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onDeath(PlayerEvent.Clone event) {
		if (event.isWasDeath()) {
			IMCUO mcuo = event.getOriginal().getCapability(CapabilityHandler.MCUO, null);
			IMCUO newmcuo = event.getEntityPlayer().getCapability(CapabilityHandler.MCUO, null);

			ILevelSystem ls = event.getOriginal().getCapability(CapabilityHandler.LVL_SYS, null);
			ILevelSystem newls = event.getEntityPlayer().getCapability(CapabilityHandler.LVL_SYS, null);

			IMissions missions = event.getOriginal().getCapability(CapabilityHandler.MISSIONS, null);
			IMissions newMissions = event.getEntityPlayer().getCapability(CapabilityHandler.MISSIONS, null);

			EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();
			newmcuo.setHelmColorR(mcuo.getHelmColorR());
			newmcuo.setHelmColorG(mcuo.getHelmColorG());
			newmcuo.setHelmColorB(mcuo.getHelmColorB());
			newmcuo.setHelmType(mcuo.getHelmType());
			newmcuo.setTorsoColorR(mcuo.getTorsoColorR());
			newmcuo.setTorsoColorG(mcuo.getTorsoColorG());
			newmcuo.setTorsoColorB(mcuo.getTorsoColorB());
			newmcuo.setTorsoType(mcuo.getTorsoType());
			newmcuo.setCapeColorR(mcuo.getCapeColorR());
			newmcuo.setCapeColorG(mcuo.getCapeColorG());
			newmcuo.setCapeColorB(mcuo.getCapeColorB());
			newmcuo.setCapeType(mcuo.getCapeType());
			newmcuo.setType(mcuo.getType());
			newmcuo.setCreatedCharacter(mcuo.hasCreatedCharacter());
			newmcuo.dataChanged(player);

			newls.setLevel(ls.getLevel());
			newls.setExp(ls.getExp());
			newls.dataChanged(player);
			
			newMissions.setHKC(missions.getHeroKillCount());
			newMissions.setAHKC(missions.getAntiHeroKillCount());
			newMissions.setVKC(missions.getVillainKillCount());
			newMissions.setCurrentMissionID(missions.getCurrentMissionID());
			newMissions.dataChanged(player);
		}
	}
}
