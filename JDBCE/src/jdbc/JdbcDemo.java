package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("register driver");
		
		String url="jdbc:mysql://localhost:3306/jfs56";		
		String uname="root";
		String pwd="root";
		
		Connection con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("database connected successfully");
		
		Statement stmt=con.createStatement();
		System.out.println("statement created successfully");
		
		String qry="select * from employees where emp_id=101";
		
		ResultSet res=stmt.executeQuery(qry);
		
		if(res.next()) {
			System.out.println(res.getInt("emp_id")+" "+
					res.getString("emp_name")+" "+res.getString("department")+" "+
					res.getInt("salary")+" "+res.getDate("hire_date")+" "+
					res.getString("city"));
			
		}
		
		stmt.execute(qry);
		
		stmt.close();
		con.close();
	}

}
