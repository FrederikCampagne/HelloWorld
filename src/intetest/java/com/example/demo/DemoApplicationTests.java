package com.example.demo;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoApplicationTests {
	 private static ChromeDriverService service;
	   private WebDriver driver;

	   @BeforeClass
	   public static void createAndStartService() throws IOException {
	     service = new ChromeDriverService.Builder()
	         .usingDriverExecutable(new File("./chromedriver/chromedriver.exe"))
	         .usingAnyFreePort()
	         .build();
	     service.start();
	   }

	   @AfterClass
	   public static void createAndStopService() {
	     service.stop();
	   }

	   @Before
	   public void createDriver() {
	     driver = new RemoteWebDriver(service.getUrl(),
	         DesiredCapabilities.chrome());
	   }

	   @After
	   public void quitDriver() {
	     driver.quit();
	   }
	  
	
	@Test
	public void test2() throws InterruptedException {
		driver.get("http://localhost:8090/HelloWorld");
		Assert.assertEquals("Welcome to HelloWorld!", driver.findElement(By.className("whatup")).getText());
		 
	}

}
