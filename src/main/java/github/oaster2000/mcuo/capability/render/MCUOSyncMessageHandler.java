package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MCUOSyncMessageHandler implements IMessageHandler<MCUOSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(MCUOSyncMessage message, MessageContext ctx) {
		IThreadListener mainThread = Minecraft.getMinecraft();
		mainThread.addScheduledTask(new Runnable() {
			@Override
			public void run() {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
				if (capability != null) {
					capability.setHelmColor(message.helmR, message.helmG, message.helmB);
					capability.setHelmType(message.helmType);

					capability.setCreatedCharacter(message.createdChar);
				}
			}

		});

		return null;
	}
}