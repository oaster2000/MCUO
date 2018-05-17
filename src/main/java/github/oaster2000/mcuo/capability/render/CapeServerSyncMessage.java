package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CapeServerSyncMessage implements IMessage {

	public CapeServerSyncMessage() {
	}
	float capeR;
	float capeG;
	float capeB;
	int capeType;

	boolean createdChar;

	public CapeServerSyncMessage(float r, float g, float b, int type, boolean created) {
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