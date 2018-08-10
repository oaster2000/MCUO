package github.oaster2000.mcuo.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item{

	public BasicItem(String unlocalizedName){		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.MISC);
	}
	
}
