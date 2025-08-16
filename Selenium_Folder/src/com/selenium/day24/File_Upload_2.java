package com.selenium.day24;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_2{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
                "C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			driver.get("http://the-internet.herokuapp.com/upload ");
			File uploadFile = new File("C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\hello.pdf");
			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			driver.findElement(By.id("file-submit")).click();
			String resultText = driver.findElement(By.id("uploaded-files")).getText();

			System.out.println("Uploaded: " + resultText);
		} finally {
			//driver.quit();
		}

	}

}
