package github.oaster2000.mcuo.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.render.IMCUO;
import net.minecraft.client.Minecraft;

public class KillMission extends MissionBase{

	int killAmount;
	
	IMCUO mcuo = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MCUO, null);
	IMissions missions = Minecraft.getMinecraft().player.getCapability(CapabilityHandler.MISSIONS, null);
	
	public KillMission(int id, int amount, String title, String filler, int xp) {
		super(id, EnumRequirementType.KILL, title, filler, xp);
		killAmount = amount;
	}
	
	public void isMissionComplete() {
		if(mcuo.getType() == 0) {
			if((missions.getVillainKillCount() + missions.getAntiHeroKillCount()) >= killAmount) {
				completed = true;
			}
		}else if(mcuo.getType() == 1) {
			if((missions.getVillainKillCount() + missions.getHeroKillCount()) >= killAmount) {
				completed = true;
			}
		}else if(mcuo.getType() == 2) {
			if((missions.getHeroKillCount() + missions.getAntiHeroKillCount()) >= killAmount) {
				completed = true;
			}
		}else {
			completed = false;
		}
	}
}
