package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TorsoSyncMessageHandler implements IMessageHandler<TorsoSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(TorsoSyncMessage message, MessageContext ctx) {
		IThreadListener mainThread = Minecraft.getMinecraft();
		mainThread.addScheduledTask(new Runnable() {
			@Override
			public void run() {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
				if (capability != null) {
					capability.setTorsoColorR(message.torsoR);
					capability.setTorsoColorG(message.torsoG);
					capability.setTorsoColorB(message.torsoB);
					capability.setTorsoType(message.torsoType);
					
					capability.setCreatedCharacter(message.createdChar);
				}
			}

		});

		return null;
	}
}