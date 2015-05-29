package dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CartEntity;
import Model.GoodEntity;
import Model.UserEntity;

public interface CartDao {
	
	//给指定用户的购物车添加商品，商品数量
	public  int addcartgood(UserEntity user,GoodEntity good,CartEntity cart)throws SQLException;
	
	//获取数据库中的购物车表内容
	public ResultSet getcart(UserEntity user)throws SQLException;
	
	//更新购物车中具体商品数量
	public int updatecart(UserEntity user,GoodEntity good,CartEntity cart)throws SQLException;

	//清空对应数据库中购物车表内容
	public int delall(UserEntity user)throws SQLException;
	
	//删除购物车中一个商品
	public int delonegood(UserEntity user,GoodEntity good)throws SQLException;
}

