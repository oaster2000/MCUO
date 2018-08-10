package github.oaster2000.mcuo.gui;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.levels.ILevelSystem;
import github.oaster2000.mcuo.capability.levels.LevelSystemServerSyncMessage;
import github.oaster2000.mcuo.capability.missions.IMissions;
import github.oaster2000.mcuo.capability.missions.MissionsServerSyncMessage;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.missions.MissionBase;
import github.oaster2000.mcuo.missions.Missions;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiMissions extends GuiScreen {

	/** The old x position of the mouse pointer */
	private float oldMouseX;
	/** The old y position of the mouse pointer */
	private float oldMouseY;
	/** Starting X position for the Gui. Inconsistent use for Gui backgrounds. */
	protected int guiLeft;
	/** Starting Y position for the Gui. Inconsistent use for Gui backgrounds. */
	protected int guiTop;

	EntityPlayer player;
	IMCUO mcuo;
	ILevelSystem ls;
	IMissions missions;
	MissionBase currentMission = Missions.origins;
	String newline = System.getProperty("line.separator");

	private static final ResourceLocation BG_TEXTURE = new ResourceLocation("mcuo", "textures/gui/missions.png");

	@Override
	public void initGui() {
		player = Minecraft.getMinecraft().player;
		mcuo = player.getCapability(CapabilityHandler.MCUO, null);
		ls = player.getCapability(CapabilityHandler.LVL_SYS, null);
		missions = player.getCapability(CapabilityHandler.MISSIONS, null);
		this.guiLeft = (this.width - 318) / 2;
		this.guiTop = (this.height - 200) / 2;
		
		if(currentMission.isComplete()) {
			if(currentMission.equals(Missions.origins)) {
				switch(mcuo.getType()) {
					case 0:
						currentMission = Missions.herosJourney;
						break;
					case 1:
						currentMission = Missions.longLonelyPath;
						break;
					case 2:
						currentMission = Missions.evilInside;
						break;
				}
				missions.setCurrentMissionID(1);
				MCUO.NETWORK.sendToServer(new MissionsServerSyncMessage(missions.getHeroKillCount(), missions.getAntiHeroKillCount(), missions.getVillainKillCount(), missions.getCurrentMissionID()));
			}
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		int i = this.guiLeft;
		int j = this.guiTop;
		Minecraft.getMinecraft().getTextureManager().bindTexture(BG_TEXTURE);
		this.drawModalRectWithCustomSizedTexture(i, j, 0, 0, 318, 200, 318, 200);
		if (currentMission != null) {
			Minecraft.getMinecraft().fontRenderer.drawString(currentMission.getTitle().toUpperCase(), i + 8, j + 9,
					0xff373737);
			Minecraft.getMinecraft().fontRenderer.drawSplitString(currentMission.getFillerText(), i + 13, j + 30, 290,
					0xff333333);
		}
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.oldMouseX = (float) mouseX;
		this.oldMouseY = (float) mouseY;
	}

	public void updateScreen() {
		if(currentMission.isComplete()) {
			if(currentMission.equals(Missions.origins)) {
				switch(mcuo.getType()) {
					case 0:
						currentMission = Missions.herosJourney;
						break;
					case 1:
						currentMission = Missions.longLonelyPath;
						break;
					case 2:
						currentMission = Missions.evilInside;
						break;
				}
			}
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return true;
	}

}
