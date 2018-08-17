package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MissionsSyncMessageHandler implements IMessageHandler<MissionsSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(MissionsSyncMessage message, MessageContext ctx) {
					IThreadListener mainThread = Minecraft.getMinecraft();
		mainThread.addScheduledTask(new Runnable() {
			@Override
			public void run() {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				IMissions capability = player.getCapability(CapabilityHandler.MISSIONS, null);
				if (capability != null) {
					capability.setHKC(message.hkc);
					capability.setAHKC(message.ahkc);
					capability.setVKC(message.vkc);
					capability.setCurrentMissionID(message.currID);
				}
			}

		});

		return null;
	}
}