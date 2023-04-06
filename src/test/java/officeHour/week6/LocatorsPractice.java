package officeHour.week6;

import officeHour.week4.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import utility.*;

import java.util.*;

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
//        driver.get("https://cydeo.com/?mn=dsZJgMb36jUmWSXChJCVxVs1LQPg7x3uh70u.sqLwYKb5WmPY9YMf");
//        WebElement cssEle = driver.findElement(By.cssSelector("a[href='https://cydeo.com/programs/']"));
//        System.out.println(cssEle.getTagName());
//        System.out.println(cssEle.getText());
//
//        List<WebElement> links = driver.findElements(By.cssSelector("a[href='https://cydeo.com/programs/']"));
//        System.out.println("secon link text = " + links.get(1).getText());
//
//        // syntax2    tagName.className   or tagName#id
//
//        WebElement css2id = driver.findElement(By.cssSelector("link#bootstrap-css-css"));
//        System.out.println("css2id = " + css2id.getTagName());
//
//        WebElement css2class = driver.findElement(By.cssSelector("div.elementor-widget-wrap"));
//        System.out.println("css2class = " + css2class.getTagName());
//
//
//        // if you use class value for Css shortcut, you can't put space in the value, you must
//        // replace the space with dot(.)
//        WebElement css2classSpace = driver.findElement(By.cssSelector("section.elementor-section.elementor-top-section.elementor-element.elementor-element-2887849.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default"));
//        System.out.println("css2classSpace = " + css2classSpace.getTagName());
//
//
//        // parent to child
//        // we use > sign to go from PARENT to CHILD
//        WebElement parentToChild = driver.findElement(By.cssSelector("div.elementor-button-wrapper>a"));
//        System.out.println("parentToChild.getText() = " + parentToChild.getText());

        // in Css selector, we can only go from parent to child
        // we CAN NOT go from child to parent


        // :nth-of-type(index)  or nth-child(index)    index is starting from 1, not 0
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        WebElement month3 = driver.findElement(By.cssSelector("select#month>option:nth-of-type(3)"));
        System.out.println(month3.getText());
    }


    //xpath loactor
    @Test
    public void test3(){

        // we have 2 types of xpath locators
        //1. absolute xpath, starts with single slash   /
        // 2. relatvie xpath, starts with double slash    //

        // syntax
        //        //tagname[@attributeName='attributeValue']

//        driver.get("http://practice.cybertekschool.com/dropdown");
//        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
//        System.out.println(dropdown.getTagName());

        // in xpath locator, we can use indexing to get similar webelement
        // example: (//option[@value='1'])[2]

        // in xpath ,we can locate one webelement using it's text value
        // example  //option[text()='June']   ==  //option[.='June']
        // instead of text() method, we can use .
        // example   //option[.='June']


        // to handel dynamic webelemetns, in xpath, we have 3 methods
        // starts-with
        // contains
        // ends-with


        // contains
        driver.get("https://practice.cydeo.com/challenging_dom");
        WebElement dynamic1 = driver.findElement(By.xpath("//a[ends-with(@id,'32dccb2b2c17')]"));
        System.out.println(dynamic1.getTagName());


        // starts with
        WebElement dynamicbutton = driver.findElement(By.xpath("//input[starts-with(@name,'btnch')]"));
        System.out.println(dynamicbutton.getText());


        // parent child relationship in xpath
        // we can go from parent to child or child to parent in xpath
        // parent to child   we will use    /
        // child to parent, we will use    /..

        // for following-sibling method, we will not get only one webelement
        // we will get all the match after that webelement

        // for preceding-sibling method, we will not get only one webelement
        // we will get all the match before that webelement
    }
}
