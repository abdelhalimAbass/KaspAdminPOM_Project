package org.example.Fund_page;

import org.example.Base_functionalites.TinyMCEHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC01_Create_Close_Fund {
     WebDriver driver;
    String url="https://dashboard-kasb-beta.dafagate.com/";
    @BeforeTest
    public  void testlogin(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.id("email_inp")).sendKeys("admin@example.com");
        driver.findElement(By.id("password_inp")).sendKeys("123123123");
        driver.findElement(By.id("submit-btn")).click();
        System.out.println("i enter log in fun");
    }

    @Test(priority = 0)
    public void set_default_page1() throws InterruptedException {
        System.out.println("i enter first test");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/a/span[2]")).click();
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
        WebElement tab = driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tab);
        System.out.println("click button");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("translations_en_name_inp")).sendKeys("CR fund");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TinyMCEHelper.injectIntoTinyMCE(driver, "translations_en_description_inp",
                "<h1>صندوق للتنمية العقارية بيع شراء</h1><p>صندوق للتنمية العقارية بيع شراء</p>");
        driver.findElement(By.id("translations_en_performance_conditions_inp")).sendKeys("translations_ar_performance_conditions_inp");
        //Upload terms and conditions AR&EN
        driver.findElement(By.id("translations_ar_terms_inp")).sendKeys("C:\\Users\\Masarat\\IdeaProjects\\kasb-Admin-creating_fund\\document33.pdf");
        driver.findElement(By.id("translations_en_terms_inp")).sendKeys("C:\\Users\\Masarat\\IdeaProjects\\kasb-Admin-creating_fund\\document33.pdf");
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[2]/div[1]/span/span[1]/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement fundManger= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@class,'select2-results__option') and contains(text(),'Value Capital')]")));
        fundManger.click();
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[2]/div[2]/span/span[1]/span")).click();
        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement currancy= wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'SAR')]")));
        currancy.click();
        driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[2]/div[3]/span/span[1]/span")).click();
        WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement riskLevel=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Risk free')]")));
        riskLevel.click();
        WebDriverWait wait88=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement AssetClass=wait88.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[2]/div[4]/span/span[1]/span")));
        AssetClass.click();
        WebDriverWait wait22=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement acceptance_riskLevel=wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Risk free')]")));
        acceptance_riskLevel.click();
        //select fund type
        System.out.println("finished page 1 ");

    }


    @Test(priority = 1)
    public  void choose_fund_type() throws InterruptedException {

      //  Scanner scanner = new Scanner(System.in); // لإنه ياخد إدخال من المستخدم
        System.out.print("Choose fund type: ");
      //  String userChoice = scanner.nextLine(); // ياخد القيمة من المستخدم
//        if (userChoice.equals("close")){
//        Thread.sleep(3000);
//     WebDriverWait wait55=new WebDriverWait(driver,Duration.ofSeconds(10));
//     WebElement dropOFFundType= wait55.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[3]/div[1]/span/span[1]/span"))) ;
//     dropOFFundType.click();
//            WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(10));
//            WebElement fundtype=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Public close ended')]")));
//            fundtype.click();
//        driver.findElement(By.xpath("//*[@id=\"type_of_investments-sp\"]/option[3]")).click();
        Thread.sleep(3000);

        WebDriverWait wait55 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropOFFundType = wait55.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[3]/div[1]/span/span[1]/span")
                )
        );

// ⭐ FIX: Use JavaScript click to bypass overlay
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropOFFundType);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropOFFundType);

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fundtype = wait3.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//li[contains(text(),'Public close ended')]")
        ));

        fundtype.click();

        driver.findElement(By.id("select2-auto_transfer-sp-container")).click();
            driver.findElement(By.id("bench_mark_inp")).sendKeys("S&P500");
            driver.findElement(By.id("investment_years_inp")).sendKeys("10");
            driver.findElement(By.xpath("//*[@id=\"submitted-form\"]/div[1]/div[2]/div/div[3]/div[4]/span/span[1]/span")).click();
            WebDriverWait wait8=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement FundDurationType=wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Years')]")));
            FundDurationType.click();
            WebElement inceptionPrice=driver.findElement(By.id("inception_price_inp"));
            inceptionPrice.sendKeys("100");
            WebElement totalIssuedUnit=driver.findElement(By.id("units_count_inp"));
            totalIssuedUnit.sendKeys("100");
            WebElement limitUnitForinv=driver.findElement(By.id("limit_units_investor_inp"));
            limitUnitForinv.sendKeys("50");
            WebElement limitUnitForQualified=driver.findElement(By.id("limit_units_investors_qualified_inp"));
            limitUnitForQualified.sendKeys("0");
            WebElement NAV=driver.findElement(By.id("unit_price_inp"));
            NAV.sendKeys("100");
//        }

    }
    @Test(priority = 2)
    public void Subscription_Details(){
        driver.findElement(By.id("launch_date_inp")).sendKeys("07/09/2025");
        driver.findElement(By.id("duration_from_inp")).sendKeys("06/06/2025");
        driver.findElement(By.id("duration_to_inp")).sendKeys("07/07/2025");
        driver.findElement(By.id("fund_end_inp")).sendKeys("07/10/2025");
        WebDriverWait wait9=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement money_transferred=wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Manual')]")));
        money_transferred.click();
        // mini subscription amount
        WebElement mini_Sub= driver.findElement(By.id("initial_investment_inp"));
        mini_Sub.sendKeys("100");
        //incremental investment
        WebElement INCine=driver.findElement(By.id("subsequent_investment_inp"));
        INCine.sendKeys("100");
    }
    @Test(priority = 3)
    public void Asset_Classes(){
        driver.findElement(By.id("asset_classes_repeater_0_percentage_inp")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"asset_classes_repeater_0_category_id_inp\"]/option[2]")).click();
    }
    @Test(priority = 4)
    public void Fees(){
        driver.findElement(By.id("management_fees_inp")).sendKeys("1");
        driver.findElement(By.id("subscription_fees_inp")).sendKeys("1");
        driver.findElement(By.id("distribution_fees_inp")).sendKeys("1");
        driver.findElement(By.id("admin_fees_inp")).sendKeys("1");
        driver.findElement(By.id("performance_fees_inp")).sendKeys("1");
        driver.findElement(By.id("redemption_fees_inp")).sendKeys("1");
        driver.findElement(By.id("next-btn")).click();
    }
//    @Test
//    public void
    @AfterTest
    public void quit_driver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
