package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Project {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dburl = "jdbc:mysql://localhost:3306/product";
		String username = "root";
		String password = "root";
		String query = "select * from product_details ;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(dburl, username ,password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("product Name:" +rs.getString("product_name") + "\t");
			System.out.println("Product Details:" + rs.getString("Product_details") + "\t");
			System.out.println("comapny Name:" +rs.getString("Company") + "\t");
			System.out.println("year of manufacture:" +rs.getString("year_manufactured") + "\t");
			System.out.println();
		}
		
		
		
	}

}

