package officeHour.week5.Tests;

import officeHour.week5.pages.*;
import org.testng.annotations.*;
import utility.*;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest(){
        Driver.getDriver().get("https://practice.cydeo.com/login");
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("loginUserName"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.loginBtn.click();
    }

    @Test
    public void loginMethodTest(){
        Driver.getDriver().get("https://practice.cydeo.com/login");
        loginPage.login("tomsmith","SuperSecretPassword");

    }


}
