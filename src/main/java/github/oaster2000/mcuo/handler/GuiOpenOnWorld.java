package github.oaster2000.mcuo.handler;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.MCUOCap;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessage;
import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.packet.CharacterCreationMessage;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class GuiOpenOnWorld {
	
	@SubscribeEvent
	public void onLog(PlayerEvent.PlayerLoggedInEvent event) {
		MCUOCap mcuo = (MCUOCap) event.player.getCapability(CapabilityHandler.MCUO, null);
		if (!(mcuo.hasCreatedCharacter()) && event.player != null && !event.player.world.isRemote) {
			MCUO.NETWORK.sendTo(new CharacterCreationMessage(), (EntityPlayerMP) event.player);
			mcuo.setCreatedCharacter(true);
<<<<<<< HEAD
			MCUO.NETWORK.sendTo(new MCUOServerSyncMessage(mcuo.getHelmColorR(), mcuo.getHelmColorG(),
					mcuo.getHelmColorB(), mcuo.getHelmType(), mcuo.hasCreatedCharacter()), (EntityPlayerMP) event.player);
=======
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66
		}
	}
}