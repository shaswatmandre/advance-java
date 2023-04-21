package in.co.bean_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Bean_1Model {

	public void update(Bean_1 bean) throws Exception  {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
		PreparedStatement ps = c.prepareStatement("update marksheet set name = ? where id = ?");
		
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getId());
		
		int i = ps.executeUpdate();
		
		System.out.println(i);
		
		
		ps.close();
		c.close();
		
		
	}

}
