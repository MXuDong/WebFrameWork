package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dong
 * <p>
 * Class Name : TestLog4jConfig
 * Create Time : 22:25
 * Create Date : 2019/3/9
 * Project : WebFrameWork
 */

public class TestLog4jConfig {

    Logger loggerFirst = null;
    Logger loggerSecond = null;

    @Before
    public void setLogger(){
        loggerFirst = LogManager.getLogger(getClass().getName());
        loggerSecond = LogManager.getLogger();
    }

    @Test
    public void TestLog4jConfigs(){
        loggerFirst.trace("test trace");
        loggerFirst.debug("test debug");
        loggerFirst.info("test info");
        loggerFirst.warn("test warn");
        loggerFirst.error("test error");
        loggerFirst.fatal("test fatal");

        loggerSecond.trace("test trace");
        loggerSecond.debug("test debug");
        loggerSecond.info("test info");
        loggerSecond.warn("test warn");
        loggerSecond.error("test error");
        loggerSecond.fatal("test fatal");
    }
}
