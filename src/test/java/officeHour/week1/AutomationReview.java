package officeHour.week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;

public class AutomationReview {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driverEdge = new EdgeDriver();

        driver.get("https://www.ebay.com");

//        driverEdge.get("https://www.amazon.com");

        driver.navigate().refresh();
    }

}
