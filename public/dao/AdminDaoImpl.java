package dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import conndb.BaseDao;
import entity.AdminEntity;



//ʵ��admindao�ӿڵķ���
public class AdminDaoImpl extends BaseDao implements AdminDao {

	String SQL = null;
	BaseDao baseDao = new BaseDao();

	// ��ѯ��Ӧ����Ա���ݵķ���(����¼��)
	public ResultSet seladmin(AdminEntity admin) throws SQLException {
		// ��������һ���ѯ���
		SQL = "SELECT * FROM shop_sys  WHERE sysName=? AND sysPwd = ?";
		return baseDao.rs(SQL,
				new String[] { admin.getSysName(), admin.getSysPwd() });
	}

	// ��ѯ��Ӧ����Ա���ݵķ���(��ע����û����ص���)��Ϊ��֤�û���Ψһ��
	public ResultSet seladminexist(AdminEntity admin) throws SQLException {
		// ��������һ���ѯ���
		SQL = "SELECT * FROM shop_sys  WHERE sysName=?";
		return baseDao.rs(SQL, new String[]{admin.getSysName()});
	}

	// ��ӹ���Ա����
	public int addadmin(AdminEntity admin) throws SQLException {
		SQL = "INSERT INTO shop_sys(sysName,sysPwd) VALUES (?,?)";
		return baseDao.num(SQL, new String[]{admin.getSysName(),admin.getSysPwd()});

	}

	// ɾ������Ա����
	public int deladmin(AdminEntity admin) throws SQLException {
		 SQL = "DELETE FROM shop_sys WHERE sysName=?";
		return baseDao.num(SQL, new String[]{admin.getSysName()});

	}

	// �޸Ĺ���Ա����
	public int upadmin(AdminEntity admin) throws SQLException {
		SQL = "UPDATE  shop_sys SET sysPwd=? WHERE sysName=?";
		return baseDao.num(SQL, new String[]{admin.getSysPwd(),admin.getSysName()});
	}

	// ��ѯ���Թ���Ա���ؽ��
	public ResultSet alladmin() throws SQLException {
		SQL="SELECT *FROM shop_sys";
		return baseDao.rs(SQL,null);
	}

}

