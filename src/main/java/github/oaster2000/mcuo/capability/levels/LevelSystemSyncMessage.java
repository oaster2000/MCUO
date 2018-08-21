package github.oaster2000.mcuo.capability.levels;

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

public class LevelSystemSyncMessage implements IMessage {
	
	public LevelSystemSyncMessage() {}

	NBTTagCompound tag;

	public LevelSystemSyncMessage(LevelSystem levels) {
		this.tag = levels.serializeNBT();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.tag = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeTag(buf, tag);
	}
	
	public static class Handler implements IMessageHandler<LevelSystemSyncMessage, IMessage> {
		@Override
		public IMessage onMessage(LevelSystemSyncMessage message, MessageContext ctx) {
			IThreadListener mainThread = Minecraft.getMinecraft();
			mainThread.addScheduledTask(() -> {
				EntityPlayer player = Minecraft.getMinecraft().player;
					
				if (player.hasCapability(CapabilityHandler.LVL_SYS, null)) {
			    	((LevelSystem) player.getCapability(CapabilityHandler.LVL_SYS, null)).deserializeNBT(message.tag);
			    }
			});

			return null;
		}
	}
}