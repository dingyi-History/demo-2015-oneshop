package dbtest;

import java.sql.Connection;
import conndb.ConnectionFactory;

//数据库连接测试类
public class DBconnTest {

	public static void main(String[] args) {
		ConnectionFactory cf = ConnectionFactory.getInstance();

		Connection conn = cf.makeConnection();

		if (conn != null)

		{
			System.out.println("连接成功");
		}

	}

}
