package roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase1 {


    @Test(dataProvider = "getData")
    public void doLogin(String username, String password){

        //System.setProperty("webdriver.chrome.driver","/Volumes/Dev/AutomationFramework/src/main/resources/executables/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/src/main/resources/executables/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.zoho.com/signin?servicename=ZohoHome&serviceurl=https://home.zoho.com&signupurl=https://www.zoho.com/signup.html");
        driver.findElement(By.id("lid")).sendKeys(username);
        driver.findElement(By.id("pwd")).sendKeys(password);
        driver.findElement(By.id("keepme")).click();
        driver.findElement(By.id(("signin_submit"))).click();


    }


    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[1][2];

        data[0][0] = "bolofmama@gmail.com";
        data[0][1] = "Dammy2k100$";
        return data;


    }



}
