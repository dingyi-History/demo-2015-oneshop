package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.UserDao;
import dao.UserDaoImpl;
import Model.UserEntity;

public class UserServiceImpl  implements UserService{
	
	UserDao userdao = new UserDaoImpl();
	ResultSet rs = null;
	int i = 0;
	
	@Override
	public boolean isadd(UserEntity user) throws SQLException {
		if(ishave(user))
		{
			i = userdao.adduser(user);
			if(i>0)
			{
			return true;
			}
		}
		return false;
	}

	@Override
	public boolean islogin(UserEntity user) throws SQLException {
		rs = userdao.seluser(user);
		if(rs.next())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isdelete(UserEntity user) throws SQLException {
		i = userdao.deluser(user);
		if(i>0)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public ArrayList<UserEntity> alluser() throws SQLException {
		rs = userdao.selalluser();
		UserEntity user = new UserEntity();
		ArrayList<UserEntity> userlist = new ArrayList<UserEntity>();
		while(rs.next())
		{
			user.setUserId(rs.getString("userId"));
			user.setUserName(rs.getString("userName"));
			user.setUserPwd(rs.getString("userPwd"));
			userlist.add(user);
		}
		return userlist;
	}
	

	//是否存在相同用户名
	public boolean ishave(UserEntity user) throws SQLException
	{
		rs = userdao.seloneuser(user);
		if(!rs.next())
		{
			return true;
		}
		return false;
	}
}
