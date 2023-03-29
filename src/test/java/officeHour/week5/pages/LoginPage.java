package officeHour.week5.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utility.*;

public class LoginPage {

    public LoginPage() {PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "wooden_spoon")
    public WebElement loginBtn;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
