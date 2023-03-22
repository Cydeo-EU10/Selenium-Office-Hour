package officeHour.week4;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;

public class WindowsTest extends TestBase {

    @Test
    public void test1() {
        driver.get("https://practice.cydeo.com/windows");
        String handle = driver.getWindowHandle();
//        System.out.println(handle);

        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        Set<String> handels = driver.getWindowHandles();

        for (String handel : handels) {
            driver.switchTo().window(handel);
            if (driver.getTitle().equals("New Window")){
                break;
            }
        }

        Assert.assertEquals(driver.getTitle(),"New Window");


    }
}
