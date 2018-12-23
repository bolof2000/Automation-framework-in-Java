package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import sun.jvm.hotspot.debugger.Page;

public class LoginPage extends Pages {


    public void doLogin(String username, String password){


        driver.findElement(By.id("")).sendKeys(username);
        driver.findElement(By.id("")).sendKeys(password);
        driver.findElement(By.id("")).click();




    }


    public void goToSales(){

    }
}
