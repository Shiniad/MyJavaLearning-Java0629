package myUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SELF �Զ��幤����
 * ��׼�����ݿ⹤����
 * @author ��
 */
public class DBUtil {
	public static String username = "root";
	public static String password = "root";
	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://127.0.0.1:3306/mywork?useUnicode=true&characterEncoding=utf8";
	
	static String sql = "insert into sys_user(uname,upassword) values ('����',325) ";
	
	public static Connection conn = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	
	// ��ɾ��
	public static int update() {
		int count = 0;
		try {
			Class.forName(driver);// ��������
			conn = DriverManager.getConnection(url,username,password);// ��������
			st = conn.createStatement();// ִ��SQL���
			count = st.executeUpdate(sql);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
		return count;
	}
	
	// ��ѯ
	public static ResultSet query() {
		
		try {
			Class.forName(driver);// ��������
			conn = DriverManager.getConnection(url,username,password);// ��������
			st = conn.createStatement();// ִ��SQL���
			rs = st.executeQuery(sql);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return rs;	
	}
	// �ر��ڲ���Դ
	public static void closeSource() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// �ر��ⲿ��Դ
	public static void closeSource(ResultSet rs, Statement st, Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DBUtil.sql = "select * from sys_user";
		
		ResultSet rSet = DBUtil.query();
		while(rSet.next()) {
			 System.out.println(rSet.getInt(1) + "\t" + rSet.getString(2));
		}
		// ���ݿ�Ĳ������
//		DBUtil.sql = "insert into sys_user(uname,upassword) values ('����2',325) ";
		
//		if(DBUtil.update()>0) {
//			System.out.println("��ӳɹ�");
//		} else {
//			System.out.println("���ʧ��");
//		}
		
		// �ر����ӣ��ر��ڲ����ӣ�
		DBUtil.closeSource();
		System.out.println(DBUtil.conn.isClosed());
	}
	*/
}
