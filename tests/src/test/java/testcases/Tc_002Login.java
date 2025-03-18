package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;

public class Tc_002Login extends BaseClass {
    WebDriver driver;
    Actions actions;

    @Test
    public void Verify_userLogin()
    {
        HomePage hm= new HomePage(driver);
        hm.getLnkAccount();

        LoginPage lp= new LoginPage(driver);
        lp.getLnklogin();
        lp.getTxtlogin("prkshraj");
        lp.getTxtpass("Admin@123");
        lp.getBtnLogin();

    }

}
