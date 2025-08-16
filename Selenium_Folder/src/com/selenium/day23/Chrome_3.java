package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.PageLoadStrategy;

public class Chrome_3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Create ChromeOptions and set page load strategy
		ChromeOptions options = new ChromeOptions();
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // NORMAL: Waits for entire page (DOM + CSS + JS + images)
		// options.setPageLoadStrategy(PageLoadStrategy.EAGER); // EAGER: Waits until DOM is ready (ignores images/CSS)
		options.setPageLoadStrategy(PageLoadStrategy.NONE);  // NONE: Does not wait; requires explicit waits

		// Pass options to ChromeDriver
		WebDriver driver = new ChromeDriver(options);

		// Open website
		driver.get("https://www.google.com");

		// Print title
		System.out.println("Title: " + driver.getTitle());

		// Close browser
		// driver.quit();
	}
}
