package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firefox_Script_2 {
	public static void main(String[] args) {

	 System.setProperty("webdriver.gecko.driver", 
     		"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\geckodriver-v0.36.0-win64\\geckodriver.exe");

    
 // Create FirefoxOptions
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--start-maximized"); // Opens Firefox maximized

    // Launch Firefox
    WebDriver driver = new FirefoxDriver(options);
    
 // Get capabilities
    Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
    String browserName = caps.getBrowserName();
    String browserVersion = caps.getBrowserVersion();

   
    System.out.println("Browser Name: " + browserName);
    System.out.println("Browser Version: " + browserVersion);

    // Open a website
    driver.get("https://www.google.com");

    // Quit the browser
    driver.quit();
}

}
