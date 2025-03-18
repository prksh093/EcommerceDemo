import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogiinRegistration {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://automationteststore.com/");
        WebElement loginRegister = driver.findElement(By.partialLinkText("Login or register"));
        loginRegister.click();
        WebElement clickRegisterContinue = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        clickRegisterContinue.click();
        WebElement Fname = driver.findElement(By.id("AccountFrm_firstname"));
        Fname.sendKeys("Prakash");

        WebElement Lname = driver.findElement(By.id("AccountFrm_lastname"));
        Lname.sendKeys("Rajput");

        WebElement Email = driver.findElement(By.id("AccountFrm_email"));
        Email.sendKeys("prksh093@gmail.com");

        WebElement Phone = driver.findElement(By.id("AccountFrm_telephone"));
        Phone.sendKeys("9893932156");

        WebElement Add = driver.findElement(By.id("AccountFrm_address_1"));
        Add.sendKeys("shanti vihar colony");

        WebElement city = driver.findElement(By.id("AccountFrm_city"));
        city.sendKeys("Bhopal");

        WebElement country = driver.findElement(By.id("AccountFrm_country_id"));
        Select Country = new Select(country);
        Country.selectByVisibleText("India");

        WebElement State = driver.findElement(By.id("AccountFrm_zone_id"));
        Select st = new Select(State);
        st.selectByValue("1492");

        WebElement Zipcode = driver.findElement(By.id("AccountFrm_postcode"));
        Zipcode.sendKeys("462044");

        WebElement LoginName = driver.findElement(By.id("AccountFrm_loginname"));
        LoginName.sendKeys("prkshraj");

        WebElement pwd = driver.findElement(By.id("AccountFrm_password"));
        pwd.sendKeys("Admin@123");

        WebElement conpwd = driver.findElement(By.id("AccountFrm_confirm"));
        conpwd.sendKeys("Admin@123");

        WebElement Subscribe = driver.findElement(By.id("AccountFrm_newsletter1"));
        Subscribe.click();

        WebElement Policy = driver.findElement(By.id("AccountFrm_agree"));
        Policy.click();

        WebElement btnContinue = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        btnContinue.click();

        System.out.println("Your Account Has Been Created!");
   
        driver.findElement(By.partialLinkText("Continue")).click();;

        // driver.close();

    }

}
