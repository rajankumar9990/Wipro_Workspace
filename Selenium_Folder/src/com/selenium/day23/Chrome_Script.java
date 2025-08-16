package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Script {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		
		
		WebDriver driver = new ChromeDriver(); // upcasting

		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}
}
