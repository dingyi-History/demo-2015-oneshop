package dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.AdminEntity;

//����Ա���ݿ�ӿ�
public interface AdminDao {
	
	//��ѯ��Ӧ���ݿ����ӣ���Ӧʵ�������Ľ����
	public ResultSet seladmin(AdminEntity admin) throws SQLException;
	
	//��ѯ��Ӧ���ݿ����ӣ���Ӧʵ�������Ľ����
	public ResultSet seladminexist(AdminEntity admin) throws SQLException;
	
	//��ӹ���Ա
	public int addadmin(AdminEntity admin)throws SQLException;
	
	//ɾ����Ӧ����Ա
	public int deladmin(AdminEntity admin)throws SQLException;
	
	//�����޸Ķ�Ӧ����Ա
	public int upadmin(AdminEntity admin)throws SQLException;
	
	//�鿴���й���Ա
	public ResultSet alladmin()throws SQLException;
	
}
