package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MissionsServerSyncMessage implements IMessage {

	public MissionsServerSyncMessage() {}

	NBTTagCompound tag;

	public MissionsServerSyncMessage(Missions mission) {
		this.tag = mission.serializeNBT();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.tag = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeTag(buf, tag);
	}
	
	public static class Handler implements IMessageHandler<MissionsServerSyncMessage, IMessage> {
		@Override
		public IMessage onMessage(MissionsServerSyncMessage message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
			player.getServerWorld().addScheduledTask(() -> {
				if (player.hasCapability(CapabilityHandler.MISSIONS, null)) {
					((Missions) player.getCapability(CapabilityHandler.MISSIONS, null)).deserializeNBT(message.tag);
				}
			});

			return null;
		}
	}
}