package officeHour.week3;

import org.testng.annotations.*;
import utility.*;

public class TestNgReview {

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");

    }
    @Test
    public void method1(){
        System.out.println("Test 1");
    }

    @Test
    public void method2(){
        System.out.println("Test 2");


    }
}
