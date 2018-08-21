package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class LevelSystemServerSyncMessage implements IMessage {

	public LevelSystemServerSyncMessage() {}

	NBTTagCompound tag;

	public LevelSystemServerSyncMessage(LevelSystem levels) {
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
	
	public static class Handler implements IMessageHandler<LevelSystemServerSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(LevelSystemServerSyncMessage message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
		    player.getServerWorld().addScheduledTask(() -> {
		    	if (player.hasCapability(CapabilityHandler.LVL_SYS, null)) {
		    		((LevelSystem) player.getCapability(CapabilityHandler.LVL_SYS, null)).deserializeNBT(message.tag);
		    	}
		     });

		    return null;
		}
	}
}