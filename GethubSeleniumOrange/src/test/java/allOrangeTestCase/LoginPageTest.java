package allOrangeTestCase;

import browser.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        loginPage=new LoginPage();
    }

    @Test
    public void loginPageTitleTest(){
        String title=loginPage.validateLoginPageTitle();
        Assert.assertEquals(title,"OrangeHRM");
    }
    @Test
    public void loginButtonTest(){
        boolean ispresent=loginPage.validateLoginButton();
        Assert.assertTrue(ispresent);
    }

    }


