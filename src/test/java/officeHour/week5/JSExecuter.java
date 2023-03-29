package officeHour.week5;

import officeHour.week4.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import utility.*;

public class JSExecuter extends TestBase {

    WebDriver driver;
    @Test
    public void test1(){
        driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBar = driver.findElement(By.xpath("//input[@type='text']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].setAttribute('value', 'Office Hours')", inputBar);
    }

    @Test
    public void test2() throws InterruptedException {
        driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,250)");
        }


    }


}
