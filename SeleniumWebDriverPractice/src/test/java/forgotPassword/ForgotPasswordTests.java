package forgotPassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTest
{
    @Test
    public void forgotPasswordValidTC()
    {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotpassword();
        forgotPasswordPage.enterEmail("moataz.ibrahim@gmail.com");
        forgotPasswordPage.clickRetrievePasswordButton();

    }


}
