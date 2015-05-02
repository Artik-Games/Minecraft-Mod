package minecraft.mod.ore;

import java.util.Random;

import minecraft.mod.Reference;
import minecraft.mod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModOre extends Block{
	
	//The item to drop
	private Item drop;
	
	//The block meta
	private int meta;
	
	//The lowest amount of items to drop
	private int least_quantity;
	
	//The highest amount of items to drop
	private int most_quantity;

	/**
	 * @param unlocalizedName The unlocalized name of the block.
	 * @param mat The material of the block.
	 * @param drop The item that you want the block to drop.
	 * @param least_quantity The lowest amount of the item you want to drop.
	 * @param most_quantity The highest amount of the item you want to drop.
	 * @param hardness A float that sets the blocks hardness.
	 * @param resistance A float that sets the blocks blast resistance.
	 * @param harvestLevel Sets the harvest level for the block. (1 = wood : 2 = iron : 3 = diamond)
	 * @param tab Sets the creative tab for the block.
	 */
	public ModOre(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity,float hardness, float resistance, int harvestLevel, CreativeTabs tab) {
		super(mat);
		this.drop = drop;
	    this.least_quantity = least_quantity;
	    this.most_quantity = most_quantity;
		this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(tab);
        this.setStepSound(soundTypeStone);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel("pickaxe", harvestLevel);

	}
	
	/**
	 * Code for item drop.
	 * TODO: Alter the code to drop more than one item
	 */
	@Override 
	public Item getItemDropped(IBlockState state, Random rand, int fortune) { 
	 	return ModItems.test_item; 
	} 

	/**
	 * Code for determining the amount dropped
	 */
	@Override 
	public int quantityDropped(Random random) { 
	 	return this == this ? least_quantity + random.nextInt(most_quantity) : 1; 
	} 


}
