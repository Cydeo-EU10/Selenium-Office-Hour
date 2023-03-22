package officeHour.week4;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import utility.*;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    public void init(){
        driver = Driver.getDriver();
    }

    @AfterClass
    public void tearDown(){
//        driver.close();
    }
}
