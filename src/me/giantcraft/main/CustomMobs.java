package me.giantcraft.main;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;

public class CustomMobs {
	
	Snowman snowman;
	Creeper creeper;
	Enderman enderman;
	Spider spider;
	MagmaCube magmacube;
	Skeleton skeleton;
	Ghast ghast;
	Zombie zombie;
	Slime slime;
	Silverfish silverfish;
	CaveSpider cavespider;
	PigZombie zombiepigman;
	Witch witch;
	WitherSkeleton witherskeleton;
	IronGolem irongolem;
	Blaze blaze;
	
	public void SpawnCustomMob(String _type, Location loc, World world)
	{
		switch(_type.toUpperCase())
		{
		case "SNOWMAN":{
			snowman = null;
			snowman = world.spawn(loc, Snowman.class);
		}
		case "CREEPER":{
			creeper = null;
			creeper = world.spawn(loc, Creeper.class);
		}
		case "ENDERMAN":{
			enderman = null;
			enderman = world.spawn(loc, Enderman.class);
		}
		case "SPIDER":{
			spider = null;
			spider = world.spawn(loc, Spider.class);
		}
		case "MAGMACUBE":{
			magmacube = null;
			magmacube = world.spawn(loc, MagmaCube.class);
		}
		case "SKELETON":{
			skeleton = null;
			skeleton = world.spawn(loc, Skeleton.class);
		}
		case "GHAST":{
			ghast = null;
			ghast = world.spawn(loc, Ghast.class);
		}
		case "ZOMBIE":{
			zombie = null;
			zombie = world.spawn(loc, Zombie.class);
		}
		case "SLIME":{
			slime = null;
			slime = world.spawn(loc, Slime.class);
		}
		case "SILVERFISH":{
			silverfish = null;
			silverfish = world.spawn(loc, Silverfish.class);
		}
		case "CAVESPIDER":{
			cavespider = null;
			cavespider = world.spawn(loc, CaveSpider.class);
		}
		case "ZOMBIEPIGMAN":{
			zombiepigman = null;
			zombiepigman = world.spawn(loc, PigZombie.class);
		}
		case "WITCH":{
			witch = null;
			witch = world.spawn(loc, Witch.class);
		}
		case "WITHERSKELETON":{
			witherskeleton = null;
			witherskeleton = world.spawn(loc, WitherSkeleton.class);
		}
		case "IRONGOLEM":{
			irongolem = null;
			irongolem = world.spawn(loc, IronGolem.class);
		}
		case "BLAZE":{
			blaze = null;
			blaze = world.spawn(loc, Blaze.class);
		}
		default:
			//config mistake
		}
	}
}

