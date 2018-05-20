package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PowersSyncMessageHandler implements IMessageHandler<PowersSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(PowersSyncMessage message, MessageContext ctx) {
		IThreadListener mainThread = Minecraft.getMinecraft();
		mainThread.addScheduledTask(new Runnable() {
			@Override
			public void run() {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
				if (capability != null) {
					capability.setPowers(message.powers);
					
					capability.setCreatedCharacter(message.createdChar);
				}
			}

		});

		return null;
	}
}