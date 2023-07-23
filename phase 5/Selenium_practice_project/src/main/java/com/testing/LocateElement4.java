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

public class LocateElement4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	demoAlert(driver);
}
/* Alert actions demo */
static void demoAlert(WebDriver driver) throws InterruptedException {
	String baseUrl = "File:///C:\\Users\\lenovo\\project documentation\\phase5\\Selenium_practice_project\\src\\main\\resources\\test.html";

	driver.get(baseUrl);

	// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(10000);

	// Click the link to activate the alert
	driver.findElement(By.linkText("See an example alert")).click();

	Thread.sleep(10000);

	// alert will appear now, may be in 10 secs
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// Wait for the alert to be displayed and store it in a variable
	wait.until(ExpectedConditions.alertIsPresent());
	// Store the alert in a variable
			Alert alert = driver.switchTo().alert();

			// Store the alert in a variable for reuse
			String text = alert.getText();
			System.out.println(text);

			// Press the Cancel button
			alert.accept();
		}
}