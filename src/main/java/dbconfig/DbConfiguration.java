package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConfiguration {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userDetails", "root", "Sazz@8381");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from employee");
		while(rs.next()) {
			String value = rs.getString("username");
			System.out.println(value);
			String pswd = rs.getString("Password");
			System.out.println(pswd);
		}	
	}
}
