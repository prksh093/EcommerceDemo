package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

     WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver; // Ensure driver is initialized
        PageFactory.initElements(driver, this); // Initialize PageFactory elements
    }

    @FindBy(xpath = "//a[text()='Login or register']" )
    WebElement lnkRegistration;

    @FindBy(xpath = "(//span[text()='Specials'])[1]")
    WebElement lnkSpecial;

    @FindBy(xpath = "(//span[text()='Account'])[1]")
    WebElement lnkAccount;

    @FindBy(xpath = "(//span[text()='Cart'])[1]")
    WebElement lnkCart;

    @FindBy(xpath = "(//span[text()='Checkout'])[1]")
    WebElement lnkCheckout;

    @FindBy(id = "filter_keyword")
    WebElement txtSearch;

    @FindBy(xpath = "(//span[text()='Login'])[1]")
    WebElement lnkLogin;

    public void getLnkLogin() {
        lnkLogin.click();
    }

    public void LnkRegistration() {
        lnkRegistration.click();
      
    }

    public void getLnkSpecial() {
        lnkSpecial.click();

    }

    public void getLnkAccount( ) {
           
        Actions ac = new Actions(driver);
        ac.moveToElement(lnkAccount).click().perform();

    }

    public void getLnkCart() {
        lnkCart.click();
    }

    public void getLnkCheckout() {
        lnkCheckout.click();
    }

    public void getTxtSearch(String search) {
        txtSearch.sendKeys(search);
    }

}
