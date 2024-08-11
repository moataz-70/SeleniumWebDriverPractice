package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest
{
    @Test
    public void testWaitUnitlHidden()
    {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        assertEquals(loadingPage.getLoadedText(), "Hello World!\n", "Loaded text incorrect");
    }
}
