package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TorsoServerSyncMessage implements IMessage {

	public TorsoServerSyncMessage() {
	}

	private float torsoR;
	private float torsoG;
	private float torsoB;
	private int torsoType;

	private boolean createdChar;

	public TorsoServerSyncMessage(float r, float g, float b, int type, boolean created) {
		this.torsoR = r;
		this.torsoG = g;
		this.torsoB = b;
		this.torsoType = type;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		torsoType = buf.readInt();
		torsoR = buf.readFloat();
		torsoG = buf.readFloat();
		torsoB = buf.readFloat();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(torsoType);
		buf.writeFloat(torsoR);
		buf.writeFloat(torsoG);
		buf.writeFloat(torsoB);
		buf.writeBoolean(createdChar);
	}

	public static class Handler implements IMessageHandler<TorsoServerSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(TorsoServerSyncMessage message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
		    IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
		    player.getServerWorld().addScheduledTask(() -> {
		    	if (capability != null) {
					capability.setTorsoColorR(message.torsoR);
					capability.setTorsoColorG(message.torsoG);
					capability.setTorsoColorB(message.torsoB);
					capability.setTorsoType(message.torsoType);
					
					capability.setCreatedCharacter(message.createdChar);
		    	}
		     });

	return null;
}
	}
}