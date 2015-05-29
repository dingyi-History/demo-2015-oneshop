package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.UserEntity;
import conndb.BaseDao;

public class UserDaoImpl implements UserDao {

	String sql=null;
	BaseDao basedao = new BaseDao();
	
	public int adduser(UserEntity user) throws SQLException {
		sql="INSERT INTO shop_user(userName,userPwd) VALUES(?,?,?)";
		return basedao.num(sql, new String[]{user.getUserName(),user.getUserPwd()});
	}

	public int upuser(UserEntity user) throws SQLException {
		sql="UPDATE shop_user SET userName=?,userPwd=? WHERE userId=?";
		return basedao.num(sql, new String[]{user.getUserName(),user.getUserPwd(),user.getUserId()});
	}

	public int deluser(UserEntity user) throws SQLException {
		sql="DELETE FROM shop_user WHERE userId=?";
		return basedao.num(sql, new String[]{user.getUserId()});
	}

	//��ѯ���ݿ��ж�Ӧ���û��������룬���ز�ѯ�����
		public ResultSet seluser(UserEntity user) throws SQLException {
			sql = "SELECT * FROM shop_user WHERE userName=? AND userPwd = ?";
			return basedao.rs(sql, new String[]{user.getUserName(),user.getUserPwd()});
			//���ز�ѯ�����
		}

	
	public ResultSet selalluser() throws SQLException {
		sql="SELECT *FROM shop_user";
		return basedao.rs(sql, null);
	}

	public ResultSet seloneuser(UserEntity user) throws SQLException {
		sql="SELECT *FROM shop_user WHERE userName=?";
		return basedao.rs(sql,new String[]{user.getUserName()});
	}
	//�ж��û���Ψһ��
	
}

