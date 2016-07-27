import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * Created by zhaomin on 7/21/16.
 */
public class testng2 {
    @Test
    public void testEqual_2()
    {
        String str = "hi,i am a test";
        assertNotNull(str);
    }
}
