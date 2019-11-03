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
			// ��ȡ����
			conn = CreateDbConnection.getConn();
			// ������ѯ
			st = conn.createStatement();
			// ִ�в�ѯ
			rs = st.executeQuery(sql);
			while(rs.next()) {// �������ص����ݼ�����,ֻҪ�α�ĵ�ǰ�д��ھͷ���true
				// ����ǰ��������һ������
				System.out.println(rs.getLong(1) + "\t" + rs.getString(2) + "\t" + rs.getString("upassword"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			// �ر�����
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
