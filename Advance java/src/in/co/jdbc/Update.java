package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Update {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement s = c.createStatement();
		
		int i =s.executeUpdate("delete from teachers where id=21");
		System.out.println(i);
		
	}
}
