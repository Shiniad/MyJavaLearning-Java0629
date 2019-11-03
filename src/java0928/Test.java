package java0928;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		DBUtil.sql = "select * from sys_user";
		
		ResultSet rSet = DBUtil.query();
		try {
			while(rSet.next()) {
				 System.out.println(rSet.getInt(1) + "\t" + rSet.getString(2));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		DBUtil.closeSource();
	}
}
