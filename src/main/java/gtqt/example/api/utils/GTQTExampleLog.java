package gtqt.example.api.utils;

import org.apache.logging.log4j.Logger;

public class GTQTExampleLog {
    public static Logger logger;

    public GTQTExampleLog() {
    }

    public static void init(Logger modLogger) {
        logger = modLogger;
    }
}
