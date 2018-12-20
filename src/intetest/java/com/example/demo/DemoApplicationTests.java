package com.example.demo;


import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoApplicationTests {
	   private static WebDriver driver;

	   @BeforeClass
	   public static void createAndStartService() throws IOException {
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
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
