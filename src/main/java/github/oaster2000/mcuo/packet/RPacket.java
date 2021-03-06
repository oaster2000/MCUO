package github.oaster2000.mcuo.packet;

import github.oaster2000.mcuo.abilities.Abilities;
import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.missions.MissionsSyncMessage;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.missions.Missions;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class RPacket implements IMessage {
	private int playerID;
	private int dimension;
	private int time = 0;

	public RPacket() {
	}

	public RPacket(byte id) {

	}

	public RPacket(EntityPlayer player) {
		this.dimension = player.world.provider.getDimension();
		this.playerID = player.getEntityId();
	}

	public void toBytes(ByteBuf buffer) {
		buffer.writeInt(this.dimension);
		buffer.writeInt(this.playerID);
	}

	public void fromBytes(ByteBuf buffer) {
		this.dimension = buffer.readInt();
		this.playerID = buffer.readInt();
	}

	public static class Handler implements IMessageHandler<RPacket, IMessage> {
		@Override
		public IMessage onMessage(RPacket message, MessageContext ctx) {
			World world = DimensionManager.getWorld(message.dimension);
			if (world == null) {
				return null;
			}

			EntityPlayer player = ctx.getServerHandler().player;

			int direction = MathHelper.floor((double) ((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
			ILevelSystem ls = player.getCapability(CapabilityHandler.LVL_SYS, null);

			System.out.println("Powers: " + mcuo.getPowers());
				if (Missions.origins.isComplete()) {
					if (mcuo.getPowers() == 0 || mcuo.getPowers() == 1) {
						Abilities.flameBlast(player);
					} else if (mcuo.getPowers() == 2) {
						Abilities.iceBlast(player);
					}
				}
			return null;
		}
	}
}
