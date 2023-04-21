package in.co.crud_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.co.bean_update.Bean_1;

public class Bean_Model {

	public void update1(Bean_update b1) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");
		PreparedStatement ps = c.prepareStatement("update student set name = ? where id = ?");

		ps.setString(1, b1.getName());
		ps.setInt(2, b1.getId());
		
		
		int i = ps.executeUpdate();

		System.out.println(i);

		ps.close();
		c.close();

	}

	
		
	}

