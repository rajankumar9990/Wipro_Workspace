package com.selenium.day24;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_1 {

	public static void main(String[] args) {
		// Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {

			// Maximize the browser window
			driver.manage().window().maximize();
			// Open the target page
			driver.get("http://the-internet.herokuapp.com/upload");

			// File to upload
			File uploadFile = new File("C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\file1.txt");

			// Locate the file input field using CSS selector and send file path
			WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());

			// Click the upload button
			driver.findElement(By.id("file-submit")).click();

			// Get the uploaded file name text
			String resultText = driver.findElement(By.id("uploaded-files")).getText();
			System.out.println("Uploaded: " + resultText);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			// driver.quit();
		}
	}
}
