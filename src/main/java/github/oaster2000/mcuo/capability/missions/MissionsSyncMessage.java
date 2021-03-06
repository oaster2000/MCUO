package github.oaster2000.mcuo.capability.missions;

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

public class MissionsSyncMessage implements IMessage {
	
	public MissionsSyncMessage() {}

	NBTTagCompound tag;

	public MissionsSyncMessage(Missions mission) {
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
	
	public static class Handler implements IMessageHandler<MissionsSyncMessage, IMessage> {
		@Override
		public IMessage onMessage(MissionsSyncMessage message, MessageContext ctx) {
			IThreadListener mainThread = Minecraft.getMinecraft();
			mainThread.addScheduledTask(() -> {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				if (player.hasCapability(CapabilityHandler.MISSIONS, null)) {
						((Missions) player.getCapability(CapabilityHandler.MISSIONS, null)).deserializeNBT(message.tag);
				}
			});

			return null;
		}
	}
}