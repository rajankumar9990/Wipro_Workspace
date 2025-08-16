package com.selenium.day25;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Decor1 {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//360 Home Decor appointment page
		driver.get("https://360homedecor.uk/book-appointment");

		// Select Brand
		WebElement brandDropdown = driver.findElement(By.id("choose_branch"));
		brandDropdown.sendKeys("360");

		// Select Style
		WebElement styleDropdown = driver.findElement(By.id("choose_style"));
		styleDropdown.sendKeys("Modern");

		// Fill in personal details
		driver.findElement(By.name("first_name")).sendKeys("Rajan");
		driver.findElement(By.name("last_name")).sendKeys("Gupta");
		driver.findElement(By.name("apt_city")).sendKeys("Delhi");
		driver.findElement(By.name("phone_number")).sendKeys("9205513565");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");

		// File to upload
		File uploadFile = new File("C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\layout.pdf");

		// Locate the file input field using CSS selector and send file path
		WebElement fileInput = driver.findElement(By.name("layoutFiles[]"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());

		// Click the upload button
		//driver.findElement(By.id("file-submit")).click();

		// Get the uploaded file name text
		String resultText = driver.findElement(By.id("uploaded-files")).getText();
		System.out.println("Uploaded: " + resultText);

		// Accept privacy policy
		WebElement privacyPolicyCheckbox = driver.findElement(By.xpath("//*[@id=\"privacyPolicy\"]"));  //*[@id="privacyPolicy"]
		privacyPolicyCheckbox.click();


		WebElement bookButton = driver.findElement(By.cssSelector("#appointment_form > div.col-12.text-center > button"));
		bookButton.click();

		System.out.println("Appointment booked successfully!");

		Thread.sleep(5000);

		// Close browser
		driver.quit();
	}
}
