package pages;

import browser.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// inheriate the BaseTest class for the properties or driver
public class LoginPage extends BaseTest {

    //Initializing the page Objects:
    //Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    //PageFactory or Page Object
    @FindBy(name = "username")
    WebElement Username;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement LoginButton;

    @FindBy(css = "p[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPassword;

    // Actions

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateLoginButton(){
        return LoginButton.isDisplayed();

    }
    public LoginPage Login(String un, String pwd){
        Username.sendKeys("un");
        Password.sendKeys("pwd");
        LoginButton.click();
        return new LoginPage();
    }


}
