package officeHour.week7.cucumberReview.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utility.*;

import java.util.*;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "Home")
    public WebElement homeLink;

    @FindBy(tagName = "h2")
    public WebElement title;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailInput;

    @FindBy(css = "input[type=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "(//div[@class=\"col-sm-5\"])[6]/input")
    public WebElement phoneInput;

    @FindBy(css = "input[type=\"radio\"]")
    public List<WebElement> radioButtons;

    @FindBy(xpath = "//input[@data-bv-field=\"birthday\"]")
    public WebElement birthDayInput;

    @FindBy(name = "department")
    public WebElement departmentsDrop;

    @FindBy(xpath = "//select[@name=\"job_title\"]")
    public WebElement jobTitleDrop;

    @FindBy(id = "inlineCheckbox1")
    public WebElement cPlusBox;

    @FindBy(id = "inlineCheckbox2")
    public WebElement javaBox;

    @FindBy(id = "inlineCheckbox3")
    public WebElement jsBox;



    @FindBy(id = "wooden_spoon")
    public WebElement signUpBtn;

    @FindBy(partialLinkText = "CYD")
    public WebElement cydeoLink;


}
