package github.oaster2000.mcuo.handler;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.MCUOProvider;
import github.oaster2000.mcuo.common.MCUO;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class GuiOpenOnWorld {

	@SubscribeEvent
	public void onLog(TickEvent.PlayerTickEvent event) {
		if(!(event.player.getCapability(CapabilityHandler.MCUO, null).hasCreatedCharacter())) {
			event.player.openGui(MCUO.instance, 0, event.player.world, (int)event.player.posX, (int)event.player.posY, (int)event.player.posZ);
			event.player.getCapability(CapabilityHandler.MCUO, null).setCreatedCharacter(true);
		}
	}

}
