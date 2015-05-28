package conndb;

import java.sql.Connection;
import java.sql.DriverManager;

//数据库连接工厂，封装数据库从读取配置文件到连接方法
public class ConnectionFactory {

	private static final ConnectionFactory factory = new ConnectionFactory();

	Connection conn;

	private ConnectionFactory() {
	}

	public static ConnectionFactory getInstance() {
		return factory;
	}

	// 数据库连接方法
	public Connection makeConnection() {
		ReadProperties rp = ReadProperties.instance();//获取了配置文件数据
		try {
			Class.forName(rp.getDbdriver());
			conn = DriverManager.getConnection(rp.getDburl(),
					rp.getUsername(), rp.getUserpwd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}