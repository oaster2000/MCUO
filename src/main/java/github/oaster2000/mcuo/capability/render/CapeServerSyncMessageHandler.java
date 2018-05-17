package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CapeServerSyncMessageHandler implements IMessageHandler<CapeServerSyncMessage, IMessage> {

	@Override
	public IMessage onMessage(CapeServerSyncMessage message, MessageContext ctx) {
		EntityPlayerMP player = ctx.getServerHandler().player;
		IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
		player.getServerWorld().addScheduledTask(() -> {
			if (capability != null) {
				capability.setCapeColorR(message.capeR);
				capability.setCapeColorG(message.capeG);
				capability.setCapeColorB(message.capeB);
				capability.setCapeType(message.capeType);

				capability.setCreatedCharacter(message.createdChar);
			}
		});

		return null;
	}
}