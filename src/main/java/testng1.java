import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by zhaomin on 7/21/16.
 */
public class testng1 {
    @Test
    public void testEqual_1()
    {
        String str = "this is a TestNG test";
        assertEquals("TestNG is working fine",str);
    }
}
