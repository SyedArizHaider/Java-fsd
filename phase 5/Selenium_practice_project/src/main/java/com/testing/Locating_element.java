package com.testing;


	

	import java.util.List;

	import org.openqa.selenium.*;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.support.ui.Select;
	public class Locating_element {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver(); }
			// new FirefoxDriver();	
			
			static void googleAccCreation(WebDriver driver) {
				String baseUrl = "https://accounts.google.com/signup/v2/createaccount?biz=true&cc=IN&continue=http%3A%2F%2Fsupport.google.com%2Faccounts%2Fanswer%2F27441%3Fhl%3Den&dsh=S50468520%3A1690140758676154&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=AeDOFXjf9PzdKSXsg-bDl8EX8VCSlPOTGxCSS_UCKQt9Dm65_rQGWS31g2JMhdvb4jfRJHNkGEPO";
				driver.get(baseUrl);
				
				// Let's locate the first name text field by its id.
						WebElement firstNameTF = driver.findElement(By.id("firstName"));				
						firstNameTF.sendKeys("Myname");
						

}
}