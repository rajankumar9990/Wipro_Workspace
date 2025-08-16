package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome_Script_2 {
    public static void main(String[] args) {
        // Set ChromeDriver path
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Launch Chrome
        WebDriver driver = new ChromeDriver(options);

        // Get capabilities using RemoteWebDriver
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getBrowserVersion();
        String platformName = caps.getPlatformName().toString();

        // Print the details
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);
        System.out.println("Platform: " + platformName);

        // Open a site
        driver.get("https://www.google.com");

        // Quit the browser
        driver.quit();
    }
}
