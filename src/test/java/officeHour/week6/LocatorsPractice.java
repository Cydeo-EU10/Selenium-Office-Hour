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


    // css locator
    @Test
    public void test2(){

        // syntax1    tagName[attributeName='attributeValue']
        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
        WebElement cssEle = driver.findElement(By.cssSelector("a[href='https://cydeo.com/programs/']"));
        System.out.println(cssEle.getTagName());
        System.out.println(cssEle.getText());

        // syntax2    tagName.className   or tagName#id

        WebElement css2id = driver.findElement(By.cssSelector("link#bootstrap-css-css"));
        System.out.println("css2id = " + css2id.getTagName());

        WebElement css2class = driver.findElement(By.cssSelector("div.elementor-widget-wrap"));
        System.out.println("css2class = " + css2class.getTagName());


        // if you use class value for Css shortcut, you can't put space in the value, you must
        // replace the space with dot(.)
        WebElement css2classSpace = driver.findElement(By.cssSelector("section.elementor-section.elementor-top-section.elementor-element.elementor-element-2887849.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default"));
        System.out.println("css2classSpace = " + css2classSpace.getTagName());


    }
}
