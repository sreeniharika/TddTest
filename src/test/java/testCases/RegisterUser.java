package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class RegisterUser extends BaseTest
{
    @Test
    public void registerNewUser()
    {
        homepage.clickRegisterLink();
        pageRefresh();
        registerpage.clickFemaleRadioBtn();
        registerpage.enterFirstName(prop.getProperty("firstName"));
        registerpage.selectDropDownByValue(prop.getProperty("value"));

    }

}
