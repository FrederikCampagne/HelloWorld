package com.example.demo;


import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoApplicationTests {
	   private static WebDriver driver;

	   @BeforeClass
	   public static void createAndStartService() throws IOException {
	     WebDriverManager.chromedriver().setup();
	     ChromeOptions options = new ChromeOptions();
	     options.setHeadless(true);
	     options.addArguments("--no-sandbox");
	     options.addArguments("--disable-infobars");
	     options.addArguments("--disable-extensions");
	     options.addArguments("--disable-dev-shm-usage");
	     options.addArguments("--disable-gpu");
	     options.addArguments("");
	     driver = new ChromeDriver(options);
	   }

	   @After
	   public void quitDriver() {
	     driver.quit();
	   }
	  
	
	@Test
	public void test2() throws InterruptedException {
	    // fake commit
		driver.get("http://localhost:8090/tainnovationteam/");
		Assert.assertEquals("Welcome to HelloWorld!", driver.findElement(By.className("whatup")).getText());
		 
	}

}
