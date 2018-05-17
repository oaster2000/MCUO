package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TorsoSyncMessage implements IMessage {
	
	public TorsoSyncMessage() {
	}
	
	float torsoR;
	float torsoG;
	float torsoB;
	int torsoType;

	boolean createdChar;

	public TorsoSyncMessage(float r, float g, float b, int type, boolean created) {
		this.torsoR = r;
		this.torsoG = g;
		this.torsoB = b;
		this.torsoType = type;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		torsoType = buf.readInt();
		torsoR = buf.readFloat();
		torsoG = buf.readFloat();
		torsoB = buf.readFloat();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(torsoType);
		buf.writeFloat(torsoR);
		buf.writeFloat(torsoG);
		buf.writeFloat(torsoB);
		buf.writeBoolean(createdChar);
	}
}