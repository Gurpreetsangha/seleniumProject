package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import static browser.Browser.getPropertyValues;

public class HomePage {
    @FindBy(id="txtUsername") private WebElement userNameElement;
    @FindBy(id="txtPassword") private WebElement passwordElement;
    @FindBy(id="btnLogin") private WebElement LoginButton;

    public void login(){
        userNameElement.sendKeys(getPropertyValues("username"));
        passwordElement.sendKeys(getPropertyValues("password"));
    }

}
