package gtqt.example.common.metatileentities;

import gtqt.example.api.utils.GTQTExampleLog;

/*
 * 这里注册设备
 */
public class GTQTExampleMetaTileEntities {
    int startID = 0;

    public static void initialization() {
        GTQTExampleLog.logger.info("Registering MetaTileEntities");


    }

    public int getId() {
        return startID++;
    }
}
