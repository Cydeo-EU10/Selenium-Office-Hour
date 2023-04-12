package officeHour.week7.cucumberReview.step_definition;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.testng.*;
import utility.*;

public class LoginStep {

    WebDriver driver = Driver.getDriver();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        driver.get("https://practice.cydeo.com/login");
    }
    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

    }

    @When("user login with {string} credentials")
    public void user_login_with_credentials(String credits) {
        switch (credits){
            case "valid":
                driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
                driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");
                driver.findElement(By.id("wooden_spoon")).click();
                break;

            case "invalid":
                driver.findElement(By.xpath("//input[@name='username']")).sendKeys("wrong");
                driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wrongpassword");
                driver.findElement(By.id("wooden_spoon")).click();
                break;
        }
    }
    @Then("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        String expectedTitle = "Secure Area";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
