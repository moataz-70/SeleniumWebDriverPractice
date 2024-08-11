package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    public WebDriver driver;
    private By emailField = By.name("email");
    private By retrievePasswordButton = By.id("form_submit");

    ForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public RetrievePasswordPage clickRetrievePasswordButton()
    {
        driver.findElement(retrievePasswordButton).click();
        return new RetrievePasswordPage(driver);
    }





}
