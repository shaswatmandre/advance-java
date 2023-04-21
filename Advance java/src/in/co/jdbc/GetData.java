package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from teachers");
		
		while(rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println("\t"+rs.getInt(3));

		}
		s.close();
		conn.close();
	}

}
