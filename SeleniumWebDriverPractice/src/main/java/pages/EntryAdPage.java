package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage
{
    WebDriver driver;
    By closeButton = By.className("modal-footer");

    public EntryAdPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickClose()
    {
       driver.findElement(closeButton).click();
    }
}
