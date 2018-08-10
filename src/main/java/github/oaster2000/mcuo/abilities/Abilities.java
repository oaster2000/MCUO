package github.oaster2000.mcuo.abilities;

import java.util.Random;

import github.oaster2000.mcuo.entities.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class Abilities {

	public static boolean isFlying = false;
	public static boolean isStrong = false;

	public static void flameBlast(EntityPlayer player) 
	{
		EntityFlameBlast entity = new EntityFlameBlast(player.world, player);
		entity.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
	    if (!player.world.isRemote)
	    {
	    	player.world.spawnEntity(entity);
	      	Random rand = new Random();
	    }	
	}
	
	public static void fly(EntityPlayer player) {
		isFlying = true;
	}
	
	public static void strength(EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 500, 15));
		isStrong = true;
	}
	
	public static void iceBlast(EntityPlayer player) 
	{
		EntityIceBlast entity = new EntityIceBlast(player.world, player);
		entity.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
	    if (!player.world.isRemote)
	    {
	    	player.world.spawnEntity(entity);
	      	Random rand = new Random();
	    }	
	}
	
}
