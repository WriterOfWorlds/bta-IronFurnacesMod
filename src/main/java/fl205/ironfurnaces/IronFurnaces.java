package fl205.ironfurnaces;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;


public class IronFurnaces implements ModInitializer {
    public static final String MOD_ID = "ironfurnaces";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Config file manager
	public static final ConfigHandler config;
	static {
		// Config
		Properties prop = new Properties();
		prop.setProperty("ids.ironFurnaceIdleID", "664");
		prop.setProperty("ids.ironFurnaceActiveID", "665");
		config = new ConfigHandler(MOD_ID, prop);
	}


	// Blocks
	public static final Block furnaceIronIdle = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(5.0F)
		.setResistance(10.0F)
		//.setTextures("crate.png")
		.setImmovable()
		.setTags(BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("furnace.iron.idle", config.getInt("ids.ironFurnaceIdleID"), Material.metal));

	public static final Block furnaceIronActive = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.METAL)
		.setHardness(5.0F)
		.setResistance(10.0F)
		.setLuminance(13)
		.setImmovable()
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_PICKAXE)
		.build(new Block("furnace.iron.active", config.getInt("ids.ironFurnaceActiveID"), Material.metal));

	@Override
    public void onInitialize() {
        LOGGER.info("IronFurnaces mod initialized.");
    }
}
