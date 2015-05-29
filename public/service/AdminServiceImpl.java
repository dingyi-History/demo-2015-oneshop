package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.AdminDao;
import dao.AdminDaoImpl;
import Model.AdminEntity;

public class AdminServiceImpl implements AdminService{

	ResultSet rs = null;
	int i =0;
	AdminDao admindao = new AdminDaoImpl();
	
	
	@Override
	public ArrayList<AdminEntity> alladmin() throws SQLException {
		ArrayList<AdminEntity> adminlist = new ArrayList<AdminEntity>();
		rs = admindao.alladmin();
		AdminEntity admin = new AdminEntity();
		while(rs.next())
		{
			admin.setSysName(rs.getString("sysName"));
			admin.setSysPwd(rs.getString("sysPwd"));
			adminlist.add(admin);
		}
		return adminlist;
	}
	
	
	@Override
	public boolean isaddadmin(AdminEntity admin) throws SQLException {
		boolean bool =ishaveadmin(admin);
		if(!bool){
		i = admindao.addadmin(admin);
		if(i>0)
		{
			return true;
		}
		}
		return false;
	}
	
	@Override
	public boolean isdeladmin(AdminEntity admin) throws SQLException {
		i = admindao.deladmin(admin);
		if(i>0)
		{
			return true;
		}
		return false;
	}
	
	public boolean ishaveadmin(AdminEntity admin) throws SQLException
	{
		int a = admindao.seladminexist(admin);
		if(a>0)
		{
			return true;
		}
		return false;
	}

}
