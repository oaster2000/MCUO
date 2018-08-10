package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TypeServerSyncMessage implements IMessage {

	public TypeServerSyncMessage() {
	}
	
	int type;

	boolean createdChar;

	public TypeServerSyncMessage(int powers, boolean created) {
		this.type = powers;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		type = buf.readInt();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(type);
		buf.writeBoolean(createdChar);
	}
}