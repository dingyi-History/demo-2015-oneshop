package service;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.AdminEntity;

//管理员业务处理类
public interface AdminService {
	
	//查看所有管理员
	public ArrayList<AdminEntity> alladmin() throws SQLException;
	
	//添加管理员
	public boolean isaddadmin(AdminEntity admin) throws SQLException;
	
	//删除管理员
	public boolean isdeladmin(AdminEntity admin) throws SQLException;
	
	
}
