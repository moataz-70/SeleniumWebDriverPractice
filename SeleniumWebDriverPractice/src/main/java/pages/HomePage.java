package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown()
    {
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(11) > a")).click();

        //clickLink("dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotpassword()
    {
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(20) > a"));
       // clickLink("forgot_password");
        return new ForgotPasswordPage(driver);
    }

    public KeyPressesPage clickKeyPresses()
    {
        clickLink("key Presses");
        return new KeyPressesPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts()
    {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public EntryAdPage clickEntryAd()
    {
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public FileUploadPage clickFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public FramesPage clickFrame()
    {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor()
    {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom()
    {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }


    public void clickLink (String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }







}
