package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DataSheetpage {
    private WebDriver driver;

//    public DataSheetpage(WebDriver driver) {
//        this.driver = driver;
//    }
    public DataSheetpage(WebDriver driver)
    {
        this.driver = driver;
        WebDriverWait waitpage=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement page2=waitpage.until(ExpectedConditions.presenceOfElementLocated(By.id("day_to_date_inp")));
        page2.sendKeys("10");
        driver.findElement(By.id("week_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("month_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("year_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("quarter_to_date_inp")).sendKeys("10");
        driver.findElement(By.id("annualized_return_inp")).sendKeys("10");
        driver.findElement(By.id("total_return_inp")).sendKeys("10");
        driver.findElement(By.id("standard_deviation_inp")).sendKeys("10");
        driver.findElement(By.id("sharp_ratio_inp")).sendKeys("10");
        driver.findElement(By.id("information_ratio_inp")).sendKeys("10");
        driver.findElement(By.id("beta_inp")).sendKeys("10");
        driver.findElement(By.id("correlation_inp")).sendKeys("10");
        driver.findElement(By.id("r_squared_inp")).sendKeys("10");
        WebDriverWait btnWait=new WebDriverWait(driver,Duration.ofSeconds(15));
        WebElement btn = btnWait.until(ExpectedConditions.elementToBeClickable(By.id("next-btn")));
               btn.click();
        //driver.findElement(By.id("draft-btn")).click();

    }
}
