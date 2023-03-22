package officeHour.week4;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class UploadTest extends TestBase{

    @Test
    public void test1() throws InterruptedException {
        String path = "C:\\Users\\Zulpikar\\IdeaProjects\\Selenium-Office-Hour\\src\\test\\java\\officeHour\\week4\\testFile.txt";
        driver.get("https://practice.cydeo.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys(path);
        Thread.sleep(2000);
    }
}
