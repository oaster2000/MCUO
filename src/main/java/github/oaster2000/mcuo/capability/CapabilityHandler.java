package github.oaster2000.mcuo.capability;

import java.util.concurrent.Callable;

import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.levels.LevelSystem;
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

	public static void init()

	{
		CapabilityManager.INSTANCE.register(IMCUO.class, new Storage<IMCUO>(), new Callable<IMCUO>() {
			@Override
			public IMCUO call() throws Exception {
				return new MCUOCap();
			}
		});
		
		CapabilityManager.INSTANCE.register(ILevelSystem.class, new Storage<ILevelSystem>(), new Callable<ILevelSystem>() {
			@Override
			public ILevelSystem call() throws Exception {
				return new LevelSystem();
			}
		});
	}
}
