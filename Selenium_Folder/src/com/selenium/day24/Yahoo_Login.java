package com.selenium.day24;

import java.io.FileInputStream;
import java.io.IOException;
//mport java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Login {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Load config.properties
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(
                "src/com/selenium/day24/yahoo.properties");
        props.load(fis);

        String chromeDriverPath = props.getProperty("chromedriver.path");
        String email = props.getProperty("yahoo.email");
        String password = props.getProperty("yahoo.password");

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Yahoo login page
        driver.get("https://login.yahoo.com/");

        // Step 1: Enter email and click Next
        driver.findElement(By.id("login-username")).sendKeys(email);
        driver.findElement(By.id("login-signin")).click();  //inspected id from yahoo

        // Step 2: Wait for password field and enter password
        Thread.sleep(2000);
        driver.findElement(By.id("login-passwd")).sendKeys(password);
        driver.findElement(By.id("login-signin")).click();  

        Thread.sleep(3000);
        System.out.println("Yahoo login successfully.");

        //driver.quit();
    }
}
