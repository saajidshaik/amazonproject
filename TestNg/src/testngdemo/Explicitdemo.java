package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Explicitdemo {
	ChromeDriver driver;

	@BeforeTest
	public void  launchApplication() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://whitecircleschool.com/explicit -wait-demo1/");
	}
		
		@Test
		public void titleVerification() {
		driver.findElementById("start").click();
		
		String expectedText = "Hello World!";
		
		WebDriverWait wait	 = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#finish > h4")));
		
		String actualText = driver.findElementByCssSelector("#finish > h4").getText();
		
		System.out.println("text resd from the page = " + actualText);
	
	
		Assert.assertEquals(actualText, expectedText);
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}

