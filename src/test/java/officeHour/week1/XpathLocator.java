package officeHour.week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class XpathLocator {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // css          tagname[attributeName='value']
        // xpath      //tagname[@attributeName='value']

        //    span[class='hl-item__displayPrice']
    }
}
