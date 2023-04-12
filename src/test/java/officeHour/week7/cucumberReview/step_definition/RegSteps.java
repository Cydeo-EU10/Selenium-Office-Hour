package officeHour.week7.cucumberReview.step_definition;

import io.cucumber.java.en.*;
import officeHour.week7.cucumberReview.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import utility.*;

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

}
