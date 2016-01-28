package com.snowpaw.nooblib.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class NItemBlockBase extends ItemBlock {

	public NItemBlockBase(Block block) {
		super(block);
		
		if(((NBlockBase)block).subNames.length > 1){
			this.setHasSubtypes(true);
		}
	}
	
	@Override
	public int getMetadata (int damageValue){
		return damageValue;
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List itemList){
		this.field_150939_a.getSubBlocks(item, tab, itemList);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		if(((NBlockBase)field_150939_a).subNames != null && ((NBlockBase)field_150939_a).subNames.length > 0){
			return getUnlocalizedName() + "." + ((NBlockBase)field_150939_a).subNames[ Math.min(((NBlockBase)field_150939_a).subNames.length - 1, itemstack.getItemDamage())];
		}
		return super.getUnlocalizedName(itemstack);
	}

}
