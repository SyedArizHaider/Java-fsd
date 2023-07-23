package com.testing;

import java.io.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
	public class ScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		demoTakingScreenshot(driver);
		
	}
	
	static void demoTakingScreenshot(WebDriver driver) throws InterruptedException, IOException {
		String baseUrl = "file:///C:/Users/lenovo/Project%20documentation/phase%205/Selenium_practice_project/src/main/resources/test.html";

		driver.get(baseUrl);
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		
		File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File destinationPath = new File("F:/tmp/myScreenshot.jpg");
		
		Files.copy(imgTmpFile, destinationPath);		
		
	}

}

