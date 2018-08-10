package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TypeServerSyncMessageHandler implements IMessageHandler<TypeServerSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(TypeServerSyncMessage message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
		    IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
		    player.getServerWorld().addScheduledTask(() -> {
		    	if (capability != null) {
					capability.setType(message.type);
					
					capability.setCreatedCharacter(message.createdChar);
		    	}
		     });

	return null;
}
	}