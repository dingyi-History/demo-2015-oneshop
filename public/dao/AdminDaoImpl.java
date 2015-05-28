package dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import conndb.BaseDao;
import entity.AdminEntity;



//实现admindao接口的方法
public class AdminDaoImpl extends BaseDao implements AdminDao {

	String SQL = null;
	BaseDao baseDao = new BaseDao();

	// 查询对应管理员数据的方法(做登录用)
	public ResultSet seladmin(AdminEntity admin) throws SQLException {
		// 先来定义一句查询语句
		SQL = "SELECT * FROM shop_sys  WHERE sysName=? AND sysPwd = ?";
		return baseDao.rs(SQL,
				new String[] { admin.getSysName(), admin.getSysPwd() });
	}

	// 查询对应管理员数据的方法(做注册防用户名重叠用)，为保证用户名唯一性
	public ResultSet seladminexist(AdminEntity admin) throws SQLException {
		// 先来定义一句查询语句
		SQL = "SELECT * FROM shop_sys  WHERE sysName=?";
		return baseDao.rs(SQL, new String[]{admin.getSysName()});
	}

	// 添加管理员方法
	public int addadmin(AdminEntity admin) throws SQLException {
		SQL = "INSERT INTO shop_sys(sysName,sysPwd) VALUES (?,?)";
		return baseDao.num(SQL, new String[]{admin.getSysName(),admin.getSysPwd()});

	}

	// 删除管理员方法
	public int deladmin(AdminEntity admin) throws SQLException {
		 SQL = "DELETE FROM shop_sys WHERE sysName=?";
		return baseDao.num(SQL, new String[]{admin.getSysName()});

	}

	// 修改管理员密码
	public int upadmin(AdminEntity admin) throws SQLException {
		SQL = "UPDATE  shop_sys SET sysPwd=? WHERE sysName=?";
		return baseDao.num(SQL, new String[]{admin.getSysPwd(),admin.getSysName()});
	}

	// 查询所以管理员返回结果
	public ResultSet alladmin() throws SQLException {
		SQL="SELECT *FROM shop_sys";
		return baseDao.rs(SQL,null);
	}

}

