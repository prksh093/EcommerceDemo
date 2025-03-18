package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[text()='Login'])[1]")
    WebElement lnklogin;

    @FindBy(id = "loginFrm_loginname")
    WebElement txtlogin;

    @FindBy(id = "loginFrm_password")
    WebElement txtpass;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement btnLogin;

    @FindBy(partialLinkText = "Forgot your password?")
    WebElement lnkforgetpass;

    @FindBy(partialLinkText = "Forgot your login?")
    WebElement lnkforgetLogin;

    public void getLnklogin() {
         lnklogin.click();;
    }

    public void getTxtlogin(String UNlogin) {
         txtlogin.sendKeys(UNlogin);;
    }

    public void getTxtpass(String pass) {
       txtpass.sendKeys(pass);
    }

    public void getBtnLogin() {
         btnLogin.click();
    }

    public void getLnkforgetpass() {
         lnkforgetpass.click();
    }

    public void getLnkforgetLogin() {
         lnkforgetLogin.click();
    }

}
