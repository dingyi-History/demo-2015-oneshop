package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.UserEntity;

public interface UserDao {
	
	public int adduser(UserEntity user)throws SQLException;
	
	public int upuser(UserEntity user)throws SQLException;
	
	public int deluser(UserEntity user)throws SQLException;
	
	public ResultSet seluser(UserEntity user)throws SQLException;
	
	public ResultSet selalluser()throws SQLException;
	
	public ResultSet seloneuser(UserEntity user) throws SQLException;


}

