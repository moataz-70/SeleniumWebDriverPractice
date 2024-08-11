package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        goHome();


        // System.setProperty("webdriver.chrome.driver", "resources/chromedriver"); <---- it is a useless nowadays to setup the web driver using this way(outdated point in the course)

        //Example for implicit wait:
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Example for another wait strategy:
        //driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void goHome()
    { 
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

