import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by zhaomin on 7/21/16.
 */

public class testng {
    @Test
    public void testEqual()
    {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine",str);
        Assert.assertTrue("TestNG is working fine".equals(str));
    }

}
