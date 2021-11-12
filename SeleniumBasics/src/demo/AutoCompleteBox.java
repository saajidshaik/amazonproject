package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompleteBox {
	
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	driver.findElementByName("q").sendKeys("mobile");
	
	WebDriverWait wait =new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@role,'listbox')])[1]")));
	
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
	sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	}
}
	