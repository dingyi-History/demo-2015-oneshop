package service;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.AdminEntity;

//����Աҵ������
public interface AdminService {
	
	//�鿴���й���Ա
	public ArrayList<AdminEntity> alladmin() throws SQLException;
	
	//��ӹ���Ա
	public boolean isaddadmin(AdminEntity admin) throws SQLException;
	
	//ɾ������Ա
	public boolean isdeladmin(AdminEntity admin) throws SQLException;
	
	
}
