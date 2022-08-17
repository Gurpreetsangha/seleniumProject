package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

import static Browser.Browser.getPropertyInfo;

public class Login_Page {
    @FindBy(xpath="input[@name='username']") private WebElement userNameElement;
    @FindBy(xpath ="//input[@ name='password']") private WebElement passwordElement;
    @FindBy(xpath ="//button[@type='submit']") private WebElement LoginButton;

    public void login(){
        userNameElement.sendKeys(getPropertyInfo("username"));
        passwordElement.sendKeys(getPropertyInfo("password"));

    }
}
