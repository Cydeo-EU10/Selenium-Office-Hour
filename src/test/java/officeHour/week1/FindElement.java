package officeHour.week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FindElement {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/b/Car-GPS-Navigators/156955/bn_887051");


        // first locator by id;
        WebElement title = driver.findElement(By.id("s0-27-9-0-1[0]-0-1[0]-0-3-0-title"));
        System.out.println(title.getText());

        // two types of custom locators
        // css
        // xpath
    }
}
