package github.oaster2000.mcuo.client.render;

import github.oaster2000.mcuo.common.Reference;
import github.oaster2000.mcuo.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static String modid = Reference.modid;
	
	public static void registerItemRenderer(){
		reg(ModItems.modifier);
	}
	
	public static void reg(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
