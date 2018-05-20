package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PowersSyncMessage implements IMessage {
	
	public PowersSyncMessage() {
	}
	
	int powers;

	boolean createdChar;

	public PowersSyncMessage(int powers, boolean created) {
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