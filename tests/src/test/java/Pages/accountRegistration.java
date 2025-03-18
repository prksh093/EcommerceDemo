package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegistration extends BasePage {

    public accountRegistration(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "AccountFrm_firstname")
    WebElement fname;

    @FindBy(id = "AccountFrm_lastname")
    WebElement Lname;

    @FindBy(id = "AccountFrm_email")
    WebElement email;

    @FindBy(id = "AccountFrm_telephone")
    WebElement phone;

    @FindBy(id = "AccountFrm_address_1")
    WebElement txtAdd;

    @FindBy(id = "AccountFrm_city")
    WebElement txtcity;

    @FindBy(id = "AccountFrm_country_id")
    WebElement txtcountry;

    @FindBy(id = "AccountFrm_zone_id")
    WebElement txtstate;

    @FindBy(id = "AccountFrm_postcode")
    WebElement txtzip;

    @FindBy(id = "AccountFrm_loginname")
    WebElement txtLoginUser;

    @FindBy(id = "AccountFrm_password")
    WebElement txtpwd;

    @FindBy(id = "AccountFrm_confirm")
    WebElement txtcnfpwd;

    @FindBy(id = "AccountFrm_newsletter1")
    WebElement btnSubscribe;
    @FindBy(id = "AccountFrm_agree")
    WebElement btnagree;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement btnContinue;

    public void getFname(String firstname) {
        fname.sendKeys(firstname);
    }

    public void getLname(String Lastname) {
         Lname.sendKeys(Lastname);
    }

    public void getEmail(String mail) {
         email.sendKeys(mail);
    }

    public void getPhone(String ph) {
         phone.sendKeys(ph);
    }

    public void getTxtAdd(String add) {
         txtAdd.sendKeys(add);
    }

    public void getTxtcity(String city) {
        txtcity.sendKeys(city);
    }

    public void getTxtcountry(String contry) {
       txtcountry.sendKeys(contry);
    }

    public void getTxtstate(String state) {
        txtstate.sendKeys(state);
    }

    public void getTxtzip(String zip) {
         txtzip.sendKeys(zip);
    }

    public void getTxtLoginUser(String UN) {
         txtLoginUser.sendKeys(UN);;
    }

    public void getTxtpwd(String PWd) {
         txtpwd.sendKeys(PWd);;
    }

    public void getTxtcnfpwd(String cnfpwd) {
        txtcnfpwd.sendKeys(cnfpwd);;
    }

    public void getBtnSubscribe() {
         btnSubscribe.click();
    }

    public void getBtnagree() {
         btnagree.click();
    }

    public void getBtnContinue() {
         btnContinue.click();
    }

    
}
