package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableDemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bseindia.com/markets/debt/debt_corporate_EOD.aspx?curPage=1");
		
		WebElement table =  driver.findElementById("ContentPlaceHolder1_GridViewcrdsFC");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		boolean valueFound  = false;
		for (int i = 1; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			for (WebElement x : columns) {
				
			if (x.getText().equals("LIQUIETF")) {
				x.click();
				valueFound = true;
				break;
				
			}
		}
		if (valueFound == true) {
			break;
		}
		
		}
	}
	
}
		
		
		
		
		
	
		

