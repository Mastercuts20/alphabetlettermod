package me.Mastercuts20.ForgeTestMod.Util;

import me.Mastercuts20.ForgeTestMod.ModInfo;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class Logger {

    public static void logText(Level level, String text){
        LogManager.getLogger(ModInfo.MOD_ID).log(level, null, text);
    }
}
