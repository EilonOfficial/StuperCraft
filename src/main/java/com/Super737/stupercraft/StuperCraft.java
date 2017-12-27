package com.Super737.stupercraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "stupercraft", name = "Stuper Craft", version = "1.0")
public class StuperCraft {
	public static Item itemInfusionStone;
	public static Item itemObsidianDust;
	public static Item itemIronHammer;
	public static Block blockObsidianAlloyBlock;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//Config Handling
		itemInfusionStone = new ItemInfusionStone().setUnlocalizedName("ItemInfusionStone").setTextureName("stupercraft:iteminfusionstone").setCreativeTab(tabStuperCraft);
		itemObsidianDust = new ItemObsidianDust().setUnlocalizedName("ItemObsidianDust").setTextureName("stupercraft:obsidiandust").setCreativeTab(tabStuperCraft);
		itemIronHammer = new ItemIronHammer().setUnlocalizedName("ItemIronHammer").setTextureName("stupercraft:IronHammer").setCreativeTab(tabStuperCraft);
		blockObsidianAlloyBlock = new BlockObsidianAlloyBlock(Material.iron).setBlockName("BlockObsidianAlloyBlock").setBlockTextureName("stupercraft:obsidianalloyblock").setCreativeTab(tabStuperCraft);
		
		GameRegistry.registerItem(itemInfusionStone, itemInfusionStone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemObsidianDust, itemObsidianDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemIronHammer, itemIronHammer.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(blockObsidianAlloyBlock, blockObsidianAlloyBlock.getUnlocalizedName().substring(5));
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabStuperCraft = new CreativeTabs("tabStuperCraft") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemInfusionStone).getItem();
		}
	};
}
