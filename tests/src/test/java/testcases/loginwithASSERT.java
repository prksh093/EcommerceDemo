package testcases;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginwithASSERT {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://automationteststore.com/");
        assert driver.getCurrentUrl().contains("automationteststore") : "Failed to navigate to the website";

        WebElement lnkAccount = driver.findElement(By.xpath("(//span[text()='Account'])[1]"));
        assert lnkAccount != null : "Account link not found";

        Actions ac = new Actions(driver);
        ac.moveToElement(lnkAccount).click().perform();
        assert lnkAccount.isDisplayed() : "Account link is not visible after action";

        WebElement UserName = driver.findElement(By.id("loginFrm_loginname"));
        assert UserName != null : "Username field not found";
        UserName.sendKeys("prkshraj");

        WebElement Pwd = driver.findElement(By.id("loginFrm_password"));
        assert Pwd != null : "Password field not found";
        Pwd.sendKeys("Admin@123");

        WebElement btnlogin = driver.findElement(By.xpath("//button[@title='Login']"));
        assert btnlogin != null : "Login button not found";
        btnlogin.submit();

        assert driver.getTitle().contains("My Account") : "Login may have failed - title does not match expected";

        driver.quit();
    }
}



