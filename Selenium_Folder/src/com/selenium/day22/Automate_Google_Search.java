//Use Case: Automate Google Search
package com.selenium.day22;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By; //by-used to locate elements on webpage
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Google_Search {
	public static void main(String[] args) {
		// 1. Set ChromeDriver path
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");

			WebElement searchBox = driver.findElement(By.name("q"));
			// Type the search query into the box
			searchBox.sendKeys("selenium dev");
			// Submit the search form
			searchBox.submit();
			// Wait for results to load
			Thread.sleep(10000);

			System.out.println(driver.getTitle());
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
