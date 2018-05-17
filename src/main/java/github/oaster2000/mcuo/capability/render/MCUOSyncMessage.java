package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MCUOSyncMessage implements IMessage {
	
	public MCUOSyncMessage() {
	}

	float helmR;
	float helmG;
	float helmB;
	int helmType;

	boolean createdChar;

	public MCUOSyncMessage(float r, float g, float b, int type, boolean created) {
		this.helmR = r;
		this.helmG = g;
		this.helmB = b;
		this.helmType = type;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		helmType = buf.readInt();
		helmR = buf.readFloat();
		helmG = buf.readFloat();
		helmB = buf.readFloat();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(helmType);
		buf.writeFloat(helmR);
		buf.writeFloat(helmG);
		buf.writeFloat(helmB);
		buf.writeBoolean(createdChar);
	}
}