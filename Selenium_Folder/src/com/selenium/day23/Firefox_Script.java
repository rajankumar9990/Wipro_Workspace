package com.selenium.day23;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Script {

    public static void main(String[] args) {
        
        // Tell Selenium where GeckoDriver is located
        System.setProperty("webdriver.gecko.driver", 
        		"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\geckodriver-v0.36.0-win64\\geckodriver.exe");

        // Launch Firefox browser (upcasting: FirefoxDriver → WebDriver)
        WebDriver driver = new FirefoxDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Print the page title
        System.out.println("Title: " + driver.getTitle());
        
        // Close browser
        driver.quit();
    }
}
