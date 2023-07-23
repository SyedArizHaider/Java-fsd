package com.testing;
import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class LocateElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		}
	
		static void facebookAccCreation(WebDriver driver) {
			String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

			driver.get(baseUrl);
			
			String cssDay = "#day";
			WebElement cssDaySelect = driver.findElement(By.cssSelector(cssDay));	
			
			
			Select daySelect =  new Select(cssDaySelect);
			daySelect.selectByVisibleText("11");
			WebElement cssGenderRadio = driver.findElement(By.cssSelector("span > span > input[type='radio'][value='2']" ));
			cssGenderRadio.click();
			
			// Demo find by tag name
			List<WebElement> titleTagElement = driver.findElements(By.tagName("title"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("console.log(arguments[0].innerText)", titleTagElement);
			
			
			System.out.println("WebPage Title is "+titleTagElement.get(0).getText());
			
		}

}