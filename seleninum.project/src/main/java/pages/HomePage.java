package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.Browser.getPropertyValues;

public class HomePage {
      WebDriver driver= Browser.getDriver();
//    @FindBy(id="txtUsername") private WebElement userNameElement;
//    @FindBy(id="txtPassword") private WebElement passwordElement;
//    @FindBy(id="btnLogin") private WebElement LoginButton;
    @FindBy(linkText = "Rigister") private WebElement registerLink;//customer.firstName
    @FindBy(id="customer.firstName") private WebElement firstName;
    @FindBy(id="customer.lastName") private WebElement lastName;
    @FindBy(id="customer.address.street") private WebElement address;
    @FindBy(id="customer.address.city") private WebElement city;
    @FindBy(id="customer.address.state") private WebElement state;
    @FindBy(id="customer.address.zipcode") private WebElement zipcode;
    @FindBy(id="customer.phoneNumber") private WebElement phoneNumber;
    @FindBy(id="customer.ssn") private WebElement ssn;
    @FindBy(id="customer.username") private WebElement userName;
    @FindBy(id="customer.password") private WebElement password;
    @FindBy(id="customer.repeatedPassword") private WebElement repeatedPassword;
    @FindBy(css="\"input[value='Register']\") private WebElement registerButton;") private WebElement registerButton;

    public void registerUser(){
        String info=getPropertyValues("info");
        registerLink.click();
        firstName.sendKeys(info);
        lastName.sendKeys(info);
        address.sendKeys(info);
        city.sendKeys(info);
        state.sendKeys(info);
        zipcode.sendKeys(info);
        phoneNumber.sendKeys(info);
        ssn.sendKeys(info);
        userName.sendKeys(info);
        password.sendKeys(info);
        repeatedPassword.sendKeys(info);
        registerButton.click();

       // return PageFactory.initElements(Browser.getDriver(), OverViewPage.class);

    }

    //public void login(){
//        userNameElement.sendKeys(getPropertyValues("username"));
//        passwordElement.sendKeys(getPropertyValues("password"));

   // }



}
