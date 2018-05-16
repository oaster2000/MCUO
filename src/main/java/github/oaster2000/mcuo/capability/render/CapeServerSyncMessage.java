package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CapeServerSyncMessage implements IMessage {

	public CapeServerSyncMessage() {
	}
	private float capeR;
	private float capeG;
	private float capeB;
	private int capeType;

	private boolean createdChar;

	public CapeServerSyncMessage(float r, float g, float b, int type, boolean created) {
		this.capeR = r;
		this.capeG = g;
		this.capeB = b;
		this.capeType = type;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		capeType = buf.readInt();
		capeR = buf.readFloat();
		capeG = buf.readFloat();
		capeB = buf.readFloat();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(capeType);
		buf.writeFloat(capeR);
		buf.writeFloat(capeG);
		buf.writeFloat(capeB);
		buf.writeBoolean(createdChar);
	}

	public static class Handler implements IMessageHandler<CapeServerSyncMessage, IMessage> {

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
}