package github.oaster2000.mcuo.handler;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessage;
import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.packet.CharacterCreationMessage;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class GuiOpenOnWorld {
	
	@SubscribeEvent
	public void onLog(PlayerEvent.PlayerLoggedInEvent event) {
		IMCUO mcuo = event.player.getCapability(CapabilityHandler.MCUO, null);
		if (!(mcuo.hasCreatedCharacter()) && event.player != null && !event.player.world.isRemote) {
			MCUO.NETWORK.sendToAll(new CharacterCreationMessage());
			mcuo.setCreatedCharacter(true);
			MCUO.NETWORK.sendToAll(new MCUOServerSyncMessage(mcuo.getHelmColorR(), mcuo.getHelmColorG(),
					mcuo.getHelmColorB(), mcuo.getHelmType(), mcuo.hasCreatedCharacter()));
		}
	}

}
