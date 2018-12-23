package com.automation.pages;

/*

the page class contains the definitions of objects that are common acrors
all pages and this can be inherited by every other page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Pages {

    public static WebDriver driver;

    public Pages(){

        //this is the page constructor

        if(driver==null){

            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")+"/src/main/resources/executables/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.zoho.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }


    }
}
