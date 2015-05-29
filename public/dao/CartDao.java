package dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CartEntity;
import Model.GoodEntity;
import Model.UserEntity;

public interface CartDao {
	
	//��ָ���û��Ĺ��ﳵ�����Ʒ����Ʒ����
	public  int addcartgood(UserEntity user,GoodEntity good,CartEntity cart)throws SQLException;
	
	//��ȡ���ݿ��еĹ��ﳵ������
	public ResultSet getcart(UserEntity user)throws SQLException;
	
	//���¹��ﳵ�о�����Ʒ����
	public int updatecart(UserEntity user,GoodEntity good,CartEntity cart)throws SQLException;

	//��ն�Ӧ���ݿ��й��ﳵ������
	public int delall(UserEntity user)throws SQLException;
	
	//ɾ�����ﳵ��һ����Ʒ
	public int delonegood(UserEntity user,GoodEntity good)throws SQLException;
}

