package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register for drive
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		String url="jdbc:mysql://localhost:3306/jdbc_practice";
		String uname="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connected succesfully");
		
		//create statement
		Statement stmt=con.createStatement();
		System.out.println("Statement created successfully");
		
		//String qry="create table employee(eid int, ename varchar(20),eemail_id varchar(20),edept_name varchar(20))";
		//String qry1="insert into employee(eid,ename,eemail_id,edept_name) values(101,'Sai','sai2@gmail.com','IT')";
		String qry2="select * from employee";
		
		//stmt.execute(qry1);
		stmt.execute(qry2);
		//System.out.println("table created successfully");
		
		//System.out.println("record inserted successfully");
		
		stmt.close();
		con.close();
		
		

	}

}
