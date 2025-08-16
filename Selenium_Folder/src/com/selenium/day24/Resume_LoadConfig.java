package com.selenium.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_LoadConfig {
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // Load config.properties
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src/com/selenium/day24/Naukri.properties");
        props.load(fis);

        String chromeDriverPath = props.getProperty("chromedriver.path");
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Naukri login page
        driver.get("https://www.naukri.com/nlogin/login");

        // Login
        driver.findElement(By.id("usernameField")).sendKeys(email);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait for login and navigate to profile page
        Thread.sleep(5000);
        driver.get("https://www.naukri.com/mnjuser/profile");

        Thread.sleep(5000);

        // Upload resume
        WebElement fileInput = driver.findElement(By.id("attachCV"));
        File resumeFile = new File(resumePath);
        fileInput.sendKeys(resumeFile.getAbsolutePath());

        Thread.sleep(5000);
        System.out.println("Resume uploaded successfully to Naukri");

        driver.quit();
    }
}
