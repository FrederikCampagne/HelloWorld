package com.example.demo;


import java.io.IOException;
import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoApplicationTests {
	   private static WebDriver driver;

	   @BeforeClass
	   public static void createAndStartService() throws IOException {
		   driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
			         DesiredCapabilities.chrome());
	   }

	   @After
	   public void quitDriver() {
	     driver.quit();
	   }
	  
	
	@Test
	public void test2() throws InterruptedException {
	    // fake commit
		driver.get("http://dockervm:9091/");
		Assert.assertEquals("Welcome to HelloWorld!", driver.findElement(By.className("whatup")).getText());
		 
	}

}
