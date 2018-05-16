package github.oaster2000.mcuo.utils;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class SyncUtils {

	public static void sync(EntityPlayer player) {
		if (player.world.isRemote)
			return;
		EntityPlayerMP p1 = (EntityPlayerMP) player;
		IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
		mcuo.dataChanged(p1);
	}

}
