package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MissionsServerSyncMessageHandler implements IMessageHandler<MissionsServerSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(MissionsServerSyncMessage message, MessageContext ctx) {
		EntityPlayerMP player = ctx.getServerHandler().player;
		IMissions capability = player.getCapability(CapabilityHandler.MISSIONS, null);
		player.getServerWorld().addScheduledTask(() -> {
			if (capability != null) {
				capability.setHKC(message.hkc);
				capability.setAHKC(message.ahkc);
				capability.setVKC(message.vkc);
				capability.setCurrentMissionID(message.missionID);
			}
		});

		return null;
	}
}