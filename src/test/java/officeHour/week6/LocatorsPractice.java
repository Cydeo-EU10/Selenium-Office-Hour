package officeHour.week6;

import officeHour.week4.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import utility.*;

public class LocatorsPractice{
    WebDriver driver = Driver.getDriver();

    @Test
    public void test1() {

        // locators
        // 1.id  -- if you have id in html, please use it, because it's uniqe, you will
        // get only 1 match
//        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
//        WebElement idEle = driver.findElement(By.id("bf-revz-widget-2488614964"));
//        System.out.println(idEle.getTagName());


        // 2.name
//        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
//        WebElement nameEle = driver.findElement(By.name("bfiframe"));
//        System.out.println(nameEle.getTagName());

        // 3.class name
//        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
//        WebElement classEle = driver.findElement(By.className("elementor-inner"));
//        System.out.println(classEle.getTagName());

        // 4.tag name
//        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
//        WebElement tagEle = driver.findElement(By.tagName("header"));
//        System.out.println(tagEle.getTagName());

        // 5. linkText  -- only work for link elements
//        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
//        WebElement linkTextEle = driver.findElement(By.linkText("Programs"));
//        System.out.println(linkTextEle.getTagName());

        // 6. partial link text -- only work for link elements
        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
        WebElement partialLinkTextEle = driver.findElement(By.partialLinkText("Developer"));
        System.out.println(partialLinkTextEle.getTagName());



    }
}
