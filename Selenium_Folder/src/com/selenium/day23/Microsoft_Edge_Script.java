package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft_Edge_Script {
	 public static void main(String[] args) {
		    
	    	System.setProperty("webdriver.edge.driver", 
	    		    "C:\\Rajan Files\\OneDrive\\Desktop\\Selenium Folder\\edgedriver_win64\\msedgedriver.exe");


	        WebDriver driver1 = new EdgeDriver();  //upcasting
	        WebDriver driver2 = new EdgeDriver();  //upcasting
	        
	        driver1.get("https://www.google.com");
	        
	    
	       driver2.get("https://www.facebook.com");
	        System.out.println("Title: " + driver1.getTitle());
	        System.out.println("Title: " + driver2.getTitle());
	        
	        //driver.quit();
	        //driver.close();
	    }

}
