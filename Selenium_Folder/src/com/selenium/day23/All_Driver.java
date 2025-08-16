package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Driver {
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// Tell Selenium where GeckoDriver is located
		System.setProperty("webdriver.gecko.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\geckodriver-v0.36.0-win64\\geckodriver.exe");

		// Launch Firefox browser (upcasting: FirefoxDriver → WebDriver)
		WebDriver driver1 = new FirefoxDriver();

		WebDriver driver2 = new EdgeDriver(); // upcasting
		WebDriver driver3 = new ChromeDriver(); // upcasting

		driver1.get("https://www.google.com");
		driver2.get("https://www.google.com");
		driver3.get("https://www.google.com");

		// driver.get("https://www.facebook.com");
		System.out.println("Title: " + driver1.getTitle());
		System.out.println("Title: " + driver2.getTitle());
		System.out.println("Title: " + driver3.getTitle());

		// driver.quit();
		//driver1.close();
	}

}
