package conndb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//basedao封装了对数据库操作可以返回的两种值，一个是有具体数据集合的，一种是直接判断有没有成功操作的,这样可以节约很多冗余代码
public class BaseDao {
	Connection conn = null;
	PreparedStatement ps;

	// 返回值为结果集的数据库操作方法rs
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
				conn.rollback();// 数据库事务回滚
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return null;
	}

	// 不存在返回具体值的数据库操作，用int做返回值判断影响数据的的行数,即做增改删操作影响的行数
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
				conn.rollback();// 数据库事务回滚
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return -1;
	}

	// 关闭数据库连接
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