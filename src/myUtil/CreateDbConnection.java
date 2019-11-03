package myUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDbConnection {
	
	/**
	 * ��ȡ���ݿ����ӵĶ���
	 * @return conn
	 */
	public static Connection getConn() {
		Connection conn = null;
		
		String username = "root";
		String password = "root";
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/mywork?useUnicode=true&characterEncoding=utf8";
		
		// ��������
		try {
			Class.forName(driverClassName);
			
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {// jdbc���ڳ��󹤳�ģʽ�������ɾ�����࣬��������java.sql��������getConnection��̬��������ľ�̬����
			// ��������
			e.printStackTrace();
		} 
//		finally {
//			// ���� ������'No suitable driver found for jdbc:mysql:/127.0.0.1:3306/mywork'˵���ַ���д����
//			// ��������ʹ������Ҫ�ر����ӣ��پ���ķ����в�����д��
//			if(conn!=null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = getConn();
		
		System.out.println(conn);
		
		if(conn!=null) {// �����ָ���쳣
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
