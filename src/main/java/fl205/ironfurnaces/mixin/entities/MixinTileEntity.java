package fl205.ironfurnaces.mixin.entities;

import fl205.ironfurnaces.tileEntities.TileEntityIronFurnace;
import net.minecraft.core.block.entity.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = TileEntity.class, remap = false)
public class MixinTileEntity {
	@Shadow
	private static void addMapping(Class class1, String s) {}

	static {
		addMapping(TileEntityIronFurnace.class, "Iron Furnace");
	}
}
