package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
     private WebDriver driver;

    public login_page(WebDriver driver) {
        this.driver = driver;
    }
    String url="https://dashboard-kasb-beta.dafa.sa/admin/login";
            //"https://dash-fundex-demo-dev.dafagate.com/funds/create";
            //"https://dashboard-kasb-beta.dafa.sa/admin/login";

    public login_page login_cred(String email,String pass)
    {
        driver.get(url);
        driver.findElement(By.id("email_inp")).sendKeys(email);
        driver.findElement(By.id("password_inp")).sendKeys(pass);
        driver.findElement(By.id("submit-btn")).click();
        return new login_page(driver);
    }
}
