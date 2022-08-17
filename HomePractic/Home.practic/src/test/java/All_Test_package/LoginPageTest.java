package All_Test_package;

import Browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        Browser.setDriver();
        driver=Browser.getDriver();
        driver.navigate().to(Browser.getPropertyInfo("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test1(){
        System.out.println("This is first login test");
    }
}
