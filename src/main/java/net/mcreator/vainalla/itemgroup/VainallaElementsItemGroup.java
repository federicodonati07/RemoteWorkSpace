
package net.mcreator.vainalla.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.vainalla.item.PortafoglioItem;
import net.mcreator.vainalla.VainallaModElements;

@VainallaModElements.ModElement.Tag
public class VainallaElementsItemGroup extends VainallaModElements.ModElement {
	public VainallaElementsItemGroup(VainallaModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvainalla_elements") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PortafoglioItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
