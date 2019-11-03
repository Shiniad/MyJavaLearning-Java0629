package myUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SELF 自定义工具类
 * 标准的数据库工具类
 * @author 宏
 */
public class DBUtil {
	public static String username = "root";
	public static String password = "root";
	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://127.0.0.1:3306/mywork?useUnicode=true&characterEncoding=utf8";
	
	static String sql = "insert into sys_user(uname,upassword) values ('测试',325) ";
	
	public static Connection conn = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	
	// 增删改
	public static int update() {
		int count = 0;
		try {
			Class.forName(driver);// 加载驱动
			conn = DriverManager.getConnection(url,username,password);// 创建连接
			st = conn.createStatement();// 执行SQL语句
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
	
	// 查询
	public static ResultSet query() {
		
		try {
			Class.forName(driver);// 加载驱动
			conn = DriverManager.getConnection(url,username,password);// 创建连接
			st = conn.createStatement();// 执行SQL语句
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
	// 关闭内部资源
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
	
	// 关闭外部资源
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
		// 数据库的插入操作
//		DBUtil.sql = "insert into sys_user(uname,upassword) values ('测试2',325) ";
		
//		if(DBUtil.update()>0) {
//			System.out.println("添加成功");
//		} else {
//			System.out.println("添加失败");
//		}
		
		// 关闭连接（关闭内部连接）
		DBUtil.closeSource();
		System.out.println(DBUtil.conn.isClosed());
	}
	*/
}
