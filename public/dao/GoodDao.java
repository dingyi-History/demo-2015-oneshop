package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.GoodEntity;
import Model.TypeEntity;

public interface  GoodDao {
	
	public int delgood(GoodEntity good)throws SQLException;
	
	public int upgood(GoodEntity good)throws SQLException;
	
	public int ishavegood(GoodEntity good)throws SQLException;
	
	public int newgood(GoodEntity good)throws SQLException;
	
	public ResultSet selgood(GoodEntity good)throws SQLException;
	
	public ResultSet selallgood()throws SQLException;
	
	//商品分类查询
	public ResultSet seltypegood(TypeEntity type)throws SQLException;
}

