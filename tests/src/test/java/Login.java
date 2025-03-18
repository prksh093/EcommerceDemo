import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://automationteststore.com/");

        //WebElement loginRegister = driver.findElement(By.partialLinkText("Login or register"));
        //loginRegister.click();

        WebElement lnkAccount= driver.findElement(By.xpath("(//span[text()='Account'])[1]"));
        Actions ac= new Actions(driver);
        ac.moveToElement(lnkAccount).click().perform();

        WebElement btnacclogin = driver.findElement(By.xpath("(//span[text()='Login'])[1]"));
        btnacclogin.click();

        

        WebElement UserName = driver.findElement(By.id("loginFrm_loginname"));
        UserName.sendKeys("prkshraj");

        WebElement Pwd = driver.findElement(By.id("loginFrm_password"));
        Pwd.sendKeys("Admin@123");

        WebElement btnlogin = driver.findElement(By.xpath("//button[@title='Login']"));
        btnlogin.submit();
    }

}
