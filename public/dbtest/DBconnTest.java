package dbtest;

import java.sql.Connection;
import conndb.ConnectionFactory;

//���ݿ����Ӳ�����
public class DBconnTest {

	public static void main(String[] args) {
		ConnectionFactory cf = ConnectionFactory.getInstance();

		Connection conn = cf.makeConnection();

		if (conn != null)

		{
			System.out.println("���ӳɹ�");
		}

	}

}
