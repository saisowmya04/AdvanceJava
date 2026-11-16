package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		//step1: to register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Registered successfully");
		
		//step2:establish the connection
		String url="jdbc:mysql://localhost:3306/jfs56";
		String uname="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(url, uname, pwd);
		System.out.println("Conected Successfully");
		
		//step3:create statement
		Statement stmt=con.createStatement();
		System.out.println("Statement created successfully");
		
		//step4:query execution
		String query="create table dept(did int,dname varchar(20))";
		stmt.execute(query);
		System.out.println("table created successfully");
		
		stmt.close();
		con.close();
	}

}
