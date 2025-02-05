package fl205.ironfurnaces.mixin.entities;

import fl205.ironfurnaces.tileEntities.TileEntityDiamondFurnace;
import fl205.ironfurnaces.tileEntities.TileEntityGoldFurnace;
import fl205.ironfurnaces.tileEntities.TileEntityIronFurnace;
import fl205.ironfurnaces.tileEntities.TileEntitySteelFurnace;
import net.minecraft.core.block.entity.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = TileEntity.class, remap = false)
public class MixinTileEntity {
	@Shadow
	private static void addMapping(Class class1, String s) {}

	static {
		addMapping(TileEntityIronFurnace.class, "Iron Furnace");
		addMapping(TileEntityGoldFurnace.class, "Gold Furnace");
		addMapping(TileEntityDiamondFurnace.class, "Diamond Furnace");
		addMapping(TileEntitySteelFurnace.class, "Steel Furnace");
	}
}
