package in.co.Delete1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.co.bean_update.Bean_1;

public class BeanModel_delete {

	public void delete(Bean_Delete b) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
		PreparedStatement ps = c.prepareStatement("delete from student where roll_no = ?");
		
		ps.setString(1, b.getRoll_no());
		
		int i = ps.executeUpdate();
		
		System.out.println(i);
		
		
		ps.close();
		c.close();
		
	}
}
