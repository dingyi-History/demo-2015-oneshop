package service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.UserEntity;

//针对用户操作的接口类
public interface UserService {
	
//面向用户的方法	
	//是否添加成功
	public boolean isadd(UserEntity user)throws SQLException ;
	
	//是否登陆成功
	public boolean islogin(UserEntity user)throws SQLException ;
	
	
//面向管理员的方法
	//是否删除成功
	public boolean isdelete(UserEntity user)throws SQLException ;
	
	//查看所有用户
	public ArrayList<UserEntity> alluser() throws SQLException ;
	
	

}
