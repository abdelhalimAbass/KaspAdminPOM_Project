package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        login_page page1=new login_page(driver);
        page1.login_cred("admin@example.com","123123123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        create_fund_page1 fundcreation=new create_fund_page1(driver);
        fundcreation.createFundPage1();
        fundcreation.fund_name_en(driver);
        fundcreation.termsConditoins(driver);
        fundcreation.fundType(driver);
        DataSheetpage page2=new DataSheetpage(driver);
        //driver.quit();

        }
    }
