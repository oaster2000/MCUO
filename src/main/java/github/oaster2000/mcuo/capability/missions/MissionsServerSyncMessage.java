package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MissionsServerSyncMessage implements IMessage {

	public MissionsServerSyncMessage() {
	}

	int hkc;
	int ahkc;
	int vkc;
	int missionID;

	public MissionsServerSyncMessage(int hkc, int ahkc, int vkc, int id) {
		this.hkc = hkc;
		this.ahkc = ahkc;
		this.vkc = vkc;
		this.missionID = id;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		hkc = buf.readInt();
		ahkc = buf.readInt();
		vkc = buf.readInt();
		missionID = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(hkc);
		buf.writeInt(ahkc);
		buf.writeInt(vkc);
		buf.writeInt(missionID);
	}
}