package com.selenium.day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Load config.properties
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(
                "src/com/selenium/day24/amazon.properties");
        props.load(fis);

        String chromeDriverPath = props.getProperty("chromedriver.path");
        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Amazon login page
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fap%2Fcnep%3Fie%3DUTF8%26orig_return_to%3Dhttps%253A%252F%252Fwww.amazon.in%252Fyour-account%26openid.assoc_handle%3Dinflex%26pageId%3Dinflex&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

        // Step 1: Enter email/phone number and click Continue
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("continue")).click();

        // Step 2: Wait for password field and enter password
        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        

        Thread.sleep(3000);
        System.out.println("Amazon login successfully.");
        
        driver.get("https://www.amazon.in/ref=nav_logo");
        Thread.sleep(2000);
        // Search for a product
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));  //id=twotabsearchtextbox
        searchBox.sendKeys("laptop"); // change product as needed
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000); // wait for search results
        
     /// Wait for search results to load
        Thread.sleep(5000);

     // Find the first product's link (<a> tag inside the search result)
     WebElement firstProductLink = driver.findElement(
         By.cssSelector("div.s-main-slot div[data-component-type='s-search-result'] h2 a")
     );

     // Click the link
     firstProductLink.click();

     // Switch to new tab if Amazon opens product in a new tab
     for (String handle : driver.getWindowHandles()) {
         driver.switchTo().window(handle);
     }

     Thread.sleep(3000); // wait for product page
     driver.findElement(By.id("add-to-cart-button")).click();

     Thread.sleep(3000);
     System.out.println("Product added to cart successfully.");

        Thread.sleep(3000); // wait for product page
        driver.findElement(By.id("add-to-cart-button")).click();

        Thread.sleep(3000); // wait for cart update
        System.out.println("Product added to cart successfully.");
        
        

        
        


        //driver.quit();
    }
}
