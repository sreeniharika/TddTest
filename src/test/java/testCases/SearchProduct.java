package testCases;

import base.BaseTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;

public class SearchProduct extends BaseTest
{

    @Test
    public void searchProduct()
    {
        homepage.enterSearchText(prop.getProperty("searchItem"));
        homepage.clickSearchbutton();
    }



}
