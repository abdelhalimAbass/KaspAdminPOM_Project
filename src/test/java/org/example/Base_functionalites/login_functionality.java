package org.example.Base_functionalites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_functionality {

         WebDriver driver;

//        public login_functionality(WebDriver driver) {
//            this.driver = driver;
//        }

        //"https://dash-fundex-demo-dev.dafagate.com/funds/create";
        //"https://dashboard-kasb-beta.dafa.sa/admin/login";

        public void login_cred(String email, String pass)
        {

            driver.findElement(By.id("email_inp")).sendKeys(email);
            driver.findElement(By.id("password_inp")).sendKeys(pass);
            driver.findElement(By.id("submit-btn")).click();

        }
    }

