package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		driver.get("https://www.trivago.com");
		
		Thread.sleep(2000);
		driver.findElementById("onetrust-accept-btn-handler").click();
		
		driver.findElementByXPath("//button[contains(@data-qa,'calendar-checkin')]").click();
		
		WebElement nextmonth = driver.findElementByXPath("//table[contains(class,'cal-month')])[2]");
		
		
		List<WebElement> rows =  nextmonth.findElements(By.tagName("tr"));
		
		boolean valueselected = false;
		for(int i = 1; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
	
			for (WebElement x : columns ) {
				if (x.getText().equals("19")) {
					x.click();
					valueselected = true;
					break;
					
				}
			}
		if(valueselected == true)  {
			break;
		}
		}
		
		
				
	}


}
