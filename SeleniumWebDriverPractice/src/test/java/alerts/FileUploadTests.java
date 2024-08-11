package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest
{
    @Test
    public void testFileUpload()
    {
       var uploadPage = homePage.clickFileUpload();
       uploadPage.uploadField("E:\\programming\\demo\\demoJavaProject\\webdriver_java_tau\\src\\main\\resources\\chromedriver.exe");
       assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
