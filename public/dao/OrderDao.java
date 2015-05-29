package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.GoodEntity;
import Model.OrderEntity;
import Model.UserEntity;

public interface OrderDao {
	
	//��Ӷ���
	public int addorder(UserEntity user,GoodEntity good,OrderEntity order) throws SQLException;
	
	//��ѯ����
	public ResultSet getorder(UserEntity user) throws SQLException;
	
	//�������
	public int overorder(OrderEntity order) throws SQLException;
	
	//ɾ������
	public int delorder(OrderEntity order) throws SQLException;
	
	//�鿴���ж���
	public ResultSet allorderr() throws SQLException;

}
