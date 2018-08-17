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

	int level;
	int exp;

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
}