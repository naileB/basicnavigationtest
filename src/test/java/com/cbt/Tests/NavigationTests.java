package com.cbt.Tests;

import com.cbt.Utilities.BrowserFactory;
import com.cbt.Utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        String OS = "Mac";
        String browser = "chrome";
        if(browser.equalsIgnoreCase("firefox")){
           testWithFirefox();
        }else if(browser.equalsIgnoreCase("chrome")){
            testWithChrome();
        }else if (browser.equalsIgnoreCase("edge")){
            testWithedge();
        }
    }
   public static void testWithChrome(){
       WebDriver driver = BrowserFactory.getDriver("chrome");
       driver.get("https://google.com");
       String actualTitleOfGoogle = driver.getTitle();
       driver.navigate().to("https://etsy.com");
       String actualyTitleOfEtsy = driver.getTitle();
       driver.navigate().back();
       System.out.println("Previous and Current title of Google page test: ");
       StringUtility.verifyEquals(actualTitleOfGoogle,driver.getTitle());
       driver.navigate().forward();
       System.out.println("Previous and Current title of Etsy page test: ");
       StringUtility.verifyEquals(actualyTitleOfEtsy,driver.getTitle());
       driver.quit();
   }

    public static void testWithFirefox(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String actualTitleOfGoogle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String actualTitleOfEtsy = driver.getTitle();
        driver.navigate().back();
        System.out.print("Previous and current title of Google page test : ");
        StringUtility.verifyEquals(actualTitleOfGoogle, driver.getTitle());
        driver.navigate().forward();
        System.out.print("Previous and current title of Etsy page test   : ");
        StringUtility.verifyEquals(actualTitleOfEtsy, driver.getTitle());
        driver.quit();
    }

    public static void testWithedge(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String actualTitleOfGoogle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String actualyTitleOfEtsy = driver.getTitle();
        driver.navigate().back();
        System.out.println("Previous and Current title of Google page test: ");
        StringUtility.verifyEquals(actualTitleOfGoogle,driver.getTitle());
        driver.navigate().forward();
        System.out.println("Previous and Current title of Etsy page test: ");
        StringUtility.verifyEquals(actualyTitleOfEtsy,driver.getTitle());
        driver.quit();
    }
}
