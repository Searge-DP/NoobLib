package com.snowpaw.nooblib.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHelper {
	
	public static void addStorageRecipe(Item input, int inputMeta, Block output){
		GameRegistry reg = null;
		reg.addRecipe(new ItemStack(output, 1, 0), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(input, 1, inputMeta)});
		reg.addShapelessRecipe(new ItemStack(input, 9, inputMeta), new Object[]{new ItemStack(output, 1, 0)});
	}
	
	public static void addGearRecipe(Item material, int matMeta, Item output, int outputMeta){
		GameRegistry reg = null;
		reg.addRecipe(new ItemStack(output, 1, outputMeta), new Object[]{" X ", "CXC", " X ", 'X', new ItemStack(material, 1, matMeta), 'C', Items.iron_ingot});
	}
	
	public static void addNuggetRecipe(Item input, int inputMeta, Item output, int outputMeta){
		GameRegistry reg = null;
		reg.addShapelessRecipe(new ItemStack(output, 9, outputMeta), new Object[]{new ItemStack(input, 1, inputMeta)});
		reg.addRecipe(new ItemStack(input, 1, inputMeta), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(output, 1, outputMeta)});
	}
	
	public static void addColoring(Block input, int color, Block output){
		GameRegistry reg = null;
		reg.addRecipe(new ItemStack(output, 4), new Object[]{" X ", "XCX", " X ", 'X', input, 'C', new ItemStack(Items.dye, 1, color)});
	}
	
	public static void addToolset(Item input, int inputMeta, Item sword, Item pickaxe, Item shovel, Item axe, Item hoe){
		GameRegistry reg = null;
		reg.addRecipe(new ItemStack(sword, 1), new Object[]{" X ", " X ", " C ", 'X', new ItemStack(input, 1, inputMeta), 'C', Items.stick});
		reg.addRecipe(new ItemStack(pickaxe, 1), new Object[]{"XXX", " C ", " C ", 'X', new ItemStack(input, 1, inputMeta), 'C', Items.stick});
		reg.addRecipe(new ItemStack(shovel, 1), new Object[]{" X ", " C ", " C ", 'X', new ItemStack(input, 1, inputMeta), 'C', Items.stick});
		reg.addRecipe(new ItemStack(axe, 1), new Object[]{" XX", " CX", " C ", 'X', new ItemStack(input, 1, inputMeta), 'C', Items.stick});
		reg.addRecipe(new ItemStack(hoe, 1), new Object[]{" XX", " C ", " C ", 'X', new ItemStack(input, 1, inputMeta), 'C', Items.stick});
	}

}
