package officeHour.week4;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;

public class TableTest extends TestBase {


    @Test
    public void test1() {
        driver.get("https://practice.cydeo.com/web-tables");
        String name1 = "Robert Baratheon";
        List<WebElement> namesEle = driver.findElements(By.xpath("//tr/td[2]"));
        List<String> names = new ArrayList<>();
        for (WebElement name : namesEle) {
            names.add(name.getText());
        }

        Assert.assertTrue(names.contains(name1));
    }
}
