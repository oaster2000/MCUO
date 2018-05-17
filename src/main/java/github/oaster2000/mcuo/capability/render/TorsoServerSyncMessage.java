package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TorsoServerSyncMessage implements IMessage {

	public TorsoServerSyncMessage() {
	}

	float torsoR;
	float torsoG;
	float torsoB;
	int torsoType;

	boolean createdChar;

	public TorsoServerSyncMessage(float r, float g, float b, int type, boolean created) {
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