package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class LevelSystemServerSyncMessage implements IMessage {

	public LevelSystemServerSyncMessage() {
	}

	private int level;
	private int exp;

	public LevelSystemServerSyncMessage(int lvl, int xp) {
		this.level = lvl;
		this.exp = xp;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		level = buf.readInt();
		exp = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(level);
		buf.writeInt(exp);
	}

	public static class Handler implements IMessageHandler<LevelSystemServerSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(LevelSystemServerSyncMessage message, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
		    ILevelSystem capability = player.getCapability(CapabilityHandler.LVL_SYS, null);
		    player.getServerWorld().addScheduledTask(() -> {
		    	if (capability != null) {
		    		capability.setLevel(message.level);
		    		capability.setExp(message.exp);
		    	}
		     });

	return null;
}
	}
}