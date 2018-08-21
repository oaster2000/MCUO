package github.oaster2000.mcuo.capability;

import java.util.concurrent.Callable;

import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.levels.LevelSystem;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.missions.Missions;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.MCUOCap;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class CapabilityHandler {

	@CapabilityInject(IMCUO.class)
	public static Capability<IMCUO> MCUO = null;

	@CapabilityInject(ILevelSystem.class)
	public static Capability<ILevelSystem> LVL_SYS = null;

	@CapabilityInject(IMissions.class)
	public static Capability<IMissions> MISSIONS = null;

	public static void init() {
		CapabilityManager.INSTANCE.register(IMCUO.class, new Storage<IMCUO>(), MCUOCap::new);

		CapabilityManager.INSTANCE.register(ILevelSystem.class, new Storage<ILevelSystem>(), LevelSystem::new);

		CapabilityManager.INSTANCE.register(IMissions.class, new Storage<IMissions>(), Missions::new);
	}
}
