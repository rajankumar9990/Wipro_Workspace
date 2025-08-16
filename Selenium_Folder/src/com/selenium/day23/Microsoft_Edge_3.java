package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.PageLoadStrategy;

public class Microsoft_Edge_3 {
	public static void main(String[] args) {
		// 1. Set path to EdgeDriver
		System.setProperty("webdriver.edge.driver", 
    		    "C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\edgedriver_win64\\msedgedriver.exe");
		// 2. Create EdgeOptions and set page load strategy
		EdgeOptions options = new EdgeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // NORMAL: Waits for entire page (DOM + CSS + JS + images)
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER); // EAGER: Waits until DOM is ready (ignores images/CSS)
		options.setPageLoadStrategy(PageLoadStrategy.NONE); // NONE: Does not wait; requires explicit waits

		// 3. Initialize EdgeDriver with options
		WebDriver driver = new EdgeDriver(options);

		// 4. Open a website
		driver.get("https://www.google.com");

		// 5. Print page title
		System.out.println("Page Title: " + driver.getTitle());

		// 6. Close browser
		driver.quit();
	}
}
