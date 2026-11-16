package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step1:register for driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("registered for driver successfully");
		
		//step2:establish the connection
		String url="jdbc:mysql://localhost:3306/jfs56";
		String uname="root";
		String pwd="root";
		
		//step3:create connection
		Connection con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("database connected successfully");
		
		//step4:create statement
		Statement stmt=con.createStatement();
		System.out.println("Statement created successfully");
		
		//step5:sql query
		String qry="select sid,sname,marks from student where marks<=85";
		
		
		ResultSet res=stmt.executeQuery(qry);
		
		if(res.next()) {
			System.out.println(res.getInt("sid")+" "+
					res.getString("sname")+" "+res.getInt("marks"));
			
		}
		stmt.executeQuery(qry);
		
		//step6:statement and connection close
		stmt.close();
		con.close();
		
	
	}

}
