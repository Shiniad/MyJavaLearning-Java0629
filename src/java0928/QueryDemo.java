package java0928;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDemo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String sql = "select * from sys_user";
		
		try {
			// 获取连接
			conn = CreateDbConnection.getConn();
			// 创建查询
			st = conn.createStatement();
			// 执行查询
			rs = st.executeQuery(sql);
			while(rs.next()) {// 遍历返回的数据集的行,只要游标的当前行存在就返回true
				// 处理当前读到的这一行数据
				System.out.println(rs.getLong(1) + "\t" + rs.getString(2) + "\t" + rs.getString("upassword"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			// 关闭连接
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
