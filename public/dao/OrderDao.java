package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.GoodEntity;
import entity.OrderEntity;
import entity.UserEntity;

public interface OrderDao {
	
	//添加订单
	public int addorder(UserEntity user,GoodEntity good,OrderEntity order) throws SQLException;
	
	//查询订单
	public ResultSet getorder(UserEntity user) throws SQLException;
	
	//订单完成
	public int overorder(OrderEntity order) throws SQLException;
	
	//删除订单
	public int delorder(OrderEntity order) throws SQLException;
	
	//查看所有订单
	public ResultSet allorderr() throws SQLException;

}
