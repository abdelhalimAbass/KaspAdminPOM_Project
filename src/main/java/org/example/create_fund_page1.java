package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class create_fund_page1 {
    private WebDriver driver;

    public create_fund_page1(WebDriver driver) {
        this.driver = driver;
    }
    public create_fund_page1 createFundPage1()
    {
        driver.findElement(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/a/span[2]")).click();
       // "//*[@id=\"#kt_aside_menu\"]/div[6]/a"
                //kasb "//*[@id=\"#kt_aside_menu\"]/div[6]/a/span[2]"
        driver.findElement(By.xpath("//*[@id=\"kt_wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //upload fund photo
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        WebElement input = driver.findElement(By.xpath("//input[@type='file']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display = 'block';", input);
        input.sendKeys("C:\\Users\\Masarat\\IdeaProjects\\kasb-Admin-creating_fund\\11.jpg");
        //-------uploading done------
        driver.findElement(By.id("translations_ar_name_inp")).sendKeys("صندوق البناء والتنمية");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_ar_description_inp",
                "<h1>صندوق للتنمية العقارية بيع شراء</h1><p>صندوق للتنمية العقارية بيع شراء</p>");
        driver.findElement(By.id("translations_ar_performance_conditions_inp")).sendKeys("translations_ar_performance_conditions_inp");
        System.out.println("كدا انا وصلت للترجمه العربي ");


        return new create_fund_page1(driver);

    }
    public static void fund_name_en(WebDriver driver){
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("click button1");
//       driver.findElement(By.xpath("//a[contains(text(),'En')]")).click();
        System.out.println("Aloooooooo");
      WebElement tab = driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tab);


        System.out.println("click button");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("translations_en_name_inp")).sendKeys("CR fund");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_en_description_inp",
                "<h1>صندوق للتنمية العقارية بيع شراء</h1><p>صندوق للتنمية العقارية بيع شراء</p>");
        driver.findElement(By.id("translations_en_performance_conditions_inp")).sendKeys("translations_ar_performance_conditions_inp");

    }
    @Test
    public static void termsConditoins(WebDriver driver){
        driver.findElement(By.id("terms_file_inp")).sendKeys("C:\\Users\\Masarat\\IdeaProjects\\kasb-Admin-creating_fund\\document33.pdf");
    }
    @Test
    public static void fundType(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[1]/span[2]/span[1]/span")).click();
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement fundManger= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@class,'select2-results__option') and contains(text(),'Value Capital')]")));
        fundManger.click();
        //driver.findElement(By.xpath("//li[contains(text(),'ValueCapital')]")).click();
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[2]/span[2]/span[1]/span")).click();
        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement currancy= wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'SAR')]")));
        currancy.click();
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div/div[4]/div[3]/span[2]/span[1]/span")).click();
        WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement riskLevel=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'  Risk free ')]")));
        riskLevel.click();
        //select fund type
        System.out.println("enter fund type ");
        chooseFundType type=new chooseFundType();
        type.chooseFromDropdownInteractively(driver);

//

    }

}
