package gtqt.example.common.item;

import keqing.gtqtcore.common.items.GTQTMetaItem1;

public class GTQTExampleMetaItems {
    public static GTQTExampleMetaItems1 GTQTE_META_ITEM;

    public static void initialization() {
        GTQTE_META_ITEM = new GTQTExampleMetaItems1();

    }

    public static void initSubItems() {
        GTQTMetaItem1.registerItems();
    }

}
