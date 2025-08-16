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

public class Amazon_Search {
    public static void main(String[] args) throws Exception {

        // Load credentials from properties file
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src\\com\\selenium\\day25\\Amazon.properties");
        props.load(fis);

        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Open Amazon login URL directly
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

        // Step 2: Login
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();

        // Step 3: Product list to add to cart
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");

        for (String product : products) {
            // Search product
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();

        /*    // Click first product in search results
            WebElement firstProduct = driver.findElement(
                By.xpath("//*[@id=\"a-autoid-3-announce\"]")
            );
            firstProduct.click();*/

            // Click "Add to Cart"
            WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]"));
            addToCartBtn.click();
System.out.println("Products Added to Cart Successfully.");
            Thread.sleep(2000); // short pause for cart update
        }


        // Step 4: Close browser
       // driver.quit();
    }
}
