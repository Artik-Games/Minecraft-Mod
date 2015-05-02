package minecraft.mod;

import minecraft.mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTab extends CreativeTabs{

	public ModTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.test_item;
	}

}
