package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MCUOClientSyncMessage implements IMessage {
	
	public MCUOClientSyncMessage() {}
	
	private NBTTagCompound nbt;
	
	public MCUOClientSyncMessage(MCUOCap mcuo) {
		this.nbt = mcuo.serializeNBT();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.nbt = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeTag(buf, nbt);
	}
	
	public static class Handler implements IMessageHandler<MCUOClientSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(MCUOClientSyncMessage message, MessageContext ctx) {
			IThreadListener thread = Minecraft.getMinecraft();
			thread.addScheduledTask(() -> {
				EntityPlayer player = Minecraft.getMinecraft().player;
				MCUOCap mcuo = (MCUOCap) player.getCapability(CapabilityHandler.MCUO, null);
				if (player.hasCapability(CapabilityHandler.MCUO, null)) {
					mcuo.deserializeNBT(message.nbt);
				}
			});
			return null;
		}
	}
}