package com.snowpaw.nooblib.block;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class NBlockBase extends BlockContainer {
	
	public String blockName;
	public String[] subNames;
	public boolean isFlammable = false;

	public NBlockBase(String modId, String blockName, Class<? extends NItemBlockBase> itemBlock, Material material, String... subNames) {
		super(material);
		adjustSound();
		this.blockName = blockName;
		this.subNames = subNames;
		this.setBlockName(modId + "." + blockName);
		GameRegistry.registerBlock(this, itemBlock, blockName);
	}
	
	public NBlockBase setFlammable(boolean flammable){
		this.isFlammable = flammable;
		return this;
	}
	
	@Override
	public int damageDropped(int meta){
		return meta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		for(int i=0; i<subNames.length; i++)
			list.add(new ItemStack(item, 1, i));
	}
	
	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z){
		return false;
	}
	
	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face){
		return isFlammable;
	}
	
	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face){
		return isFlammable ? 20 : 0;
	}
	
	@Override
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face){
		return isFlammable ? 5 : 0;
	}
	
	public void adjustSound(){
		if(this.blockMaterial==Material.anvil)
			this.stepSound = Block.soundTypeAnvil;
		
		else if(this.blockMaterial==Material.carpet||this.blockMaterial==Material.cloth)
			this.stepSound = Block.soundTypeCloth;
		
		else if(this.blockMaterial==Material.glass||this.blockMaterial==Material.ice)
			this.stepSound = Block.soundTypeGlass;
		
		else if(this.blockMaterial==Material.grass||this.blockMaterial==Material.tnt||this.blockMaterial==Material.plants||this.blockMaterial==Material.vine)
			this.stepSound = Block.soundTypeGrass;
		
		else if(this.blockMaterial==Material.ground)
			this.stepSound = Block.soundTypeGravel;
		
		else if(this.blockMaterial==Material.iron)
			this.stepSound = Block.soundTypeMetal;
		
		else if(this.blockMaterial==Material.sand)
			this.stepSound = Block.soundTypeSand;
		
		else if(this.blockMaterial==Material.snow)
			this.stepSound = Block.soundTypeSnow;
		
		else if(this.blockMaterial==Material.rock)
			this.stepSound = Block.soundTypeStone;
		
		else if(this.blockMaterial==Material.wood||this.blockMaterial==Material.cactus)
			this.stepSound = Block.soundTypeWood;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta){
		return null;
	}

}
