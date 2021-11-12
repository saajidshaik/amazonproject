package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DailogBoxOnFlipkart {
	
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElementByXPath("(//input[contains(@type,'text')])[2]").sendKeys("abc@gmail.com");
		
		driver.findElementByXPath("(//input[contains(@type,'password')])").sendKeys("password");
		
		driver.findElementByXPath("(//button[contains(@type,'submit')])[2]").click();
		
		String expectedMessage = "You are not registered with us. Please sign up.";
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='You are not registered with us. Please sign up.']")));
		String actualMessage = driver.findElementByXPath("//div[text()='You are not registered with us. Please sign up.']").getText();
		
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
			
		}
	
	}

}
