package github.oaster2000.mcuo.items;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.missions.MissionsServerSyncMessage;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.missions.Missions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ModifierItem extends BasicItem {

	public ModifierItem(String unlocalizedName) {
		super(unlocalizedName);
		this.setMaxStackSize(1);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) {
		IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
		IMissions missions = player.getCapability(CapabilityHandler.MISSIONS, null);
		Missions.origins.setComplete(true);
		if (!worldIn.isRemote) {
			if (missions.getCurrentMissionID() == 0) {
				if (mcuo.getType() == 0) {
					missions.setCurrentMissionID(1);
					MCUO.NETWORK.sendToAll(
							new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(),
									missions.getVillainKillCount(), missions.getCurrentMissionID()));
				} else if (mcuo.getType() == 1) {
					missions.setCurrentMissionID(2);
					MCUO.NETWORK.sendToAll(
							new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(),
									missions.getVillainKillCount(), missions.getCurrentMissionID()));
				} else if (mcuo.getType() == 2) {
					missions.setCurrentMissionID(3);
					MCUO.NETWORK.sendToAll(
							new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(),
									missions.getVillainKillCount(), missions.getCurrentMissionID()));
				}
			}
		}
		player.inventory.decrStackSize(player.inventory.currentItem, 1);
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handIn));
	}

}
