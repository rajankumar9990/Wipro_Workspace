package com.selenium.day24;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Load config.properties
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(
                "src/com/selenium/day24/gmail.properties");
        props.load(fis);

        String chromeDriverPath = props.getProperty("chromedriver.path");
        String email = props.getProperty("gmail.email");
        String password = props.getProperty("gmail.password");

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Gmail login page
        driver.get("https://accounts.google.com/signin");

        // Step 1: Enter email and click Next
        driver.findElement(By.id("identifierId")).sendKeys(email);
        driver.findElement(By.id("identifierNext")).click();

        // Step 2: Wait for password field and enter password
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("passwordNext")).click();

        Thread.sleep(5000);
        System.out.println("Gmail login successfully.");

        //driver.quit();
    }
}
