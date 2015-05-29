package service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.CartEntity;
import Model.GoodEntity;
import Model.UserEntity;

public interface CartService {
	
	//向购物车添加商品
	public boolean isaddgood(GoodEntity good,CartEntity cart) throws SQLException;
	
	//查看购物车先从购物车表获取商品编号，再从商品表获取具体商品信息
	public ArrayList<CartEntity> cart(UserEntity user) throws SQLException;
	public ArrayList<GoodEntity> cartgood(GoodEntity good)throws SQLException;
	
	//删除一个购物车商品
	public boolean isdelonegood(CartEntity cart) throws SQLException;
	
	//清空购物车商品
	public boolean  isdelall(CartEntity cart) throws SQLException;

}
