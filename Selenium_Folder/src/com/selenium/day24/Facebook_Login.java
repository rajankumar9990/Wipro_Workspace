package com.selenium.day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Load config.properties
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("src/com/selenium/day24/Facebook.properties");
		props.load(fis);
		String chromeDriverPath = props.getProperty("chromedriver.path");
		String email = props.getProperty("fb.email");
		String password = props.getProperty("fb.password");
		// Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// Step 1: Enter email/phone number and password
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);

		// Step 2: Click Login button
		driver.findElement(By.name("login")).click();

		Thread.sleep(5000); // wait for login
		System.out.println("Facebook login successfully.");

		driver.quit();

		// TODO Auto-generated method stub

	}

}
