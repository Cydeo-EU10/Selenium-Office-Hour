package officeHour.week3;

import org.testng.annotations.*;
import utility.*;

import java.io.*;
import java.util.*;

public class PropertiesReview {


    @Test
    public void test1() throws IOException {
        System.out.println(System.getProperty("os.name"));
//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("java.compiler"));

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("Configuration.properties");
        properties.load(fis);

        Object object = new Object();

        System.out.println(properties.getProperty("java.version"));
        System.out.println(properties.getProperty("beymen_url"));

    }

    @Test
    public void test2(){
        System.out.println(ConfigurationReader.getProperty("password"));
        System.out.println(ConfigurationReader.getProperty("beymen_url"));
    }
}
