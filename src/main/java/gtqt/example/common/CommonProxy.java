package gtqt.example.common;

import gregtech.api.GregTechAPI;
import gregtech.api.cover.CoverDefinition;
import gregtech.common.items.MetaItems;
import gregtech.loaders.recipe.CraftingComponent;
import gtqt.example.api.utils.GTQTExampleLog;
import gtqt.example.loader.GTQTExampleRecipesHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;
import java.util.function.Function;

@Mod.EventBusSubscriber(
        modid = "gtqtexample"
)
public class CommonProxy {

    /*
     * 注册物品栏的示例，并且设置图标
     * 关于物品栏的名称可移步lang文件注册
     */
    public static final CreativeTabs GTQTExample_TAB = new CreativeTabs("gtqtexample") {
        @Override
        public ItemStack createIcon() {
            return MetaItems.STEM_CELLS.getStackForm();
        }
    };

    public CommonProxy() {
    }

    @SubscribeEvent
    public static void registerRecipeHandlers(RegistryEvent.Register<IRecipe> event) {
        GTQTExampleLog.logger.info("Registering Recipe Handlers...");

    }

    @SubscribeEvent
    public static void registerCoverBehavior(GregTechAPI.RegisterEvent<CoverDefinition> event) {
        GTQTExampleLog.logger.info("Registering Cover Behaviors...");

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        GTQTExampleLog.logger.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
        /*
        在此处注册方块
        例子：
        registry.register(方块实例);
        在注册MetaBlock时用到
        */

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        GTQTExampleLog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();
        /*
        在此处注册方块的物品
        例子：
        registry.register(createItemBlock(方块实例, VariantItemBlock::new));
        在注册MetaBlock时用到
        */

    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GTQTExampleLog.logger.info("Registering recipes...");
        GTQTExampleRecipesHandler.init();
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void registerMaterialComponents(GregTechAPI.RegisterEvent<CraftingComponent> event) {
        GTQTExampleLog.logger.info("Registering material components...");

    }

    public void preLoad() {
    }

    public void init() {
    }

    public void loadComplete() {
    }

    public void postInit() {
    }

    public void construction() {
    }

    public void preInit() {
    }
}
