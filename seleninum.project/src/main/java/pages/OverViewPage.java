package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage {
    @FindBy(linkText = "Open New Account") private WebElement openAccountLink;
    public void clickOpenAccountLink(){
        openAccountLink.click();
    }
}
