package com.selenium.day25;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Login {
    public static void main(String[] args) throws Exception {

        // Load credentials from properties file
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src\\com\\selenium\\day25\\Myntra.properties");
        props.load(fis);

        String email = props.getProperty("myntra.email");
        String password = props.getProperty("myntra.password");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Open Myntra login page
        driver.get("https://www.myntra.com/login");

        // Step 2: Login
        driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[2]/input")).click();
        Thread.sleep(35000);
        driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]")).click();
       
   

        // Step 3: Product list to add to cart
        List<String> products = new ArrayList<>();
        products.add("t-shirt");
        products.add("jeans");
        products.add("shoes");

        for (String product : products) {
            // Search product
            WebElement searchBox = driver.findElement(By.cssSelector("input.desktop-searchBar"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.cssSelector("a.desktop-submit")).click();

            Thread.sleep(2000); // short pause for search results to load

            // Click first product in search results
            WebElement firstProduct = driver.findElement(By.cssSelector("li.product-base a"));
            firstProduct.click();

            // Switch to product tab
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            // Click "Add to Bag"
            WebElement addToBagBtn = driver.findElement(By.xpath("//button[text()='ADD TO BAG']"));
            addToBagBtn.click();
            System.out.println(product + " added to cart successfully.");

            Thread.sleep(2000); // short pause for cart update

            // Close product tab and switch back to main window
            driver.close();
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));
        }

        // Step 4: Close browser
        // driver.quit();
    }
}
