package github.oaster2000.mcuo.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class GuiChoiceBase extends GuiScreen {

	int page = 0;
	
	/** The old x position of the mouse pointer */
	private float oldMouseX;
	/** The old y position of the mouse pointer */
	private float oldMouseY;
	/** Starting X position for the Gui. Inconsistent use for Gui backgrounds. */
	protected int guiLeft;
	/** Starting Y position for the Gui. Inconsistent use for Gui backgrounds. */
	protected int guiTop;
	
	GuiButton btnPrev;
	GuiButton btnNext;
	
	private static final ResourceLocation BG_TEXTURE = new ResourceLocation("mcuo",
			"textures/gui/char_creation.png");
	
	@Override
	public void initGui() {
		this.guiLeft = (this.width - 300) / 2;
		this.guiTop = (this.height - 200) / 2;
		btnPrev = new GuiButton(0, guiLeft + 160, guiTop + 160, 60, 20, "Previous");
		if(page == 8) btnNext = new GuiButton(1, guiLeft + 230, guiTop + 160, 60, 20, "Finish");
		else btnNext = new GuiButton(1, guiLeft + 230, guiTop + 160, 60, 20, "Next");
		buttonList.add(btnPrev);
		buttonList.add(btnNext);
		if(page == 0) {
			btnPrev.enabled = false;
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		int i = this.guiLeft;
		int j = this.guiTop;
		Minecraft.getMinecraft().getTextureManager().bindTexture(BG_TEXTURE);
		this.drawModalRectWithCustomSizedTexture(i, j, 0, 0, 300, 200, 300, 200);
		drawEntityOnScreen(i + 75, j + 175, 75, (float) (i + 50) - this.oldMouseX, (float) (j + 100) - this.oldMouseY,
				this.mc.player);
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.oldMouseX = (float) mouseX;
		this.oldMouseY = (float) mouseY;
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return true;
	}
	
	public static void drawEntityOnScreen(int posX, int posY, int scale, float mouseX, float mouseY,
			EntityLivingBase ent) {
		GlStateManager.enableColorMaterial();
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) posX, (float) posY, 50.0F);
		GlStateManager.scale((float) (-scale), (float) scale, (float) scale);
		GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
		float f = ent.renderYawOffset;
		float f1 = ent.rotationYaw;
		float f2 = ent.rotationPitch;
		float f3 = ent.prevRotationYawHead;
		float f4 = ent.rotationYawHead;
		GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
		RenderHelper.enableStandardItemLighting();
		GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
		ent.renderYawOffset = 0;
		ent.rotationYaw = 0;
		ent.rotationPitch = 0;
		ent.rotationYawHead = ent.rotationYaw;
		ent.prevRotationYawHead = ent.rotationYaw;
		GlStateManager.translate(0.0F, 0.0F, 0.0F);
		RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
		rendermanager.setPlayerViewY(180.0F);
		rendermanager.setRenderShadow(false);
		rendermanager.renderEntity(ent, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
		rendermanager.setRenderShadow(true);
		ent.renderYawOffset = f;
		ent.rotationYaw = f1;
		ent.rotationPitch = f2;
		ent.prevRotationYawHead = f3;
		ent.rotationYawHead = f4;
		GlStateManager.popMatrix();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableRescaleNormal();
		GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GlStateManager.disableTexture2D();
		GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}

}
