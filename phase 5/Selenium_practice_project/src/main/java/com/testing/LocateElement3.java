package com.testing;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LocateElement3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); 
	demoIFrameActions(driver);

}
static void demoIFrameActions(WebDriver driver) throws InterruptedException {
	String baseUrl = "File:///C:\\Users\\lenovo\\project documentation\\phase5\\Selenium_practice_project\\src\\main\\resources\\test.html";

	driver.get(baseUrl);

	driver.switchTo().frame("myframe");

	// Now we can click the button
	driver.findElement(By.cssSelector(".DocSearch-Button-Placeholder")).click();
	driver.findElement(By.cssSelector("#docsearch-input")).sendKeys("hello");
	
	driver.switchTo().defaultContent();
	
}
}