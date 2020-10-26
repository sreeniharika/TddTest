package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest
{

    public static WebDriver driver;
    public static HomePage homepage;
    public static LoginPage loginpage;
    public static RegisterPage registerpage;
    public static Properties prop;

    @BeforeAll
    public static void setUp()
    {
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

        driver = new ChromeDriver();
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();
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
