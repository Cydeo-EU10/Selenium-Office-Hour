package officeHour.week2;

import com.github.javafaker.*;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.util.concurrent.*;

public class Methods {

    static Random random = new Random();
    static Faker faker = new Faker();


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
        for (int i = 0; i < sizes.size(); i++) {
            if (sizes.get(i).isEnabled()){
                sizes.get(i).click();
                break;
            }
        }

        // click add to cart button
        driver.findElement(By.id("addBasket")).click();

        // go to cart
        WebElement cartLink = driver.findElement(By.xpath("//a[@title='Sepetim']"));
        cartLink.click();


        String originalPrice = driver.findElement
                (By.xpath("//span[@class='m-productPrice__salePrice']")).getText();
        String[] priceInfo = originalPrice.split(" ");
        String price = priceInfo[0];
        System.out.println(price);

        // locating dropdown
        WebElement countity = driver.findElement(By.id("quantitySelect0-key-0"));
        Select select = new Select(countity);
        select.selectByValue("2");

        String updatedPrice = driver.findElement
                (By.xpath("//span[@class='m-productPrice__salePrice']")).getText();
        String[] updatedPriceInfo = updatedPrice.split(" ");
        String newPrice = updatedPriceInfo[0];
        System.out.println(newPrice);

        if (newPrice.equals(price)){
            System.out.println("Test is failed");
        }else {
            System.out.println("Test is passed.");
        }



//        driver.close();

    }


}
