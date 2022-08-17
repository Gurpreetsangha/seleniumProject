package AllTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        Browser.setDriver();
        driver=Browser.getDriver();
        driver.navigate().to(Browser.getPropertyValues("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test1(){
        System.out.println("This is a test");
        System.out.println("Testing git");
        System.out.println("Making another test");

    }
}
