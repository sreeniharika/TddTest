package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class LoginToApp extends BaseTest
{
    @Test
    public void login()
    {
        String homePageTitle = getPageTitle();
        System.out.println("Home Page Title is: " + homePageTitle);

        homepage.clickLoginLink();

        pageRefresh();

        String loginPageTitle = getPageTitle();
        System.out.println("Login Page Title is: " + loginPageTitle);

        /*
        loginpage.enterEmail(prop.getProperty("email"));
        loginpage.enterPassword(prop.getProperty("password"));
        loginpage.clickLoginButton();

         */
        loginpage.loginToNop(prop.getProperty("email"),prop.getProperty("password"));
    }

}
