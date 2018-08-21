package github.oaster2000.mcuo.common;

import github.oaster2000.mcuo.capability.levels.LevelSystemServerSyncMessage;
import github.oaster2000.mcuo.capability.levels.LevelSystemSyncMessage;
import github.oaster2000.mcuo.capability.missions.MissionsServerSyncMessage;
import github.oaster2000.mcuo.capability.missions.MissionsSyncMessage;
import github.oaster2000.mcuo.capability.render.MCUOClientSyncMessage;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessage;
import github.oaster2000.mcuo.packet.CPacket;
import github.oaster2000.mcuo.packet.CharacterCreationMessage;
import github.oaster2000.mcuo.packet.CharacterCreationMessageHandler;
import github.oaster2000.mcuo.packet.RPacket;
import github.oaster2000.mcuo.packet.VPacket;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {

	public PacketHandler() {
		MCUO.NETWORK.registerMessage(MCUOClientSyncMessage.Handler.class, MCUOClientSyncMessage.class, 0, Side.CLIENT);
		MCUO.NETWORK.registerMessage(MCUOServerSyncMessage.Handler.class, MCUOServerSyncMessage.class, 1, Side.SERVER);
	
		MCUO.NETWORK.registerMessage(LevelSystemSyncMessage.Handler.class, LevelSystemSyncMessage.class, 2, Side.CLIENT);
		MCUO.NETWORK.registerMessage(LevelSystemServerSyncMessage.Handler.class, LevelSystemServerSyncMessage.class, 3, Side.SERVER);
	
		MCUO.NETWORK.registerMessage(CharacterCreationMessageHandler.class, CharacterCreationMessage.class, 4, Side.SERVER);
		MCUO.NETWORK.registerMessage(CharacterCreationMessageHandler.class, CharacterCreationMessage.class, 5, Side.CLIENT);
	
		MCUO.NETWORK.registerMessage(MissionsSyncMessage.Handler.class, MissionsSyncMessage.class, 6, Side.CLIENT);
		MCUO.NETWORK.registerMessage(MissionsServerSyncMessage.Handler.class, MissionsServerSyncMessage.class, 7, Side.SERVER);
	
		MCUO.NETWORK.registerMessage(RPacket.Handler.class, RPacket.class, 8, Side.SERVER);
		
		MCUO.NETWORK.registerMessage(CPacket.Handler.class, CPacket.class, 9, Side.SERVER);
		
		MCUO.NETWORK.registerMessage(VPacket.Handler.class, VPacket.class, 10, Side.SERVER);
	}
}
