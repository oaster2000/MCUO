package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class LevelSystemSyncMessageHandler implements IMessageHandler<LevelSystemSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(LevelSystemSyncMessage message, MessageContext ctx) {
					IThreadListener mainThread = Minecraft.getMinecraft();
		mainThread.addScheduledTask(new Runnable() {
			@Override
			public void run() {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				ILevelSystem capability = player.getCapability(CapabilityHandler.LVL_SYS, null);
				if (capability != null) {
					capability.setLevel(message.level);
					capability.setExp(message.exp);
				}
			}

		});

		return null;
	}
}