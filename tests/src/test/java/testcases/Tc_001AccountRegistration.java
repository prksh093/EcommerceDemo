package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import BaseTest.BaseClass;

public class Tc_001AccountRegistration extends BaseClass {

    static WebDriver driver;

    @Test
    public void Verify_AccountRegistration() {
        // Initialize the WebDriver
        driver = new ChromeDriver(); // Ensure the appropriate driver is set up

        HomePage hm = new HomePage(driver);
        hm.LnkRegistration();
        
        // Add any additional steps for account registration here

        // Close the driver after the test
        driver.quit();
    }
}
