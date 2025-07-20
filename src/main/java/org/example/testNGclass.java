package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNGclass {
    @Test
    @BeforeTest
    public void testlogin(){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        login_page page1=new login_page(driver);
        page1.login_cred("admin@example.com","123123123");

    }
}
