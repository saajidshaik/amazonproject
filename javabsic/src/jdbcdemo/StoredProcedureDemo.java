package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedureDemo {
	private static Connection con;
	private static Statement stmt;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "{call SelectAllMovies()}";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con =DriverManager.getConnection(dburl, username ,password);
		 stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Title:" +rs.getString("title") + "\t");
			System.out.println("Genre" + rs.getString("genre") + "\t");
			System.out.println("Director" +rs.getString("director") + "\t");
			System.out.println("Release years:" +rs.getString("release_year") + "\t");
			System.out.println();
		}
		
	}
	
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	finally {
		stmt.close();
		con.close();
	}
	}
}
