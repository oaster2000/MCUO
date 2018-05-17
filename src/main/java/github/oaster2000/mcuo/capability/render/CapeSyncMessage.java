package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CapeSyncMessage implements IMessage {
	
	public CapeSyncMessage() {
	}
	float capeR;
	float capeG;
	float capeB;
	int capeType;

	boolean createdChar;

	public CapeSyncMessage(float r, float g, float b, int type,  boolean created) {
		this.capeR = r;
		this.capeG = g;
		this.capeB = b;
		this.capeType = type;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		capeType = buf.readInt();
		capeR = buf.readFloat();
		capeG = buf.readFloat();
		capeB = buf.readFloat();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(capeType);
		buf.writeFloat(capeR);
		buf.writeFloat(capeG);
		buf.writeFloat(capeB);
		buf.writeBoolean(createdChar);
	}
}