package com.selenium.day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login{
    public static void main(String[] args) throws IOException, InterruptedException {

        // Load config.properties
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(
                "src\\com\\selenium\\day25\\Amazon.properties");
        props.load(fis);

        String chromeDriverPath = props.getProperty("chromedriver.path");
        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Amazon login page
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5223385579925750794%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9184416%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();

        Thread.sleep(3000);
        System.out.println("Amazon login successfully.");

        // List of products to search
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");

        for (String product : products) {

            // Search for the product
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();

            // Click the first product in search results
            WebElement firstProduct = driver.findElement(
                    By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
            firstProduct.click();

            // Switch to the new product tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tabs.size() - 1));

            // Click the "Add to Cart" button
            WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]"));
            addToCartButton.click();

            // Wait for 2 seconds
            Thread.sleep(2000);

            // Close the product tab and go back to main tab
            driver.close();
            driver.switchTo().window(tabs.get(0));
        }

        // -------------------------------
        // Quit the browser
        // -------------------------------
        driver.quit();
    }
}
