package gtqt.example;

import gtqt.example.api.utils.GTQTExampleLog;
import gtqt.example.client.ClientProxy;
import gtqt.example.common.CommonProxy;
import gtqt.example.common.block.GTQTExampleMetaBlocks;
import gtqt.example.common.item.GTQTExampleMetaItems;
import gtqt.example.common.metatileentities.GTQTExampleMetaTileEntities;
import gtqt.example.gtqtexample.Tags;
import keqing.gtqtcore.common.worldgen.WorldGenAbandonedBase;
import keqing.gtqtcore.integration.GTQTIntegration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = "gtqtexample",
        name = "GTQT Example",
        acceptedMinecraftVersions = "[1.12.2,1.13)",
        version = "0.0.1"
)
public class GTQTExample {
    public static final String PACK = "1.8.0";

    public static final String MODID = "gtqtexample";
    public static final String NAME = "GTQT Example";
    public static final String VERSION = "0624(2025/6/24)";

    @Mod.Instance(Tags.MOD_ID)
    public static GTQTExample instance;

    @SidedProxy(
            clientSide = "gtqt.example.client.ClientProxy",
            serverSide = "gtqt.example.common.CommonProxy"
    )
    public static CommonProxy proxy;
    public static ClientProxy cproxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        GTQTExampleLog.init(event.getModLog());
        GTQTExampleMetaItems.initialization();
        GTQTExampleMetaBlocks.init();
        GTQTExampleMetaTileEntities.initialization();
        proxy.preLoad();
        proxy.preInit();


    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        GTQTIntegration.init();
        GameRegistry.registerWorldGenerator(new WorldGenAbandonedBase(), 20000);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void construction(FMLConstructionEvent event) {
        proxy.construction();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        proxy.loadComplete();
    }
}
