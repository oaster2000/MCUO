package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PowersServerSyncMessage implements IMessage {

	public PowersServerSyncMessage() {
	}
	
	int powers;

	boolean createdChar;

	public PowersServerSyncMessage(int powers, boolean created) {
		this.powers = powers;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		powers = buf.readInt();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(powers);
		buf.writeBoolean(createdChar);
	}
}