package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.TypeEntity;

public interface TypeDao {

	//�鿴���з���
	public ResultSet selalltype()throws SQLException;
	
	public int addtype(TypeEntity type)throws SQLException;
	
	public int deltype(TypeEntity type)throws SQLException;
	
	public int uptype(TypeEntity type)throws SQLException;
}
