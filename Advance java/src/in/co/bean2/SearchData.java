package in.co.bean2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SearchData {

	public List Search(SearchBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from marksheet");

		ArrayList list = new ArrayList();
		SearchBean bean1 = null;

		while (rs.next()) {
			bean.setId(rs.getInt(1));
			bean.setRoll_no(rs.getString(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));

			list.add(bean);
		}

		return list;

	}
}
