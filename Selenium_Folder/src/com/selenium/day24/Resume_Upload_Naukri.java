package com.selenium.day24;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload_Naukri {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.naukri.com/nlogin/login");

        driver.findElement(By.id("usernameField")).sendKeys("guptarajanapex99@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("R@j@n1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.get("https://www.naukri.com/mnjuser/profile");

        Thread.sleep(5000);

        WebElement fileInput = driver.findElement(By.id("attachCV"));
        File resume_file = new File("C:\\Users\\91999\\Downloads\\Rajan Resume New 2025.pdf");
        fileInput.sendKeys(resume_file.getAbsolutePath());
        Thread.sleep(5000);

        System.out.println("Resume uploaded successfully to Naukri");

        driver.quit();
    }
}
