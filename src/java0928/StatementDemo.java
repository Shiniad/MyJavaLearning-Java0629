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
			// ��ȡ����
			conn = CreateDbConnection.getConn();
			// ����Statement���
			st = conn.createStatement();
			int count = st.executeUpdate(sql);
			if (count == 2) {// ��������ȷӰ��������Ǽ���ʱ��д����
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// �ر�����
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
