package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage
{

    WebDriver driver;

    @FindBy(id="gender-male")
    public WebElement maleRadioButton;

    @FindBy(id="gender-female")
    public WebElement femaleRadioButton;

    @FindBy(id="FirstName")
    public WebElement firstNameTextbox;


    @FindBy(name="DateOfBirthDay")
    public WebElement dateOfBirthDropDown;




    public  RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void clickMaleRadioBtn()
    {
        maleRadioButton.click();
    }


    public void clickFemaleRadioBtn()
    {
        femaleRadioButton.click();
    }


    public void enterFirstName(String fn)
    {
        firstNameTextbox.sendKeys(fn);
    }


    public void selectDropDownByValue(String value)
    {
        Select s = new Select(dateOfBirthDropDown);
        s.selectByValue(value);

    }




}
