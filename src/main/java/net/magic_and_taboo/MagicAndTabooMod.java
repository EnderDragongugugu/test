package net.magic_and_taboo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.magic_and_taboo.client.MagicAndTabooClient;
import net.magic_and_taboo.client.gui.screen.handler.SpyglassSextantUIScreenHandler;
import net.magic_and_taboo.init.MATBlockEntities;
import net.magic_and_taboo.init.MATBlocks;
import net.magic_and_taboo.init.MATItemGroup;
import net.magic_and_taboo.init.MATItems;
import net.magic_and_taboo.util.MATRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class MagicAndTabooMod implements ModInitializer {
    public static final String MOD_ID = "magic_and_taboo";

    public static final MATRegistry MJ_REGISTRY = new MATRegistry();
    public MagicAndTabooMod(){}
    public static void main(String[] args){

    }
    public static final ScreenHandlerType<net.magic_and_taboo.client.gui.screen.handler.SpyglassSextantUIScreenHandler> SpyglassSextantUIScreenHandler;
    static {
        SpyglassSextantUIScreenHandler = ScreenHandlerRegistry.registerSimple(new Identifier(MagicAndTabooMod.MOD_ID,"SpyglassSextantUI"), SpyglassSextantUIScreenHandler::new);
    }
    public void onInitialize(){
        MJ_REGISTRY.registryItem("calendar", MATItems.CALENDAR);
        MJ_REGISTRY.registryItem("calendar_watches", MATItems.CALENDAR_WATCHES);
        MJ_REGISTRY.registryItem("copper_coin", MATItems.COPPER_COIN);
        MJ_REGISTRY.registryItem("copper_watches", MATItems.COPPER_WATCHES);
        MJ_REGISTRY.registryItem("gold_coin", MATItems.GOLD_COIN);
        MJ_REGISTRY.registryItem("silver_coin", MATItems.SILVER_COIN);
        MJ_REGISTRY.registryItem("star_book", MATItems.STAR_BOOK);
        MJ_REGISTRY.registryItem("star_book_max", MATItems.STAR_BOOK_MAX);
        MJ_REGISTRY.registryItem("star_map_empty",MATItems.STAR_MAP_EMPTY);
        MJ_REGISTRY.registryItem("star_map_1",MATItems.STAR_MAP_1);
        MJ_REGISTRY.registryItem("star_map_2",MATItems.STAR_MAP_2);
        MJ_REGISTRY.registryItem("star_map_3",MATItems.STAR_MAP_3);
        MJ_REGISTRY.registryItem("star_map_4",MATItems.STAR_MAP_4);
        MJ_REGISTRY.registryItem("star_map_5",MATItems.STAR_MAP_5);
        MJ_REGISTRY.registryItem("star_map_6",MATItems.STAR_MAP_6);
        MJ_REGISTRY.registryItem("star_map_7",MATItems.STAR_MAP_7);
        MJ_REGISTRY.registryItem("star_map_8",MATItems.STAR_MAP_8);
        MJ_REGISTRY.registryItem("star_map_9",MATItems.STAR_MAP_9);
        MJ_REGISTRY.registryItem("star_map_10",MATItems.STAR_MAP_10);
        MJ_REGISTRY.registryItem("star_map_11",MATItems.STAR_MAP_11);
        MJ_REGISTRY.registryItem("star_map_12",MATItems.STAR_MAP_12);
        MJ_REGISTRY.registryBlock("fir_planks", MATBlocks.FIR_PLANKS, new FabricItemSettings().group(MATItemGroup.MAGIC));
        MJ_REGISTRY.registryBlock("spyglass_sextant", MATBlocks.SPYGLASS_SEXTANT_BLOCK, new FabricItemSettings().group(MATItemGroup.MOONLIGHT));
        MJ_REGISTRY.registryBlockEntity("spyglass_sextant", MATBlockEntities.SPYGLASS_SEXTANT_BLOCK_ENTITY);
//        itemList.add(registry.basicItem("copper_coin", MagicAndTabooMod.MAGIC,64));

////        itemList.add(registry.basicItem("gold_coin", Main.MAGIC,64));
////        itemList.add(registry.basicItem("punk_helmet",ItemGroup.COMBAT,1));
////        itemList.add(registry.basicItem("fir_sapling",main.MAGIC,64));
////        itemList.add(registry.basicItem("moon_helmet",main.MAGIC,64));
////        itemList.add(registry.basicItem("moon_chestplate",main.MAGIC,64));
////        itemList.add(registry.basicItem("moon_leggings",main.MAGIC,64));
////        itemList.add(registry.basicItem("moon_boots",main.MAGIC,64));
//        itemList.add(registry.basicItem("sextant", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("fir_sextant", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_empty", MagicAndTabooMod.MOONLIGHT,64));
//        itemList.add(registry.basicItem("star_map_1", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_2", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_3", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_4", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_5", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_6", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_7", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_8", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_9", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_10", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_11", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_map_12", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("copper_watches", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("calendar", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("calendar_watches", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("star_book", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("star_book_max", MagicAndTabooMod.MOONLIGHT,1));
//        itemList.add(registry.basicItem("brass_ingot", MagicAndTabooMod.MAGIC,64));
////        itemList.add(registry.basicItem("alchemy", Main.MAGIC,16));
////        itemList.add(registry.basicItem("alchemy_book", Main.MAGIC,1));
//        itemList.add(registry.basicItem("magic_lasurite", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("magic_gold_bracelet", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("mercury_slag", MagicAndTabooMod.MAGIC,64));
//        itemList.add(registry.basicItem("soak_book_mercury", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("soak_book_blood", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("soak_book_soul", MagicAndTabooMod.MAGIC,64));
//        itemList.add(registry.basicItem("snoop_eye", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("remains_soul", MagicAndTabooMod.BLOOD,64));
//        itemList.add(registry.basicItem("ground_meat", MagicAndTabooMod.BLOOD,64));
//        itemList.add(registry.basicItem("blood_bottle", MagicAndTabooMod.BLOOD,64));
//        itemList.add(registry.basicItem("wind_wand", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("basics_scroll", MagicAndTabooMod.MAGIC,1));
//        itemList.add(registry.basicItem("rod_end", MagicAndTabooMod.MAGIC,64));
//        itemList.add(registry.basicItem("rod_handle", MagicAndTabooMod.MAGIC,64));
//        itemList.add(registry.basicItem("holy_feather", MagicAndTabooMod.MAGIC,64));
    }
}
