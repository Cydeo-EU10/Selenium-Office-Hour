package officeHour.week7.cucumberReview.step_definition;

import io.cucumber.java.en.*;
import officeHour.week7.cucumberReview.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import utility.*;

import java.util.*;

public class RegSteps {

    WebDriver driver = Driver.getDriver();
    RegistrationPage rgPage = new RegistrationPage();

    SuccessPage scPage = new SuccessPage();



    @Given("user go to registration page")
    public void user_go_to_registration_page() {
        driver.get("https://practice.cydeo.com/registration_form");
    }
    @When("user enter valid data")
    public void user_enter_valid_data() {
        rgPage.firstName.sendKeys("Micheal");
        rgPage.lastName.sendKeys("Schofield");
        rgPage.userName.sendKeys("mcscisdfsdf");
        rgPage.emailInput.sendKeys("abc@abc.com");
        rgPage.passwordInput.sendKeys("123456sdfsdf");
        rgPage.phoneInput.sendKeys("571-000-0000");
        rgPage.radioButtons.get(1).click();
        rgPage.birthDayInput.sendKeys("02/12/2014");

        Select select1 = new Select(rgPage.departmentsDrop);
        select1.selectByIndex(2);

        Select select2 = new Select(rgPage.jobTitleDrop);
        select2.selectByIndex(4);

        rgPage.cPlusBox.click();
        rgPage.signUpBtn.click();


    }
    @Then("user able to see the message")
    public void user_able_to_see_the_message() {
        String actualMsg = scPage.message.getText();
        String expectedMsg = "You've successfully completed registration!";
        Assert.assertEquals(actualMsg,expectedMsg);
    }

    @When("user enter data")
    public void user_enter_data(List<String> infoList) {
        rgPage.firstName.sendKeys(infoList.get(0));
        rgPage.lastName.sendKeys(infoList.get(1));
        rgPage.userName.sendKeys(infoList.get(2));
        rgPage.emailInput.sendKeys(infoList.get(3));
        rgPage.passwordInput.sendKeys(infoList.get(4));
        rgPage.phoneInput.sendKeys(infoList.get(5));
        rgPage.radioButtons.get(Integer.parseInt(infoList.get(6))).click();
        rgPage.birthDayInput.sendKeys(infoList.get(7));

        Select select1 = new Select(rgPage.departmentsDrop);
        select1.selectByIndex(Integer.parseInt(infoList.get(8)));

        Select select2 = new Select(rgPage.jobTitleDrop);
        select2.selectByIndex(Integer.parseInt(infoList.get(9)));

        rgPage.cPlusBox.click();
        rgPage.signUpBtn.click();
    }

    @When("user enter firstname {string}")
    public void user_enter_firstname(String firstName) {
        rgPage.firstName.sendKeys(firstName);
    }
    @When("user enter lastname {string}")
    public void user_enter_lastname(String lastName) {
        rgPage.lastName.sendKeys(lastName);
    }
    @When("user enter username {string}")
    public void user_enter_username(String userName) {
        rgPage.userName.sendKeys(userName);
    }
    @When("user enter email {string}")
    public void user_enter_email(String email) {
        rgPage.emailInput.sendKeys(email);
        rgPage.passwordInput.sendKeys("123456sdfsdf");
        rgPage.phoneInput.sendKeys("571-000-0000");
        rgPage.radioButtons.get(1).click();
        rgPage.birthDayInput.sendKeys("02/12/2014");

        Select select1 = new Select(rgPage.departmentsDrop);
        select1.selectByIndex(2);

        Select select2 = new Select(rgPage.jobTitleDrop);
        select2.selectByIndex(4);

        rgPage.cPlusBox.click();
        rgPage.signUpBtn.click();
    }



}
