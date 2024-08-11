package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest
{
    @Test
    public void TestScrollToTable()
    {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
}
