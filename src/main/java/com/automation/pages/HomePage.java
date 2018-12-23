package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends  Pages{

    //define all the functionalities in the home page as a methods

    public void goToSignUp(){


        driver.findElement(By.cssSelector(".signup")).click();





    }

    public void goToLogin(){


        driver.findElement(By.cssSelector(".signin")).click();


    }

    public void goToCustomerSupport(){

        driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();


    }

    public void goToContactSales(){

        //


    }

}
