package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

public class ModalTests extends BaseTest
{
    @Test
    public void testEntryAd()
    {
        var entryAdPage = homePage.clickEntryAd();
        entryAdPage.clickClose();
    }
}
