package in.co.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class MarksheetModule {

			
	public  void add(MarksheetBean Bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
		Statement stmt = c.createStatement();
		PreparedStatement ps = c.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		
		ps.setInt(1, Bean.getId());
		ps.setString(2, Bean.getRoll_no());
		ps.setString(3, Bean.getName());
		ps.setInt(4, Bean.getPhysics());
		ps.setInt(5, Bean.getChemistry());
		ps.setInt(6, Bean.getMaths());
		
		int i = ps.executeUpdate();
	
		c.close();
		stmt.close();
	}
	
	 
	
}
