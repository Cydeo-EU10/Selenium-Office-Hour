package officeHour.week5;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import utility.*;

import java.util.concurrent.*;

public class Sychronization {

    WebDriver driver = Driver.getDriver();

    // implicit wait
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement title = driver.findElement(By.id("finish"));
    }

    // explicit wait
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        WebElement title = driver.findElement(By.id("finish"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(title));
        System.out.println(title.getText());

    }
}
