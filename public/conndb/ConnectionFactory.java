package conndb;

import java.sql.Connection;
import java.sql.DriverManager;

//���ݿ����ӹ�������װ���ݿ�Ӷ�ȡ�����ļ������ӷ���
public class ConnectionFactory {

	private static final ConnectionFactory factory = new ConnectionFactory();

	Connection conn;

	private ConnectionFactory() {
	}

	public static ConnectionFactory getInstance() {
		return factory;
	}

	// ���ݿ����ӷ���
	public Connection makeConnection() {
		ReadProperties rp = ReadProperties.instance();//��ȡ�������ļ�����
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