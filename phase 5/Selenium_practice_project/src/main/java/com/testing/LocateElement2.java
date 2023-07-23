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

	public class LocateElement2 {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
			
			 demoXPathCSSSelector(driver);
}
		static void demoXPathCSSSelector(WebDriver driver) {
			String baseUrl = "File:///C:\\Users\\lenovo\\project documentation\\phase5\\Selenium_practice_project\\src\\main\\resources\\test.html";

			driver.get(baseUrl);

			List<WebElement> inputAdminElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

			System.out.println("inputAdminElements has " + inputAdminElements.size());

			// same as above but by using CSS selectors
			List<WebElement> inputAdminElementsUsingCSSSelector = driver.findElements(By.cssSelector("input[id*='admin']"));

			System.out.println("inputAdminElementsUsingCSSSelector has " + inputAdminElementsUsingCSSSelector.size());

			WebElement secondH3SiblingOfForm = driver.findElement(By.cssSelector("h3:nth-child(2)"));
			System.out.println("secondH3SiblingOfForm text is " + secondH3SiblingOfForm);
		}

}