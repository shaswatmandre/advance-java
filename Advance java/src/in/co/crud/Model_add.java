package in.co.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model_add {

	public void add(Bean_add b) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
		PreparedStatement ps = c.prepareStatement("insert into student values(?,?,?,?,?,?)");
		
		ps.setInt(1, b.getId());
		ps.setString(2, b.getRoll_no());
		ps.setString(3, b.getName());
		ps.setInt(4, b.getPhysics());
		ps.setInt(5, b.getChemistry());
		ps.setInt(6, b.getMaths());
		
		
		int i = ps.executeUpdate();
		
		System.out.println(i);
		
		ps.close();
		c.close();
		
		
	}
}
