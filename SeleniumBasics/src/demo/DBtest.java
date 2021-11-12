package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DBtest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		
		WebElement helloSignin = driver.findElementById("nav-link-accountList");
		Actions actions = new Actions(driver);
		actions.moveToElement(helloSignin).build().perform();
		
		driver.findElementByLinkText("Sign in").click();
		
		String textfromWebpage = driver.findElementByXPath("//h1[contains(@class,'a-spacing-small')]").getText();
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "select title from movies where director = 'saajid';";

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(dburl, username ,password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		String textFromDB =rs.getString("title");
		
		while (rs.next()) {
			textFromDB = rs.getString("title");
			
		}
	if(textfromWebpage.equals(textFromDB)) {
		System.out.println("Test case passed");	
	}
	else {
		System.out.println("test cas failed");
	}
	}

}


