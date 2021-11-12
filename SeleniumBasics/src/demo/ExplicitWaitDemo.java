package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://whitecircleschool.com/explicit -wait-demo1/");
		
		driver.findElementById("start").click();
		
		String expectedText = "Hello World!";
		
		WebDriverWait wait	 = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#finish > h4")));
		
		String actualText = driver.findElementByCssSelector("#finish > h4").getText();
		
		System.out.println("text resd from the page = " + actualText);
		
		if(expectedText.equals(actualText)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		driver.quit();
		}

}
