package myUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDbConnection {
	
	/**
	 * 获取数据库连接的对象
	 * @return conn
	 */
	public static Connection getConn() {
		Connection conn = null;
		
		String username = "root";
		String password = "root";
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/mywork?useUnicode=true&characterEncoding=utf8";
		
		// 加载驱动
		try {
			Class.forName(driverClassName);
			
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {// jdbc属于抽象工厂模式，不生成具体的类，这里引用java.sql驱动包，getConnection静态工厂里面的静态方法
			// 建立连接
			e.printStackTrace();
		} 
//		finally {
//			// 测试 若出现'No suitable driver found for jdbc:mysql:/127.0.0.1:3306/mywork'说明字符集写错了
//			// 清理工作：使用完需要关闭连接，再具体的方法中不需再写了
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
		
		if(conn!=null) {// 避免空指针异常
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
