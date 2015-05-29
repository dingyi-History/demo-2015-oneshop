package service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.CartEntity;
import Model.GoodEntity;
import Model.UserEntity;

public interface CartService {
	
	//���ﳵ�����Ʒ
	public boolean isaddgood(GoodEntity good,CartEntity cart) throws SQLException;
	
	//�鿴���ﳵ�ȴӹ��ﳵ���ȡ��Ʒ��ţ��ٴ���Ʒ���ȡ������Ʒ��Ϣ
	public ArrayList<CartEntity> cart(UserEntity user) throws SQLException;
	public ArrayList<GoodEntity> cartgood(GoodEntity good)throws SQLException;
	
	//ɾ��һ�����ﳵ��Ʒ
	public boolean isdelonegood(CartEntity cart) throws SQLException;
	
	//��չ��ﳵ��Ʒ
	public boolean  isdelall(CartEntity cart) throws SQLException;

}
