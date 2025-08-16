package com.selenium.day25;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Decor2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open 360 Home Decor appointment page
		driver.get("https://360homedecor.uk/book-appointment");

		// Select Brand and Style
		driver.findElement(By.id("choose_branch")).sendKeys("360");
		Thread.sleep(1000);
		driver.findElement(By.id("choose_style")).sendKeys("Modern");
		Thread.sleep(1000);
		// Fill details
		driver.findElement(By.name("first_name")).sendKeys("Rajan");
		Thread.sleep(2000);
		driver.findElement(By.name("last_name")).sendKeys("Gupta");
		Thread.sleep(1000);
		driver.findElement(By.name("apt_city")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_number")).sendKeys("9205513565");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);

		// Upload layout file
		File uploadFile = new File("C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\layout.pdf");
		driver.findElement(By.name("layoutFiles[]")).sendKeys(uploadFile.getAbsolutePath());
		System.out.println("File uploaded: " + uploadFile.getName());

		// Accept privacy policy
		driver.findElement(By.xpath("//*[@id=\"privacyPolicy\"]")).click();


		WebElement bookButton = driver
				.findElement(By.cssSelector("#appointment_form > div.col-12.text-center > button"));
		bookButton.click();

		System.out.println("Appointment booked successfully!");

		Thread.sleep(5000);

		// Close browser
		driver.quit();
	}
}
