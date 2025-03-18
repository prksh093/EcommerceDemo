package BaseTest;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    WebDriver driver;
    Properties p;

    @BeforeClass

    public void setup( ) throws IOException {

      
        FileReader file = new FileReader("D:/VSCODE/EcommerceDemo/tests/src/resources/config.properties");
        p = new Properties();
        p.load(file);

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(p.getProperty("appurl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @AfterClass

    public void tearDown( ) {
        driver.quit();
    }
}
