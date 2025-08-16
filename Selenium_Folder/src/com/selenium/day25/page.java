package com.selenium.day25;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open first website
		driver.get("https://www.google.com/");
		System.out.println("Google : " + driver.getTitle());
		Thread.sleep(4000);

		// Open second website
		driver.get("https://360homedecor.uk/home");
		System.out.println("360 HomeDecor : " + driver.getTitle());
		Thread.sleep(4000);
		// Go back to Flipkart
		driver.navigate().back();
		Thread.sleep(4000);
		// Go forward to Amazon
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}
}