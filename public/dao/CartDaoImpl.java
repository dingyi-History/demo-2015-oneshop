package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import conndb.BaseDao;
import entity.CartEntity;
import entity.GoodEntity;
import entity.UserEntity;

public class CartDaoImpl implements CartDao {

	
	String sql = null;
	BaseDao basedao = new BaseDao();
	//��ѯ��Ӧ�û�ID�Ĺ��ﳵ
	public ResultSet getcart(UserEntity user)
			throws SQLException {
		sql = "select * from shop_cart  join shop_good ON shop_cart.goodId=shop_good.goodId WHERE shop_cart.userId=?";
		return basedao.rs(sql, new String[]{user.getUserId()});
	}

	//������Ʒ����
	public int updatecart(UserEntity user,GoodEntity good,CartEntity cart)
			throws SQLException {
		sql="UPDATE shop_cart SET  cartGoodNum = ? WHERE userId=? AND goodId=?";
				return basedao.num(sql, new String[]{cart.getCartGoodNum(),user.getUserId(),good.getGoodId()});

	}
	
	//ɾ�����ﳵ��һ����Ʒ
	public int delonegood(UserEntity user,GoodEntity good)
	{
		sql="DELETE shop_user WHERE userId=? AND goodId=?";
		return basedao.num(sql,new String[]{user.getUserId(),good.getGoodId()});
	}
	
	//��չ��ﳵ
	public int delall(UserEntity user) {
		sql = "DELETE FROM shop_cart WHERE userId = ?";
		return basedao.num(sql, new String[]{user.getUserId()});

	}

	//�����Ʒ
	@Override
	public int addcartgood(UserEntity user, GoodEntity good,CartEntity cart)
			throws SQLException {
		sql="INSERT INTO shop_cart(userId,goodId,cartGoodNum) VALUES(?,?,?)";
		return basedao.num(sql, new String[]{user.getUserId(),good.getGoodId(),cart.getCartGoodNum()});
	}

	

}

