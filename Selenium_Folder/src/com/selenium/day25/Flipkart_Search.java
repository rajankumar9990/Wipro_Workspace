package com.selenium.day25;

import java.io.FileInputStream;
import java.time.Duration;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Search {
	public static void main(String[] args) throws Exception {

		// Load credentials from properties file
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("src\\com\\selenium\\day25\\Flipkart.properties");
		props.load(fis);

		String email = props.getProperty("flipkart.email");
		// String password = props.getProperty("flipkart.password");

		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/account/login?ret=/");
		// Login
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"))
				.sendKeys(email);
		// driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[2]/input")).click();
		Thread.sleep(1000);
		// For otp
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(30000);

		// Search for a single product
		driver.findElement(By.name("q")).sendKeys("laptop");

		// Click search button using XPath
		driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/button/svg"))
				.click();

		Thread.sleep(2000); // wait for results

		// Click the first product
		driver.findElement(By.className("KzDlHZ")).click();

		Thread.sleep(2000); // wait for product page

		// Click "Add to Cart"
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button/svg"))
				.click();
		System.out.println("Product added to cart!");

		// Click "Place Order" using your XPath
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span"))
				.click();

		System.out.println("Clicked Place Order!");

		/*
		 * // Product list to add to cart List<String> products = new ArrayList<>();
		 * products.add("laptop"); products.add("headphones");
		 * products.add("wireless mouse");
		 * 
		 * for (String product : products) { // Search product WebElement searchBox =
		 * driver.findElement(By.id("twotabsearchtextbox")); searchBox.clear();
		 * searchBox.sendKeys(product);
		 * driver.findElement(By.id("nav-search-submit-button")).click();
		 * 
		 * WebElement addToCartBtn =
		 * driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]"));
		 * addToCartBtn.click();
		 * System.out.println("Products Added to Cart Successfully.");
		 * Thread.sleep(2000); }
		 */

		// driver.quit();
	}
}
