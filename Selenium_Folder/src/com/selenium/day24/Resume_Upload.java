package com.selenium.day24;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://www.naukri.com/nlogin/login");

			// Step 2: Enter login details
			driver.findElement(By.id("usernameField")).sendKeys("guptarajanapex99@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("R@j@n1234");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			driver.get("https://www.naukri.com/mnjuser/profile");
			
			WebElement uploadInput = driver.findElement(By.id("attachCV"));
			// driver.get("http://the-internet.herokuapp.com/upload");
			File resume_file = new File("C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\Sample resume.pdf");
			// WebElement fileInput =
			// driver.findElement(By.cssSelector("input[type=file]"));
			
			// fileInput.sendKeys(resume_file.getAbsolutePath());
			uploadInput.sendKeys(resume_file.getAbsolutePath());
			//driver.findElement(By.id("file-submit")).click();
			//String resultText = driver.findElement(By.id("uploaded-files")).getText();
			//System.out.println("Uploaded: " + resultText);
			System.out.println("Resume Uploaded on Naukri");

		} finally {
			// driver.quit();
		}
	}

}
