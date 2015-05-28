package dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.AdminEntity;

//管理员数据库接口
public interface AdminDao {
	
	//查询对应数据库连接，对应实体类对象的结果集
	public ResultSet seladmin(AdminEntity admin) throws SQLException;
	
	//查询对应数据库连接，对应实体类对象的结果集
	public ResultSet seladminexist(AdminEntity admin) throws SQLException;
	
	//添加管理员
	public int addadmin(AdminEntity admin)throws SQLException;
	
	//删除对应管理员
	public int deladmin(AdminEntity admin)throws SQLException;
	
	//更新修改对应管理员
	public int upadmin(AdminEntity admin)throws SQLException;
	
	//查看所有管理员
	public ResultSet alladmin()throws SQLException;
	
}
