package conndb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//basedao��װ�˶����ݿ�������Է��ص�����ֵ��һ�����о������ݼ��ϵģ�һ����ֱ���ж���û�гɹ�������,�������Խ�Լ�ܶ��������
public class BaseDao {
	Connection conn = null;
	PreparedStatement ps;

	// ����ֵΪ����������ݿ��������rs
	public ResultSet rs(String sql, String[] param) {

		conn = ConnectionFactory.getInstance().makeConnection();
		try {
			if (conn == null) {
				throw new SQLException("conn is null");
			}
			ps = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					ps.setString(i + 1, param[i]);
				}
			}
			return ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();

			try {
				conn.rollback();// ���ݿ�����ع�
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return null;
	}

	// �����ڷ��ؾ���ֵ�����ݿ��������int������ֵ�ж�Ӱ�����ݵĵ�����,��������ɾ����Ӱ�������
	public int num(String sql, String[] param) {

		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			if (conn == null) {
				throw new SQLException("conn is null");
			}
			ps = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					ps.setString(i + 1, param[i]);
				}
			}
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

			try {
				conn.rollback();// ���ݿ�����ع�
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return -1;
	}

	// �ر����ݿ�����
	public void closeall() {
		try {
			if (ps != null) {
				ps.close();
				ps = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}