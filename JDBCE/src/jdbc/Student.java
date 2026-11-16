package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register for driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		String url="jdbc:mysql://localhost:3306/jdbc_practice";
		String uname="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("connected successfully");
		
		//create statement
		Statement stmt=con.createStatement();
		System.out.println("Statement created successfully");
		
		//execute query
		//String query="create table student(sid int, sname varchar(20), smail_id varchar(20))";
		
		//String qry1="insert into student(sid,sname,smail_id) values(1,'Ram','ram1@gmail.com')";
		
		String qry2="select * from student";
		
		//stmt.execute(query);
		stmt.execute(qry2);
		//System.out.println("table created succefully");
		//System.out.println("Record inserted successfully");
		
		
		//closing the connections
		stmt.close();
		con.close();

	}

}
