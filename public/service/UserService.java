package service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.UserEntity;

//����û������Ľӿ���
public interface UserService {
	
//�����û��ķ���	
	//�Ƿ���ӳɹ�
	public boolean isadd(UserEntity user)throws SQLException ;
	
	//�Ƿ��½�ɹ�
	public boolean islogin(UserEntity user)throws SQLException ;
	
	
//�������Ա�ķ���
	//�Ƿ�ɾ���ɹ�
	public boolean isdelete(UserEntity user)throws SQLException ;
	
	//�鿴�����û�
	public ArrayList<UserEntity> alluser() throws SQLException ;
	
	

}
