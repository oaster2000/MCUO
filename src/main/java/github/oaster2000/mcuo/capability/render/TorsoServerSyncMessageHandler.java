package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TorsoServerSyncMessageHandler implements IMessageHandler<TorsoServerSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(TorsoServerSyncMessage message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
		    IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
		    player.getServerWorld().addScheduledTask(() -> {
		    	if (capability != null) {
					capability.setTorsoColor(message.torsoR, message.torsoG, message.torsoB);
					capability.setTorsoType(message.torsoType);
					
					capability.setCreatedCharacter(message.createdChar);
		    	}
		     });

	return null;
}
	}