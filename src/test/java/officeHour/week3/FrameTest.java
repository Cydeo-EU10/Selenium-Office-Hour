package officeHour.week3;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import utility.*;

public class FrameTest {

    WebDriver driver = Driver.getDriver();

    @Test
    public void test1(){
        driver.get("https://www.w3schools.com/html/html_iframe.asp");

        WebElement frame = driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));

        // there is 3 way to switch to frame

        // 1. prividing frame as a webelement
//        driver.switchTo().frame(frame);

        // 2. providing frame's index number ()
        driver.switchTo().frame(1);

        // 3. providing frame's id value ()

        WebElement text = driver.findElement(By.xpath("//span[.=' Tutorial']"));
        System.out.println(text.getText());

    }
}
