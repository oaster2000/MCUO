package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MCUOServerSyncMessageHandler implements IMessageHandler<MCUOServerSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(MCUOServerSyncMessage message, MessageContext ctx) {
		EntityPlayerMP player = ctx.getServerHandler().player;
		IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
		player.getServerWorld().addScheduledTask(() -> {
			if (capability != null) {
				capability.setHelmColorR(message.helmR);
				capability.setHelmColorG(message.helmG);
				capability.setHelmColorB(message.helmB);
				capability.setHelmType(message.helmType);

				capability.setCreatedCharacter(message.createdChar);
			}
		});

		return null;
	}
}