package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.CartDao;
import dao.CartDaoImpl;
import dao.GoodDao;
import dao.GoodDaoImpl;
import Model.CartEntity;
import Model.GoodEntity;
import Model.UserEntity;

public class CartServiceImpl implements CartService{

	GoodDao gooddao = new GoodDaoImpl();
	CartDao cartdao = new CartDaoImpl();
	int i =0;
	ResultSet rs=null;
	@Override
	public boolean isaddgood(GoodEntity good, CartEntity cart)
			throws SQLException {
		i = gooddao.ishavegood(good);
		if(i==0)
		{
			int a = gooddao.newgood(good);
			if(a>0)
			{
			return true;
		}
		}
		return false;
	}

	@Override
	public ArrayList<CartEntity> cart(UserEntity user) throws SQLException {
		rs = cartdao.getcart(user);
		ArrayList<CartEntity> cartlist = new ArrayList<CartEntity>();
		CartEntity cart = new CartEntity();
		while(rs.next())
		{
			cart.setCartId(rs.getString("cartId"));
			cart.setGoodId(rs.getString("goodId"));
			cart.setUserId(rs.getString("userId"));
			cart.setCartGoodNum(rs.getString("cartGoodNum"));
			cartlist.add(cart);
		}
		return cartlist;
	}

	@Override
	public ArrayList<GoodEntity> cartgood(GoodEntity good) throws SQLException {

		return null;
	}

	@Override
	public boolean isdelonegood(CartEntity cart) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isdelall(CartEntity cart) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	

}
