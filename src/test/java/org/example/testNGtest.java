package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNGtest {
    private WebDriver driver;
    @BeforeTest
    public static void testlogin(){
        WebDriver driver =new ChromeDriver();
        // driver.manage().window().maximize();
        login_page page1=new login_page(driver);
    }



}
