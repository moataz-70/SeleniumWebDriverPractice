package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePasswordPage {

    private WebDriver driver;
    private By pageMassage = By.xpath("/html/body/h1");

    public RetrievePasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getPageMassage()
    {
       String pageText = driver.findElement(pageMassage).getText();
        return pageText;
    }
}
