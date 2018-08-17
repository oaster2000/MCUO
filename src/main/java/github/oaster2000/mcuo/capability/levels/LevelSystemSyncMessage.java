package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class LevelSystemSyncMessage implements IMessage {
	
	public LevelSystemSyncMessage() {
	}

	int level;
	int exp;

	public LevelSystemSyncMessage(int lvl, int xp) {
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