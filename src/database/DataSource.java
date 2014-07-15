package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");// 加载驱动程序
		// 建立于数据库的连接
		String url = "jdbc:mysql://localhost:3306/xsgl";
		String user = "root";
		String password = "123";
		Connection cn = DriverManager.getConnection(url, user, password);
		return cn;
	}

}
