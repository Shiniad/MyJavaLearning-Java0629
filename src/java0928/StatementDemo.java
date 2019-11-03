package java0928;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "delete from sys_user where uid in (11,12)";

		Connection conn = null;
		Statement st = null;

		try {
			// 获取连接
			conn = CreateDbConnection.getConn();
			// 创建Statement语句
			st = conn.createStatement();
			int count = st.executeUpdate(sql);
			if (count == 2) {// 当可以明确影响的条数是几条时就写几条
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接
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
