package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;


    //locators
    @FindBy(linkText ="Register")
    public WebElement registerLink;


    @FindBy(linkText = "Log in")
    public WebElement loginLink;


    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;


    @FindBy(css = "input.search-box-button")
    public WebElement serachButton;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //actions
    public void clickRegisterLink()
    {
        registerLink.click();
    }


    public void clickLoginLink()
    {
        loginLink.click();
    }

    public void enterSearchText(String text)
    {
        searchTextBox.sendKeys(text);
    }

    public void clickSearchbutton()
    {
        serachButton.click();
    }












}
