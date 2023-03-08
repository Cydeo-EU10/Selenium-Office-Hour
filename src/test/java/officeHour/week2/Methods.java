package officeHour.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;
import java.util.concurrent.*;

public class Methods {

    static Random random = new Random();



    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // go to beymen page
        driver.get("https://www.beymen.com/");

        // locating searchbar using xpath
        WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Ürün, Marka Arayın']"));

        // search for product
        searchbar.sendKeys("t-shirt" + Keys.ENTER);


        // accept cookies button
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        // click random item
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='m-productCard__photo']"));
        int itemSize = items.size();
        items.get(random.nextInt(itemSize)).click();

        // choosing random size
        List<WebElement> sizes = driver.findElements(By.xpath("//span[@class='m-variation__item']"));
        sizes.get()





        driver.close();

    }


}
