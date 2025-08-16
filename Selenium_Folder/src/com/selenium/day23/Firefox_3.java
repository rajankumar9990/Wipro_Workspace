package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.PageLoadStrategy;

public class Firefox_3 {
	public static void main(String[] args) {
		// 1. Set path to geckodriver
		System.setProperty("webdriver.gecko.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\geckodriver-v0.36.0-win64\\geckodriver.exe");
		// 2. Create FirefoxOptions and set page load strategy
		FirefoxOptions options = new FirefoxOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // NORMAL: Waits for entire page (DOM + CSS + JS + images)

		//options.setPageLoadStrategy(PageLoadStrategy.EAGER); // EAGER: Waits until DOM is ready (ignores images/CSS)
		options.setPageLoadStrategy(PageLoadStrategy.NONE); // NONE: Does not wait; requires explicit waits
		// 3. Initialize FirefoxDriver with options
		WebDriver driver = new FirefoxDriver(options);

		// 4. Open a website
		driver.get("https://www.google.com");

		// 5. Print page title
		System.out.println("Page Title: " + driver.getTitle());

		// 6. Close browser
		driver.quit();
	}
}
