package github.oaster2000.mcuo.capability;

import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.levels.LevelSystem;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.missions.Missions;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.MCUOCap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class CapabilityEventHandler {

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
		final Entity entity = event.getObject();
		if (!(event.getObject() instanceof EntityPlayer))
			return;
		IMCUO mcuo = CapabilityHandler.MCUO.getDefaultInstance();
		ILevelSystem ls = CapabilityHandler.LVL_SYS.getDefaultInstance();
		IMissions missions = CapabilityHandler.MISSIONS.getDefaultInstance();
		if (entity instanceof EntityPlayer) {
			event.addCapability(mcuo.getKey(), mcuo.getProvider());
			event.addCapability(ls.getKey(), ls.getProvider());
			event.addCapability(missions.getKey(), missions.getProvider());
		}
	}

	@SubscribeEvent
	public void onJoin(PlayerLoggedInEvent event) {
		if (event.player instanceof EntityPlayerMP) {
			IMCUO mcuo = event.player.getCapability(CapabilityHandler.MCUO, null);
			ILevelSystem ls = event.player.getCapability(CapabilityHandler.LVL_SYS, null);
			IMissions missions = event.player.getCapability(CapabilityHandler.MISSIONS, null);
			
			if (event.player.hasCapability(CapabilityHandler.MCUO, null))
				mcuo.dataChanged((EntityPlayerMP) event.player);
			
			if (event.player.hasCapability(CapabilityHandler.LVL_SYS, null))
				ls.dataChanged((EntityPlayerMP) event.player);
			
			if (event.player.hasCapability(CapabilityHandler.MISSIONS, null))
				missions.dataChanged((EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onDeath(PlayerEvent.Clone event) {
		if (event.isWasDeath()) {
			EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();
			
			MCUOCap mcuo = (MCUOCap) event.getOriginal().getCapability(CapabilityHandler.MCUO, null);
			NBTTagCompound mcuoNBT = mcuo.serializeNBT();
			MCUOCap newmcuo = (MCUOCap) event.getEntityPlayer().getCapability(CapabilityHandler.MCUO, null);
			newmcuo.deserializeNBT(mcuoNBT);

			LevelSystem ls = (LevelSystem) event.getOriginal().getCapability(CapabilityHandler.LVL_SYS, null);
			NBTTagCompound lsNBT = ls.serializeNBT();
			LevelSystem newls = (LevelSystem) event.getEntityPlayer().getCapability(CapabilityHandler.LVL_SYS, null);
			newls.deserializeNBT(lsNBT);

			Missions missions = (Missions) event.getOriginal().getCapability(CapabilityHandler.MISSIONS, null);
			NBTTagCompound missionsNBT = missions.serializeNBT();
			Missions newMissions = (Missions) event.getEntityPlayer().getCapability(CapabilityHandler.MISSIONS, null);
			newMissions.deserializeNBT(missionsNBT);
		}
	}
}
