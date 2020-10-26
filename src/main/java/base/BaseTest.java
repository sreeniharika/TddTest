package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest
{

    public static WebDriver driver;
    public static HomePage homepage;
    public static LoginPage loginpage;
    public static RegisterPage registerpage;
    public static Properties prop;

    public static final String AUTOMATE_USERNAME = "nihan7";
    public static final String AUTOMATE_ACCESS_KEY = "gLpmZSCQtB4P9yxXERnp";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        prop = new Properties();

        try
        {
            FileInputStream fs = new FileInputStream("./src/main/java/config/data.properties");
            prop.load(fs);
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
/*
        driver = new ChromeDriver();
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();

 */
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "latest-beta");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");

        WebDriver driver = new RemoteWebDriver(new URL(URL),caps);

        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        registerpage = new RegisterPage(driver);


    }


    @AfterAll
    public static void tearDown()
    {
        driver.quit();
    }


    public void pageRefresh()
    {
        driver.navigate().refresh();
    }

    public String getPageTitle()
    {
       return  driver.getTitle();
    }

}
