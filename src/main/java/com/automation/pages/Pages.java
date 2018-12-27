package com.automation.pages;

/*

the page class contains the definitions of objects that are common acrors
all pages and this can be inherited by every other page
 */

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Pages {

    public static WebDriver driver;
    public static Properties OR = new Properties();
    public static Properties config = new Properties();
    public static FileInputStream fis;
    public static Logger log = Logger.getLogger("");
    //public static ExcelReader excel = new ExcelReader()
    public static WebDriverWait wait;
    //public ExtentReports rep = Ext
    public static ExtentTest test;
    public static String browser;

    @DataProvider(name="dp")
    public Object[][] getData(Method m){

            String sheetName = m.getName();
            //int rows =

        return null;





    }



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
