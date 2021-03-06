package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MCUOServerSyncMessage implements IMessage {

	public MCUOServerSyncMessage() {}

	private NBTTagCompound tag;

	public MCUOServerSyncMessage(MCUOCap mcuo) {
		this.tag = mcuo.serializeNBT();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.tag = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeTag(buf, tag);
	}
	
	public static class Handler implements IMessageHandler<MCUOServerSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(MCUOServerSyncMessage message, MessageContext ctx) {
			WorldServer thread = (WorldServer) ctx.getServerHandler().player.world;
			thread.addScheduledTask(() -> {
				EntityPlayer player = ctx.getServerHandler().player;
				MCUOCap mcuo = (MCUOCap) player.getCapability(CapabilityHandler.MCUO, null);
				if (player.hasCapability(CapabilityHandler.MCUO, null)) {
					mcuo.deserializeNBT(message.tag);
				}
			});
			return null;
		}
	}
}