package in.co.get;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO_getModel {

	public void getroll_no(DAO_get b) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
		PreparedStatement ps = c.prepareStatement("select roll_no from marksheet");
		
	//	ps.setString(0, b.getRoll_no());
		
		ResultSet i = ps.executeQuery();
		
		
		System.out.println(i);
		
		ps.close();
		c.close();
		
		
		
	}
}
