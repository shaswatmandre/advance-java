package in.co.getpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.bean_update.Bean_1;

public class Bean_ModelGet {
	
	public void get(Bean_1 b) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc,Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
		PreparedStatement ps = c.prepareStatement("select * from roll_no");
		
		ResultSet rs = ps.executeQuery();
		
		rs.getString(1);
		
		 
		
	}

}
