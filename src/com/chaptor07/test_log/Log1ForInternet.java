package com.chaptor07.test_log;

import java.io.IOException;
import java.util.logging.*;


public class Log1ForInternet {
    public static void main(String[] args) throws SecurityException, IOException {
        //日志记录器，此时记录器的默认等级为INFO,不能记录更低的记录
        Logger logger = Logger.getLogger("com.chaptor07.test_log");

        //记录设备(接受日志记录的对象，也叫处理器），为记录器添加指定设备 （这里指定位置为log.txt文件）
        FileHandler fileHandler = new FileHandler("log.log", true);
        logger.addHandler(fileHandler);

        //记录的格式，设置记录设备的格式
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        //创建一条指定等级和记录描述的记录，为记录器添加一条记录
        LogRecord logRecord = new LogRecord(Level.INFO, "INFO message");
        logger.log(logRecord);

        //也可这样添加更多的记录
        logger.severe("SEVERE message");
        logger.warning("WARNING message");
        logger.info("INFO message");
        //由于下面等级比较低，所以，不会被记录再log.txt文件中
        logger.config("CONFING message");
        logger.fine("FINE message");
        logger.finer("FINER message");
        logger.finest("FINEST message");

        //将记录器记录信息的等级设置为FINE，此时之后比其低等级的记录不会被记录
        logger.setLevel(Level.FINE);
        logger.severe("SEVERE message");
        logger.warning("WARNING message");
        logger.info("INFO message");
        logger.config("CONFING message");
        logger.fine("FINE message");
        //由于下面等级比较低，所以，不会被记录再log.txt文件中
        logger.finer("FINER message");
        logger.finest("FINEST message");

        /*logger.exiting("com.chaptor07.test_log.Log1ForInternet", "method1");
        System.out.println(logger.getParent());
        System.out.println(logger.getResourceBundle()   );*/

    }
    public static int method1(int a){
        return a + a;
    }

}
