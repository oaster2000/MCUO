package github.oaster2000.mcuo.gui;

import java.io.IOException;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.PowersServerSyncMessage;
import github.oaster2000.mcuo.capability.render.PowersSyncMessage;
import github.oaster2000.mcuo.common.MCUO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GUIPowerChoice extends GuiChoiceBase {

	GuiButton powerDown;
	GuiButton powerUp;

	EntityPlayer player = Minecraft.getMinecraft().player;
	IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
	
	private static final ResourceLocation PowerIcons = new ResourceLocation("mcuo",
			"textures/gui/powericons.png");
	
	@Override
	public void initGui() {
		this.guiLeft = (this.width - 300) / 2;
		this.guiTop = (this.height - 200) / 2;
		powerDown = new GuiButton(2, guiLeft + 190, guiTop + 25, 20, 20, "<");
		powerUp = new GuiButton(3, guiLeft + 230, guiTop + 25, 20, 20, ">");
		buttonList.clear();
		buttonList.add(powerDown);
		buttonList.add(powerUp);
		this.page = 1;
		super.initGui();
		this.btnNext = new GuiButton(1, guiLeft + 230, guiTop + 160, 60, 20, "Finish");
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch (button.id) {
		case 0:
			MCUO.NETWORK.sendToServer(new PowersServerSyncMessage(mcuo.getPowers(), mcuo.hasCreatedCharacter()));
			Minecraft.getMinecraft().displayGuiScreen(new GUITorsoChoice());
			return;
		case 1:
			MCUO.NETWORK.sendToServer(new PowersServerSyncMessage(mcuo.getPowers(), mcuo.hasCreatedCharacter()));
			Minecraft.getMinecraft().displayGuiScreen(new GUIHorVChoice());
			return;
		case 2:
			switch (mcuo.getPowers()) {
			case 0:
				mcuo.setPowers(5);
				break;
			case 1:
				mcuo.setPowers(0);
				break;
			case 2:
				mcuo.setPowers(1);
				break;
			case 3:
				mcuo.setPowers(2);
				break;
			case 4:
				mcuo.setPowers(3);
				break;
			case 5:
				mcuo.setPowers(4);
				break;
			}
			return;
		case 3:
			switch (mcuo.getPowers()) {
			case 0:
				mcuo.setPowers(1);
				break;
			case 1:
				mcuo.setPowers(2);
				break;
			case 2:
				mcuo.setPowers(3);
				break;
			case 3:
				mcuo.setPowers(4);
				break;
			case 4:
				mcuo.setPowers(5);
				break;
			case 5:
				mcuo.setPowers(0);
				break;
			}
			return;
		}
		try {
			super.actionPerformed(button);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void mouseClicked(int x, int y, int btn) {
		try {
			super.mouseClicked(x, y, btn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		int i = this.guiLeft - 40;
		int j = this.guiTop;
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Power", i + 230, j + 10, 0xffa7a7a7);
		Minecraft.getMinecraft().getTextureManager().bindTexture(PowerIcons);
		if(mcuo.getPowers() > 0)this.drawModalRectWithCustomSizedTexture(i + 230, j + 50, 0 + ((mcuo.getPowers() - 1) * 64), 0, 64, 64, 512, 512);
	}
}