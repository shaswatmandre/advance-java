package in.co.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO_Model {
	
	public void delete(DAO_Delete d) throws Exception{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
		PreparedStatement ps = c.prepareStatement("delete from marksheet where id =?");
		
		ps.setInt(1, d.getId());
		
		int i = ps.executeUpdate();
		
		System.out.println(i);
		
		ps.close();
		c.close();
		
	}

}
