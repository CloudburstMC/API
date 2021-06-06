package org.cloudburstmc.api.block;

import lombok.experimental.UtilityClass;
import org.cloudburstmc.api.util.Identifiers;

@UtilityClass
public class BlockTypes {

    public static final BlockType AIR = BlockType.of(Identifiers.AIR);
    public static final BlockType STONE = BlockType.of(Identifiers.STONE, BlockTraits.STONE_TYPE);
    public static final BlockType GRASS = BlockType.of(Identifiers.GRASS);
    public static final BlockType DIRT = BlockType.of(Identifiers.DIRT, BlockTraits.DIRT_TYPE);
    public static final BlockType COBBLESTONE = BlockType.of(Identifiers.COBBLESTONE);
    public static final BlockType PLANKS = BlockType.of(Identifiers.PLANKS, BlockTraits.TREE_SPECIES);
    public static final BlockType SAPLING = BlockType.of(Identifiers.SAPLING, BlockTraits.TREE_SPECIES_OVERWORLD, BlockTraits.HAS_AGE);
    public static final BlockType BEDROCK = BlockType.of(Identifiers.BEDROCK, BlockTraits.HAS_INFINIBURN);
    public static final BlockType FLOWING_WATER = BlockType.of(Identifiers.FLOWING_WATER, BlockTraits.LIQUID_DEPTH);
    public static final BlockType WATER = BlockType.of(Identifiers.WATER, BlockTraits.LIQUID_DEPTH);
    public static final BlockType FLOWING_LAVA = BlockType.of(Identifiers.FLOWING_LAVA, BlockTraits.LIQUID_DEPTH);
    public static final BlockType LAVA = BlockType.of(Identifiers.LAVA, BlockTraits.LIQUID_DEPTH);
    public static final BlockType SAND = BlockType.of(Identifiers.SAND, BlockTraits.SAND_TYPE);
    public static final BlockType GRAVEL = BlockType.of(Identifiers.GRAVEL);
    public static final BlockType GOLD_ORE = BlockType.of(Identifiers.GOLD_ORE);
    public static final BlockType IRON_ORE = BlockType.of(Identifiers.IRON_ORE);
    public static final BlockType COAL_ORE = BlockType.of(Identifiers.COAL_ORE);
    public static final BlockType LOG = BlockType.of(Identifiers.LOG, BlockTraits.TREE_SPECIES, BlockTraits.AXIS, BlockTraits.IS_STRIPPED);
    public static final BlockType LEAVES = BlockType.of(Identifiers.LEAVES, BlockTraits.TREE_SPECIES_OVERWORLD, BlockTraits.IS_PERSISTENT, BlockTraits.HAS_UPDATE);
    public static final BlockType SPONGE = BlockType.of(Identifiers.SPONGE, BlockTraits.SPONGE_TYPE);
    public static final BlockType GLASS = BlockType.of(Identifiers.GLASS);
    public static final BlockType LAPIS_ORE = BlockType.of(Identifiers.LAPIS_ORE);
    public static final BlockType LAPIS_BLOCK = BlockType.of(Identifiers.LAPIS_BLOCK);
    public static final BlockType DISPENSER = BlockType.of(Identifiers.DISPENSER, BlockTraits.IS_TRIGGERED, BlockTraits.FACING_DIRECTION);
    public static final BlockType SANDSTONE = BlockType.of(Identifiers.SANDSTONE, BlockTraits.SAND_STONE_TYPE);
    public static final BlockType NOTEBLOCK = BlockType.of(Identifiers.NOTEBLOCK);
    public static final BlockType BED = BlockType.of(Identifiers.BED, BlockTraits.IS_OCCUPIED, BlockTraits.IS_HEAD_PIECE, BlockTraits.DIRECTION);
    public static final BlockType GOLDEN_RAIL = BlockType.of(Identifiers.GOLDEN_RAIL, BlockTraits.IS_POWERED, BlockTraits.SIMPLE_RAIL_DIRECTION);
    public static final BlockType DETECTOR_RAIL = BlockType.of(Identifiers.DETECTOR_RAIL, BlockTraits.IS_TRIGGERED, BlockTraits.SIMPLE_RAIL_DIRECTION);
    public static final BlockType WEB = BlockType.of(Identifiers.WEB);
    public static final BlockType TALL_GRASS = BlockType.of(Identifiers.TALL_GRASS, BlockTraits.TALL_GRASS_TYPE);
    public static final BlockType DEADBUSH = BlockType.of(Identifiers.DEADBUSH);
    public static final BlockType PISTON = BlockType.of(Identifiers.PISTON, BlockTraits.FACING_DIRECTION, BlockTraits.IS_STICKY);
    public static final BlockType PISTON_ARM_COLLISION = BlockType.of(Identifiers.PISTON_ARM_COLLISION, BlockTraits.FACING_DIRECTION, BlockTraits.IS_STICKY);
    public static final BlockType WOOL = BlockType.of(Identifiers.WOOL, BlockTraits.COLOR);
    public static final BlockType ELEMENT = BlockType.of(Identifiers.ELEMENT_0, BlockTraits.ELEMENT_TYPE);
    public static final BlockType FLOWER = BlockType.of(Identifiers.RED_FLOWER, BlockTraits.FLOWER_TYPE);
    public static final BlockType BROWN_MUSHROOM = BlockType.of(Identifiers.BROWN_MUSHROOM);
    public static final BlockType RED_MUSHROOM = BlockType.of(Identifiers.RED_MUSHROOM);
    public static final BlockType GOLD_BLOCK = BlockType.of(Identifiers.GOLD_BLOCK);
    public static final BlockType IRON_BLOCK = BlockType.of(Identifiers.IRON_BLOCK);
    public static final BlockType STONE_SLAB = BlockType.of(Identifiers.STONE_SLAB, BlockTraits.SLAB_SLOT, BlockTraits.STONE_SLAB_TYPE);
    public static final BlockType BRICK_BLOCK = BlockType.of(Identifiers.BRICK_BLOCK);
    public static final BlockType TNT = BlockType.of(Identifiers.TNT, BlockTraits.EXPLODE, BlockTraits.IS_ALLOWED_UNDERWATER);
    public static final BlockType BOOKSHELF = BlockType.of(Identifiers.BOOKSHELF);
    public static final BlockType MOSSY_COBBLESTONE = BlockType.of(Identifiers.MOSSY_COBBLESTONE);
    public static final BlockType OBSIDIAN = BlockType.of(Identifiers.OBSIDIAN);
    public static final BlockType TORCH = BlockType.of(Identifiers.TORCH, BlockTraits.TORCH_DIRECTION, BlockTraits.IS_SOUL);
    public static final BlockType FIRE = BlockType.of(Identifiers.FIRE, BlockTraits.AGE);
    public static final BlockType MOB_SPAWNER = BlockType.of(Identifiers.MOB_SPAWNER);
    public static final BlockType WOODEN_STAIRS = BlockType.of(Identifiers.OAK_STAIRS, BlockTraits.DIRECTION, BlockTraits.IS_UPSIDE_DOWN, BlockTraits.TREE_SPECIES);
    public static final BlockType CHEST = BlockType.of(Identifiers.CHEST, BlockTraits.FACING_DIRECTION);
    public static final BlockType REDSTONE_WIRE = BlockType.of(Identifiers.REDSTONE_WIRE, BlockTraits.REDSTONE_SIGNAL);
    public static final BlockType DIAMOND_ORE = BlockType.of(Identifiers.DIAMOND_ORE);
    public static final BlockType DIAMOND_BLOCK = BlockType.of(Identifiers.DIAMOND_BLOCK);
    public static final BlockType CRAFTING_TABLE = BlockType.of(Identifiers.CRAFTING_TABLE);
    public static final BlockType WHEAT = BlockType.of(Identifiers.WHEAT, BlockTraits.GROWTH);
    public static final BlockType FARMLAND = BlockType.of(Identifiers.FARMLAND, BlockTraits.MOISTURIZED_AMOUNT);
    public static final BlockType FURNACE = BlockType.of(Identifiers.FURNACE, BlockTraits.FACING_DIRECTION, BlockTraits.IS_EXTINGUISHED);
    //    public static final BlockType LIT_FURNACE = BlockType.of(Identifiers.LIT_FURNACE);
    public static final BlockType STANDING_SIGN = BlockType.of(Identifiers.OAK_STANDING_SIGN, BlockTraits.CARDINAL_DIRECTION, BlockTraits.TREE_SPECIES);
    public static final BlockType WOODEN_DOOR = BlockType.of(Identifiers.OAK_DOOR, BlockTraits.IS_OPEN, BlockTraits.DIRECTION, BlockTraits.IS_DOOR_HINGE, BlockTraits.IS_UPPER_BLOCK, BlockTraits.TREE_SPECIES);
    public static final BlockType LADDER = BlockType.of(Identifiers.LADDER, BlockTraits.FACING_DIRECTION);
    public static final BlockType RAIL = BlockType.of(Identifiers.RAIL, BlockTraits.RAIL_DIRECTION);
    public static final BlockType STONE_STAIRS = BlockType.of(Identifiers.STONE_STAIRS, BlockTraits.IS_UPSIDE_DOWN, BlockTraits.DIRECTION, BlockTraits.STONE_STAIRS_TYPE);
    public static final BlockType WALL_SIGN = BlockType.of(Identifiers.OAK_WALL_SIGN, BlockTraits.FACING_DIRECTION, BlockTraits.TREE_SPECIES);
    public static final BlockType LEVER = BlockType.of(Identifiers.LEVER, BlockTraits.IS_OPEN, BlockTraits.LEVER_DIRECTION);
    public static final BlockType STONE_PRESSURE_PLATE = BlockType.of(Identifiers.STONE_PRESSURE_PLATE, BlockTraits.REDSTONE_SIGNAL, BlockTraits.STONE_PRESSURE_PLATE_TYPE);
    public static final BlockType IRON_DOOR = BlockType.of(Identifiers.IRON_DOOR, BlockTraits.IS_OPEN, BlockTraits.IS_DOOR_HINGE, BlockTraits.IS_UPPER_BLOCK, BlockTraits.DIRECTION);
    public static final BlockType WOODEN_PRESSURE_PLATE = BlockType.of(Identifiers.OAK_PRESSURE_PLATE, BlockTraits.REDSTONE_SIGNAL, BlockTraits.TREE_SPECIES);
    public static final BlockType REDSTONE_ORE = BlockType.of(Identifiers.REDSTONE_ORE, BlockTraits.IS_EXTINGUISHED);
    public static final BlockType REDSTONE_TORCH = BlockType.of(Identifiers.REDSTONE_TORCH, BlockTraits.TORCH_DIRECTION, BlockTraits.IS_POWERED);
    public static final BlockType STONE_BUTTON = BlockType.of(Identifiers.STONE_BUTTON, BlockTraits.FACING_DIRECTION, BlockTraits.IS_BUTTON_PRESSED, BlockTraits.STONE_BUTTON_TYPE);
    public static final BlockType SNOW_LAYER = BlockType.of(Identifiers.SNOW_LAYER, BlockTraits.IS_COVERED, BlockTraits.HEIGHT);
    public static final BlockType ICE = BlockType.of(Identifiers.ICE);
    public static final BlockType SNOW = BlockType.of(Identifiers.SNOW);
    public static final BlockType CACTUS = BlockType.of(Identifiers.CACTUS, BlockTraits.AGE);
    public static final BlockType CLAY = BlockType.of(Identifiers.CLAY);
    public static final BlockType REEDS = BlockType.of(Identifiers.REEDS, BlockTraits.AGE);
    public static final BlockType JUKEBOX = BlockType.of(Identifiers.JUKEBOX);
    public static final BlockType WOODEN_FENCE = BlockType.of(Identifiers.FENCE, BlockTraits.TREE_SPECIES);
    public static final BlockType PUMPKIN = BlockType.of(Identifiers.PUMPKIN, BlockTraits.DIRECTION);
    public static final BlockType NETHERRACK = BlockType.of(Identifiers.NETHERRACK);
    public static final BlockType SOUL_SAND = BlockType.of(Identifiers.SOUL_SAND);
    public static final BlockType GLOWSTONE = BlockType.of(Identifiers.GLOWSTONE);
    public static final BlockType PORTAL = BlockType.of(Identifiers.PORTAL, BlockTraits.PORTAL_AXIS);
    public static final BlockType LIT_PUMPKIN = BlockType.of(Identifiers.LIT_PUMPKIN, BlockTraits.DIRECTION);
    public static final BlockType CAKE = BlockType.of(Identifiers.CAKE, BlockTraits.BITE_COUNTER);
    public static final BlockType REPEATER = BlockType.of(Identifiers.UNPOWERED_REPEATER, BlockTraits.REPEATER_DELAY, BlockTraits.DIRECTION, BlockTraits.IS_POWERED);
    public static final BlockType INVISIBLE_BEDROCK = BlockType.of(Identifiers.INVISIBLE_BEDROCK);
    public static final BlockType WOODEN_TRAPDOOR = BlockType.of(Identifiers.OAK_TRAPDOOR, BlockTraits.IS_OPEN, BlockTraits.IS_UPSIDE_DOWN, BlockTraits.DIRECTION, BlockTraits.TREE_SPECIES);
    public static final BlockType MONSTER_EGG = BlockType.of(Identifiers.MONSTER_EGG, BlockTraits.MONSTER_EGG_STONE_TYPE);
    public static final BlockType STONEBRICK = BlockType.of(Identifiers.STONEBRICK, BlockTraits.STONE_BRICK_TYPE);
    public static final BlockType BROWN_MUSHROOM_BLOCK = BlockType.of(Identifiers.BROWN_MUSHROOM_BLOCK, BlockTraits.HUGE_MUSHROOM_BITS);
    public static final BlockType RED_MUSHROOM_BLOCK = BlockType.of(Identifiers.RED_MUSHROOM_BLOCK, BlockTraits.HUGE_MUSHROOM_BITS);
    public static final BlockType IRON_BARS = BlockType.of(Identifiers.IRON_BARS);
    public static final BlockType GLASS_PANE = BlockType.of(Identifiers.GLASS_PANE);
    public static final BlockType MELON_BLOCK = BlockType.of(Identifiers.MELON_BLOCK);
    public static final BlockType PUMPKIN_STEM = BlockType.of(Identifiers.PUMPKIN_STEM, BlockTraits.FACING_DIRECTION, BlockTraits.GROWTH);
    public static final BlockType MELON_STEM = BlockType.of(Identifiers.MELON_STEM, BlockTraits.FACING_DIRECTION, BlockTraits.GROWTH);
    public static final BlockType VINE = BlockType.of(Identifiers.VINE, BlockTraits.VINE_DIRECTION_BITS);
    public static final BlockType WOODEN_FENCE_GATE = BlockType.of(Identifiers.OAK_FENCE_GATE, BlockTraits.IS_IN_WALL, BlockTraits.IS_OPEN, BlockTraits.DIRECTION, BlockTraits.TREE_SPECIES);
    public static final BlockType MYCELIUM = BlockType.of(Identifiers.MYCELIUM);
    public static final BlockType WATERLILY = BlockType.of(Identifiers.WATERLILY);
    public static final BlockType NETHER_BRICK = BlockType.of(Identifiers.NETHER_BRICK, BlockTraits.NETHER_BRICK_TYPE);
    public static final BlockType NETHER_BRICK_FENCE = BlockType.of(Identifiers.NETHER_BRICK_FENCE);
    public static final BlockType NETHER_WART = BlockType.of(Identifiers.NETHER_WART, BlockTraits.WART_GROWTH);
    public static final BlockType ENCHANTING_TABLE = BlockType.of(Identifiers.ENCHANTING_TABLE);
    public static final BlockType BREWING_STAND = BlockType.of(Identifiers.BREWING_STAND, BlockTraits.IS_BREWING_C, BlockTraits.IS_BREWING_A, BlockTraits.IS_BREWING_B);
    public static final BlockType CAULDRON = BlockType.of(Identifiers.CAULDRON, BlockTraits.FILL_LEVEL, BlockTraits.FLUID_TYPE, BlockTraits.CAULDRON_TYPE);
    public static final BlockType END_PORTAL = BlockType.of(Identifiers.END_PORTAL);
    public static final BlockType END_PORTAL_FRAME = BlockType.of(Identifiers.END_PORTAL_FRAME, BlockTraits.HAS_END_PORTAL_EYE, BlockTraits.DIRECTION);
    public static final BlockType END_STONE = BlockType.of(Identifiers.END_STONE);
    public static final BlockType DRAGON_EGG = BlockType.of(Identifiers.DRAGON_EGG);
    public static final BlockType REDSTONE_LAMP = BlockType.of(Identifiers.REDSTONE_LAMP, BlockTraits.IS_POWERED);
    //    public static final BlockType LIT_REDSTONE_LAMP = BlockType.of(Identifiers.LIT_REDSTONE_LAMP);
    public static final BlockType DROPPER = BlockType.of(Identifiers.DROPPER, BlockTraits.FACING_DIRECTION, BlockTraits.IS_TRIGGERED);
    public static final BlockType ACTIVATOR_RAIL = BlockType.of(Identifiers.ACTIVATOR_RAIL, BlockTraits.SIMPLE_RAIL_DIRECTION, BlockTraits.IS_POWERED);
    public static final BlockType COCOA = BlockType.of(Identifiers.COCOA, BlockTraits.COCOA_AGE, BlockTraits.DIRECTION);
    public static final BlockType EMERALD_ORE = BlockType.of(Identifiers.EMERALD_ORE);
    public static final BlockType ENDER_CHEST = BlockType.of(Identifiers.ENDER_CHEST, BlockTraits.FACING_DIRECTION);
    public static final BlockType TRIPWIRE_HOOK = BlockType.of(Identifiers.TRIPWIRE_HOOK, BlockTraits.IS_POWERED, BlockTraits.IS_ATTACHED, BlockTraits.DIRECTION);
    public static final BlockType TRIPWIRE = BlockType.of(Identifiers.TRIPWIRE, BlockTraits.IS_POWERED, BlockTraits.IS_SUSPENDED, BlockTraits.IS_DISARMED, BlockTraits.IS_ATTACHED);
    public static final BlockType EMERALD_BLOCK = BlockType.of(Identifiers.EMERALD_BLOCK);
    public static final BlockType COMMAND_BLOCK = BlockType.of(Identifiers.COMMAND_BLOCK, BlockTraits.IS_CONDITIONAL, BlockTraits.FACING_DIRECTION);
    public static final BlockType BEACON = BlockType.of(Identifiers.BEACON);
    public static final BlockType STONE_WALL = BlockType.of(Identifiers.COBBLESTONE_WALL, BlockTraits.WALL_CONNECTION_EAST, BlockTraits.HAS_POST, BlockTraits.WALL_CONNECTION_SOUTH, BlockTraits.WALL_CONNECTION_WEST, BlockTraits.WALL_CONNECTION_NORTH, BlockTraits.WALL_BLOCK_TYPE);
    public static final BlockType FLOWER_POT = BlockType.of(Identifiers.FLOWER_POT, BlockTraits.HAS_UPDATE);
    public static final BlockType CARROTS = BlockType.of(Identifiers.CARROTS, BlockTraits.GROWTH);
    public static final BlockType POTATOES = BlockType.of(Identifiers.POTATOES, BlockTraits.GROWTH);
    public static final BlockType WOODEN_BUTTON = BlockType.of(Identifiers.OAK_BUTTON, BlockTraits.IS_BUTTON_PRESSED, BlockTraits.FACING_DIRECTION, BlockTraits.TREE_SPECIES);
    public static final BlockType SKULL = BlockType.of(Identifiers.SKULL, BlockTraits.FACING_DIRECTION, BlockTraits.HAS_NO_DROP);
    public static final BlockType ANVIL = BlockType.of(Identifiers.ANVIL, BlockTraits.DAMAGE, BlockTraits.DIRECTION);
    public static final BlockType TRAPPED_CHEST = BlockType.of(Identifiers.TRAPPED_CHEST, BlockTraits.FACING_DIRECTION);
    public static final BlockType LIGHT_WEIGHTED_PRESSURE_PLATE = BlockType.of(Identifiers.LIGHT_WEIGHTED_PRESSURE_PLATE, BlockTraits.REDSTONE_SIGNAL);
    public static final BlockType HEAVY_WEIGHTED_PRESSURE_PLATE = BlockType.of(Identifiers.HEAVY_WEIGHTED_PRESSURE_PLATE, BlockTraits.REDSTONE_SIGNAL);
    public static final BlockType COMPARATOR = BlockType.of(Identifiers.UNPOWERED_COMPARATOR, BlockTraits.IS_OUTPUT_LIT, BlockTraits.IS_OUTPUT_SUBTRACT, BlockTraits.DIRECTION, BlockTraits.IS_POWERED);
    public static final BlockType DAYLIGHT_DETECTOR = BlockType.of(Identifiers.DAYLIGHT_DETECTOR, BlockTraits.REDSTONE_SIGNAL);
    public static final BlockType REDSTONE_BLOCK = BlockType.of(Identifiers.REDSTONE_BLOCK);
    public static final BlockType QUARTZ_ORE = BlockType.of(Identifiers.QUARTZ_ORE);
    public static final BlockType HOPPER = BlockType.of(Identifiers.HOPPER, BlockTraits.FACING_DIRECTION, BlockTraits.IS_TOGGLED);
    public static final BlockType QUARTZ_BLOCK = BlockType.of(Identifiers.QUARTZ_BLOCK, BlockTraits.CHISEL_TYPE, BlockTraits.AXIS);
    public static final BlockType WOODEN_SLAB = BlockType.of(Identifiers.WOODEN_SLAB, BlockTraits.SLAB_SLOT, BlockTraits.TREE_SPECIES);
    public static final BlockType STAINED_HARDENED_CLAY = BlockType.of(Identifiers.STAINED_HARDENED_CLAY, BlockTraits.COLOR);
    public static final BlockType STAINED_GLASS_PANE = BlockType.of(Identifiers.STAINED_GLASS_PANE, BlockTraits.COLOR);
    public static final BlockType SLIME = BlockType.of(Identifiers.SLIME);
    public static final BlockType IRON_TRAPDOOR = BlockType.of(Identifiers.IRON_TRAPDOOR, BlockTraits.DIRECTION, BlockTraits.IS_UPSIDE_DOWN, BlockTraits.IS_OPEN);
    public static final BlockType PRISMARINE = BlockType.of(Identifiers.PRISMARINE, BlockTraits.PRISMARINE_BLOCK_TYPE);
    public static final BlockType SEA_LANTERN = BlockType.of(Identifiers.SEA_LANTERN);
    public static final BlockType HAY_BLOCK = BlockType.of(Identifiers.HAY_BLOCK, BlockTraits.DEPRECATED, BlockTraits.AXIS);
    public static final BlockType CARPET = BlockType.of(Identifiers.CARPET, BlockTraits.COLOR);
    public static final BlockType HARDENED_CLAY = BlockType.of(Identifiers.HARDENED_CLAY);
    public static final BlockType COAL_BLOCK = BlockType.of(Identifiers.COAL_BLOCK);
    public static final BlockType PACKED_ICE = BlockType.of(Identifiers.PACKED_ICE);
    public static final BlockType DOUBLE_PLANT = BlockType.of(Identifiers.DOUBLE_PLANT, BlockTraits.IS_UPPER_BLOCK, BlockTraits.DOUBLE_PLANT_TYPE);
    public static final BlockType STANDING_BANNER = BlockType.of(Identifiers.STANDING_BANNER, BlockTraits.CARDINAL_DIRECTION);
    public static final BlockType WALL_BANNER = BlockType.of(Identifiers.WALL_BANNER, BlockTraits.FACING_DIRECTION);
    public static final BlockType DAYLIGHT_DETECTOR_INVERTED = BlockType.of(Identifiers.DAYLIGHT_DETECTOR_INVERTED, BlockTraits.REDSTONE_SIGNAL);
    public static final BlockType RED_SANDSTONE = BlockType.of(Identifiers.RED_SANDSTONE, BlockTraits.SAND_STONE_TYPE);
    public static final BlockType REPEATING_COMMAND_BLOCK = BlockType.of(Identifiers.REPEATING_COMMAND_BLOCK, BlockTraits.IS_CONDITIONAL, BlockTraits.FACING_DIRECTION);
    public static final BlockType CHAIN_COMMAND_BLOCK = BlockType.of(Identifiers.CHAIN_COMMAND_BLOCK, BlockTraits.IS_CONDITIONAL, BlockTraits.FACING_DIRECTION);
    public static final BlockType HARD_GLASS_PANE = BlockType.of(Identifiers.HARD_GLASS_PANE);
    public static final BlockType HARD_STAINED_GLASS_PANE = BlockType.of(Identifiers.HARD_STAINED_GLASS_PANE, BlockTraits.COLOR);
    public static final BlockType CHEMICAL_HEAT = BlockType.of(Identifiers.CHEMICAL_HEAT);
    public static final BlockType GRASS_PATH = BlockType.of(Identifiers.GRASS_PATH);
    public static final BlockType FRAME = BlockType.of(Identifiers.FRAME, BlockTraits.IS_GLOWING, BlockTraits.FACING_DIRECTION, BlockTraits.HAS_MAP);
    public static final BlockType CHORUS_FLOWER = BlockType.of(Identifiers.CHORUS_FLOWER, BlockTraits.CHORUS_AGE);
    public static final BlockType PURPUR_BLOCK = BlockType.of(Identifiers.PURPUR_BLOCK, BlockTraits.CHISEL_TYPE, BlockTraits.AXIS);
    public static final BlockType COLORED_TORCH_RG = BlockType.of(Identifiers.COLORED_TORCH_RG, BlockTraits.HAS_COLOR, BlockTraits.TORCH_DIRECTION);
    public static final BlockType COLORED_TORCH_BP = BlockType.of(Identifiers.COLORED_TORCH_BP, BlockTraits.HAS_COLOR, BlockTraits.TORCH_DIRECTION);
    public static final BlockType UNDYED_SHULKER_BOX = BlockType.of(Identifiers.UNDYED_SHULKER_BOX);
    public static final BlockType END_BRICKS = BlockType.of(Identifiers.END_BRICKS);
    public static final BlockType FROSTED_ICE = BlockType.of(Identifiers.FROSTED_ICE, BlockTraits.ICE_AGE);
    public static final BlockType END_ROD = BlockType.of(Identifiers.END_ROD, BlockTraits.FACING_DIRECTION);
    public static final BlockType END_GATEWAY = BlockType.of(Identifiers.END_GATEWAY);
    public static final BlockType ALLOW = BlockType.of(Identifiers.ALLOW);
    public static final BlockType DENY = BlockType.of(Identifiers.DENY);
    public static final BlockType BORDER_BLOCK = BlockType.of(Identifiers.BORDER_BLOCK, BlockTraits.WALL_CONNECTION_EAST, BlockTraits.HAS_POST, BlockTraits.WALL_CONNECTION_SOUTH, BlockTraits.WALL_CONNECTION_WEST, BlockTraits.WALL_CONNECTION_NORTH);
    public static final BlockType MAGMA = BlockType.of(Identifiers.MAGMA);
    public static final BlockType NETHER_WART_BLOCK = BlockType.of(Identifiers.NETHER_WART_BLOCK, BlockTraits.TREE_SPECIES_NETHER);
    public static final BlockType BONE_BLOCK = BlockType.of(Identifiers.BONE_BLOCK, BlockTraits.DEPRECATED, BlockTraits.AXIS);
    public static final BlockType STRUCTURE_VOID = BlockType.of(Identifiers.STRUCTURE_VOID, BlockTraits.STRUCTURE_VOID_TYPE);
    public static final BlockType SHULKER_BOX = BlockType.of(Identifiers.SHULKER_BOX, BlockTraits.COLOR);
    public static final BlockType GLAZED_TERRACOTTA = BlockType.of(Identifiers.WHITE_GLAZED_TERRACOTTA, BlockTraits.FACING_DIRECTION, BlockTraits.COLOR);
    public static final BlockType CONCRETE = BlockType.of(Identifiers.CONCRETE, BlockTraits.COLOR);
    public static final BlockType CONCRETE_POWDER = BlockType.of(Identifiers.CONCRETE_POWDER, BlockTraits.COLOR);
    public static final BlockType CHEMISTRY_TABLE = BlockType.of(Identifiers.CHEMISTRY_TABLE, BlockTraits.CHEMISTRY_TABLE_TYPE, BlockTraits.DIRECTION);
    public static final BlockType UNDERWATER_TORCH = BlockType.of(Identifiers.UNDERWATER_TORCH, BlockTraits.TORCH_DIRECTION);
    public static final BlockType CHORUS_PLANT = BlockType.of(Identifiers.CHORUS_PLANT);
    public static final BlockType STAINED_GLASS = BlockType.of(Identifiers.STAINED_GLASS, BlockTraits.COLOR);
    public static final BlockType CAMERA = BlockType.of(Identifiers.CAMERA);
    public static final BlockType PODZOL = BlockType.of(Identifiers.PODZOL);
    public static final BlockType BEETROOT = BlockType.of(Identifiers.BEETROOT, BlockTraits.GROWTH);
    public static final BlockType STONECUTTER = BlockType.of(Identifiers.STONECUTTER);
    public static final BlockType GLOWING_OBSIDIAN = BlockType.of(Identifiers.GLOWING_OBSIDIAN);
    public static final BlockType NETHER_REACTOR = BlockType.of(Identifiers.NETHER_REACTOR);
    public static final BlockType INFO_UPDATE = BlockType.of(Identifiers.INFO_UPDATE);
    public static final BlockType INFO_UPDATE2 = BlockType.of(Identifiers.INFO_UPDATE2);
    public static final BlockType MOVING_BLOCK = BlockType.of(Identifiers.MOVING_BLOCK);
    public static final BlockType OBSERVER = BlockType.of(Identifiers.OBSERVER, BlockTraits.FACING_DIRECTION, BlockTraits.IS_POWERED);
    public static final BlockType STRUCTURE_BLOCK = BlockType.of(Identifiers.STRUCTURE_BLOCK, BlockTraits.STRUCTURE_BLOCK_TYPE);
    public static final BlockType HARD_GLASS = BlockType.of(Identifiers.HARD_GLASS);
    public static final BlockType HARD_STAINED_GLASS = BlockType.of(Identifiers.HARD_STAINED_GLASS, BlockTraits.COLOR);
    public static final BlockType RESERVED6 = BlockType.of(Identifiers.RESERVED6);
    public static final BlockType BLUE_ICE = BlockType.of(Identifiers.BLUE_ICE);
    public static final BlockType SEAGRASS = BlockType.of(Identifiers.SEAGRASS, BlockTraits.SEA_GRASS_TYPE);
    public static final BlockType CORAL = BlockType.of(Identifiers.CORAL, BlockTraits.CORAL_COLOR, BlockTraits.IS_DEAD);
    public static final BlockType CORAL_BLOCK = BlockType.of(Identifiers.CORAL_BLOCK, BlockTraits.CORAL_COLOR, BlockTraits.IS_DEAD);
    public static final BlockType CORAL_FAN = BlockType.of(Identifiers.CORAL_FAN, BlockTraits.CORAL_COLOR, BlockTraits.CORAL_FAN_DIRECTION);
    public static final BlockType CORAL_FAN_DEAD = BlockType.of(Identifiers.CORAL_FAN_DEAD, BlockTraits.CORAL_COLOR, BlockTraits.CORAL_FAN_DIRECTION);
    public static final BlockType CORAL_FAN_HANG = BlockType.of(Identifiers.CORAL_FAN_HANG, BlockTraits.DIRECTION, BlockTraits.IS_DEAD, BlockTraits.CORAL_HANG_COLOR);
    public static final BlockType KELP = BlockType.of(Identifiers.KELP, BlockTraits.KELP_AGE);
    public static final BlockType DRIED_KELP_BLOCK = BlockType.of(Identifiers.DRIED_KELP_BLOCK);
    public static final BlockType CARVED_PUMPKIN = BlockType.of(Identifiers.CARVED_PUMPKIN, BlockTraits.DIRECTION);
    public static final BlockType SEA_PICKLE = BlockType.of(Identifiers.SEA_PICKLE, BlockTraits.CLUSTER_COUNT, BlockTraits.IS_DEAD);
    public static final BlockType CONDUIT = BlockType.of(Identifiers.CONDUIT);
    public static final BlockType TURTLE_EGG = BlockType.of(Identifiers.TURTLE_EGG, BlockTraits.CRACKED_STATE, BlockTraits.TURTLE_EGG_COUNT);
    public static final BlockType BUBBLE_COLUMN = BlockType.of(Identifiers.BUBBLE_COLUMN, BlockTraits.HAS_DRAG_DOWN);
    public static final BlockType BARRIER = BlockType.of(Identifiers.BARRIER);
    public static final BlockType BAMBOO = BlockType.of(Identifiers.BAMBOO, BlockTraits.BAMBOO_LEAF_SIZE, BlockTraits.HAS_AGE, BlockTraits.BAMBOO_STALK_THICKNESS);
    public static final BlockType BAMBOO_SAPLING = BlockType.of(Identifiers.BAMBOO_SAPLING, BlockTraits.HAS_AGE, BlockTraits.TREE_SPECIES_OVERWORLD);
    public static final BlockType SCAFFOLDING = BlockType.of(Identifiers.SCAFFOLDING, BlockTraits.STABILITY, BlockTraits.HAS_STABILITY_CHECK);
    public static final BlockType SMOOTH_STONE = BlockType.of(Identifiers.SMOOTH_STONE);
    public static final BlockType LECTERN = BlockType.of(Identifiers.LECTERN, BlockTraits.IS_POWERED, BlockTraits.DIRECTION);
    public static final BlockType GRINDSTONE = BlockType.of(Identifiers.GRINDSTONE, BlockTraits.DIRECTION, BlockTraits.ATTACHMENT);
    public static final BlockType BLAST_FURNACE = BlockType.of(Identifiers.BLAST_FURNACE, BlockTraits.FACING_DIRECTION, BlockTraits.IS_EXTINGUISHED);
    public static final BlockType STONECUTTER_BLOCK = BlockType.of(Identifiers.STONECUTTER_BLOCK, BlockTraits.FACING_DIRECTION);
    public static final BlockType SMOKER = BlockType.of(Identifiers.SMOKER, BlockTraits.FACING_DIRECTION, BlockTraits.IS_EXTINGUISHED);
    public static final BlockType CARTOGRAPHY_TABLE = BlockType.of(Identifiers.CARTOGRAPHY_TABLE);
    public static final BlockType FLETCHING_TABLE = BlockType.of(Identifiers.FLETCHING_TABLE);
    public static final BlockType SMITHING_TABLE = BlockType.of(Identifiers.SMITHING_TABLE);
    public static final BlockType BARREL = BlockType.of(Identifiers.BARREL, BlockTraits.FACING_DIRECTION, BlockTraits.IS_OPEN);
    public static final BlockType LOOM = BlockType.of(Identifiers.LOOM, BlockTraits.DIRECTION);
    public static final BlockType BELL = BlockType.of(Identifiers.BELL, BlockTraits.ATTACHMENT, BlockTraits.IS_TOGGLED, BlockTraits.DIRECTION);
    public static final BlockType SWEET_BERRY_BUSH = BlockType.of(Identifiers.SWEET_BERRY_BUSH, BlockTraits.GROWTH);
    public static final BlockType LANTERN = BlockType.of(Identifiers.LANTERN, BlockTraits.IS_HANGING, BlockTraits.IS_SOUL);
    public static final BlockType CAMPFIRE = BlockType.of(Identifiers.CAMPFIRE, BlockTraits.IS_EXTINGUISHED, BlockTraits.DIRECTION, BlockTraits.IS_SOUL);
    public static final BlockType JIGSAW = BlockType.of(Identifiers.JIGSAW, BlockTraits.FACING_DIRECTION, BlockTraits.DIRECTION);
    public static final BlockType WOOD = BlockType.of(Identifiers.WOOD, BlockTraits.IS_STRIPPED, BlockTraits.AXIS, BlockTraits.TREE_SPECIES);
    public static final BlockType COMPOSTER = BlockType.of(Identifiers.COMPOSTER, BlockTraits.COMPOSTER_FILL_LEVEL);
    public static final BlockType LIGHT_BLOCK = BlockType.of(Identifiers.LIGHT_BLOCK, BlockTraits.LIGHT_LEVEL);
    public static final BlockType WITHER_ROSE = BlockType.of(Identifiers.WITHER_ROSE);
    public static final BlockType BEE_NEST = BlockType.of(Identifiers.BEE_NEST, BlockTraits.DIRECTION, BlockTraits.HONEY_LEVEL);
    public static final BlockType BEEHIVE = BlockType.of(Identifiers.BEEHIVE, BlockTraits.DIRECTION, BlockTraits.HONEY_LEVEL);
    public static final BlockType HONEY_BLOCK = BlockType.of(Identifiers.HONEY_BLOCK);
    public static final BlockType HONEYCOMB_BLOCK = BlockType.of(Identifiers.HONEYCOMB_BLOCK);
    public static final BlockType LODESTONE = BlockType.of(Identifiers.LODESTONE);
    public static final BlockType NETHER_ROOTS = BlockType.of(Identifiers.CRIMSON_ROOTS, BlockTraits.TREE_SPECIES_NETHER);
    public static final BlockType NETHER_FUNGUS = BlockType.of(Identifiers.CRIMSON_FUNGUS, BlockTraits.TREE_SPECIES_NETHER);
    public static final BlockType SHROOMLIGHT = BlockType.of(Identifiers.SHROOMLIGHT);
    public static final BlockType WEEPING_VINES = BlockType.of(Identifiers.WEEPING_VINES, BlockTraits.WEEPING_VINES_AGE);
    public static final BlockType NETHER_NYLIUM = BlockType.of(Identifiers.CRIMSON_NYLIUM, BlockTraits.TREE_SPECIES_NETHER);
    public static final BlockType BASALT = BlockType.of(Identifiers.BASALT, BlockTraits.AXIS);
    public static final BlockType POLISHED_BASALT = BlockType.of(Identifiers.POLISHED_BASALT, BlockTraits.AXIS);
    public static final BlockType SOUL_SOIL = BlockType.of(Identifiers.SOUL_SOIL);
    public static final BlockType SOUL_FIRE = BlockType.of(Identifiers.SOUL_FIRE, BlockTraits.AGE);
    public static final BlockType NETHER_SPROUTS = BlockType.of(Identifiers.NETHER_SPROUTS);
    public static final BlockType TARGET = BlockType.of(Identifiers.TARGET);
    public static final BlockType NETHERITE_BLOCK = BlockType.of(Identifiers.NETHERITE_BLOCK);
    public static final BlockType ANCIENT_DEBRIS = BlockType.of(Identifiers.ANCIENT_DEBRIS);
    public static final BlockType RESPAWN_ANCHOR = BlockType.of(Identifiers.RESPAWN_ANCHOR, BlockTraits.RESPAWN_ANCHOR_CHARGE);
    public static final BlockType BLACKSTONE = BlockType.of(Identifiers.BLACKSTONE);
    public static final BlockType POLISHED_BLACKSTONE_BRICKS = BlockType.of(Identifiers.POLISHED_BLACKSTONE_BRICKS);
    public static final BlockType CHISELED_POLISHED_BLACKSTONE = BlockType.of(Identifiers.CHISELED_POLISHED_BLACKSTONE);
    public static final BlockType CRACKED_POLISHED_BLACKSTONE_BRICKS = BlockType.of(Identifiers.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final BlockType GILDED_BLACKSTONE = BlockType.of(Identifiers.GILDED_BLACKSTONE);
    public static final BlockType CHAIN = BlockType.of(Identifiers.CHAIN, BlockTraits.AXIS);
    public static final BlockType TWISTING_VINES = BlockType.of(Identifiers.TWISTING_VINES, BlockTraits.TWISTING_VINES_AGE);
    public static final BlockType NETHER_GOLD_ORE = BlockType.of(Identifiers.NETHER_GOLD_ORE);
    public static final BlockType CRYING_OBSIDIAN = BlockType.of(Identifiers.CRYING_OBSIDIAN);
    public static final BlockType POLISHED_BLACKSTONE = BlockType.of(Identifiers.POLISHED_BLACKSTONE);
    public static final BlockType QUARTZ_BRICKS = BlockType.of(Identifiers.QUARTZ_BRICKS);
    /* 1.17 Blocks */
    public static final BlockType POWDER_SNOW = BlockType.of(BlockIds.POWDER_SNOW);
    public static final BlockType SCULK_SENSOR = BlockType.of(BlockIds.SCULK_SENSOR, BlockTraits.IS_POWERED);
    public static final BlockType POINTED_DRIPSTONE = BlockType.of(BlockIds.POINTED_DRIPSTONE, BlockTraits.DRIPSTONE_THICKNESS, BlockTraits.IS_HANGING);
    public static final BlockType COPPER_ORE = BlockType.of(BlockIds.COPPER_ORE);
    public static final BlockType LIGHTNING_ROD = BlockType.of(BlockIds.LIGHTNING_ROD, BlockTraits.FACING_DIRECTION);
    public static final BlockType DRIPSTONE_BLOCK = BlockType.of(BlockIds.DRIPSTONE_BLOCK);
    public static final BlockType DIRT_WITH_ROOTS = BlockType.of(BlockIds.DIRT_WITH_ROOTS);
    public static final BlockType HANGING_ROOTS = BlockType.of(BlockIds.HANGING_ROOTS);
    public static final BlockType MOSS_BLOCK = BlockType.of(BlockIds.MOSS_BLOCK);
    public static final BlockType SPORE_BLOSSOM = BlockType.of(BlockIds.SPORE_BLOSSOM);
    public static final BlockType BIG_DRIPLEAF = BlockType.of(BlockIds.BIG_DRIPLEAF, BlockTraits.DRIPLEAF_HEAD, BlockTraits.DRIPLEAF_TILT, BlockTraits.DIRECTION);
    public static final BlockType AZALEA_LEAVES = BlockType.of(BlockIds.AZALEA_LEAVES, BlockTraits.IS_FLOWERED, BlockTraits.IS_PERSISTENT, BlockTraits.HAS_UPDATE);
    public static final BlockType CALCITE = BlockType.of(BlockIds.CALCITE);
    public static final BlockType AMETHYST_BLOCK = BlockType.of(BlockIds.AMETHYST_BLOCK);
    public static final BlockType BUDDING_AMETHYST = BlockType.of(BlockIds.BUDDING_AMETHYST);
    public static final BlockType AMETHYST_CLUSTER = BlockType.of(BlockIds.AMETHYST_CLUSTER, BlockTraits.CLUSTER_SIZE);
    public static final BlockType TUFF = BlockType.of(BlockIds.TUFF);
    public static final BlockType TINTED_GLASS = BlockType.of(BlockIds.TINTED_GLASS);
    public static final BlockType MOSS_CARPET = BlockType.of(BlockIds.MOSS_CARPET);
    public static final BlockType SMALL_DRIPLEAF = BlockType.of(BlockIds.SMALL_DRIPLEAF_BLOCK, BlockTraits.DIRECTION, BlockTraits.IS_UPPER_BLOCK);
    public static final BlockType AZALEA = BlockType.of(BlockIds.AZALEA, BlockTraits.IS_FLOWERED);
    public static final BlockType COPPER = BlockType.of(BlockIds.COPPER_BLOCK, BlockTraits.COPPER_TYPE);
    public static final BlockType CUT_COPPER = BlockType.of(BlockIds.CUT_COPPER, BlockTraits.COPPER_TYPE);
    public static final BlockType COPPER_STAIRS = BlockType.of(BlockIds.CUT_COPPER_STAIRS, BlockTraits.COPPER_TYPE, BlockTraits.IS_UPSIDE_DOWN, BlockTraits.DIRECTION);
    public static final BlockType COPPER_SLAB = BlockType.of(BlockIds.CUT_COPPER_SLAB, BlockTraits.SLAB_SLOT);
    public static final BlockType CAVE_VINES = BlockType.of(BlockIds.CAVE_VINES, BlockTraits.CAVE_VINE_TYPE, BlockTraits.CAVE_VINE_AGE);
    public static final BlockType SMOOTH_BASALT = BlockType.of(BlockIds.SMOOTH_BASALT);
    public static final BlockType DEEPSLATE = BlockType.of(BlockIds.DEEPSLATE, BlockTraits.AXIS);
    public static final BlockType COBBLED_DEEPSLATE = BlockType.of(BlockIds.COBBLED_DEEPSLATE);
    public static final BlockType POLISHED_DEEPSLATE = BlockType.of(BlockIds.POLISHED_DEEPSLATE);
    public static final BlockType DEEPSLATE_TILES = BlockType.of(BlockIds.DEEPSLATE_TILES);
    public static final BlockType DEEPSLATE_BRICKS = BlockType.of(BlockIds.DEEPSLATE_BRICKS);
    public static final BlockType CHISELED_DEEPSLATE = BlockType.of(BlockIds.CHISELED_DEEPSLATE);
    public static final BlockType DEEPSLATE_LAPIS_ORE = BlockType.of(BlockIds.DEEPSLATE_LAPIS_LAZULI_ORE);
    public static final BlockType DEEPSLATE_IRON_ORE = BlockType.of(BlockIds.DEEPSLATE_IRON_ORE);
    public static final BlockType DEEPSLATE_GOLD_ORE = BlockType.of(BlockIds.DEEPSLATE_GOLD_ORE);
    public static final BlockType DEEPSLATE_REDSTONE_ORE = BlockType.of(BlockIds.DEEPSLATE_REDSTONE_ORE, BlockTraits.IS_EXTINGUISHED);
    public static final BlockType DEEPSLATE_DIAMOND_ORE = BlockType.of(BlockIds.DEEPSLATE_DIAMOND_ORE);
    public static final BlockType DEEPSLATE_COAL_ORE = BlockType.of(BlockIds.DEEPSLATE_COAL_ORE);
    public static final BlockType DEEPSLATE_EMERALD_ORE = BlockType.of(BlockIds.DEEPSLATE_EMERALD_ORE);
    public static final BlockType DEEPSLATE_COPPER_ORE = BlockType.of(BlockIds.DEEPSLATE_COPPER_ORE);
    public static final BlockType CRACKED_DEEPSLATE_TILES = BlockType.of(BlockIds.CRACKED_DEEPSLATE_TILES);
    public static final BlockType CRACKED_DEEPSLATE_BRICKS = BlockType.of(BlockIds.CRACKED_DEEPSLATE_BRICKS);
    public static final BlockType GLOW_LICHEN = BlockType.of(BlockIds.GLOW_LICHEN, BlockTraits.MULTI_FACE_DIRECTION);

    public static final BlockType RAW_COPPER_BLOCK = BlockType.of(BlockIds.RAW_COPPER_BLOCK);
    public static final BlockType RAW_IRON_BLOCK = BlockType.of(BlockIds.RAW_IRON_BLOCK);
    public static final BlockType RAW_GOLD_BLOCK = BlockType.of(BlockIds.RAW_GOLD_BLOCK);

    public static final BlockType UNKNOWN = BlockType.of(Identifiers.UNKNOWN);
}
