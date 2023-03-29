package officeHour.week5;

import officeHour.week4.*;
import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import utility.*;

public class TabelTest extends TestBase {

    WebDriver driver;
    @Test
    public void test1(){
        driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com/web-tables");
        String name = "Bob Martin";
        WebElement pizzaType = driver.findElement(By.xpath("//td[.='" + name + "']/following-sibling::td"));
        Assert.assertEquals(pizzaType.getText(),"Cheese");
    }

}
