package amazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetails {
	
	public static void main(String[] args) throws InterruptedException, SQLException, ClassNotFoundException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:/amazon.in/");
		WebDriverWait wait	 = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nav-cart-count")));
		
			

		driver.findElementById("nav-cart-count").click();
		WebDriverWait wait1	 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[contains(@class,'sc-your-amazon-cart-is-empty')]")));
		
		String textfromwebpage = driver.findElementByXPath("//h2[contains(@class,'sc-your-amazon-cart-is-empty')]").getText();
		System.out.println(textfromwebpage);
		String dburl = "jdbc:mysql://localhost:3306/amazon";
		String username = "root";
		String password = "root";
		String query = "select title from your_cart where description ='empty cart';";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(dburl, username ,password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		Thread.sleep(3000);
		String textFromDB = null;
		
		while(rs.next()) {
			textFromDB = rs.getString("title"); 
			
		}
		if(textfromwebpage.equals(textFromDB))	 {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
	}   
	
}
