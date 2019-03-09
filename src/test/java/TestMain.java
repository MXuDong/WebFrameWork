import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;



/**
 * @author Dong
 * <p>
 * Class Name : TestMain
 * Create Time : 13:37
 * Create Date : 2019/3/9
 * Project : WebFrameWork
 *
 * 测试总类
 */

public class TestMain {

    private static final Logger LOGGER = LogManager.getLogger("com.test0");

    @Test
    public void TestProgrameBegin(){
        System.out.println("It's OK");
        LOGGER.trace("Test Trace");
    }

}
