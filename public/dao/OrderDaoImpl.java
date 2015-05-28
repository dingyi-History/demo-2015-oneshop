package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import conndb.BaseDao;
import entity.GoodEntity;
import entity.OrderEntity;
import entity.UserEntity;

public class OrderDaoImpl implements OrderDao {
	String sql =null;
	BaseDao basedao = new BaseDao();

	@Override
	public int addorder(UserEntity user, GoodEntity good, OrderEntity order)
			throws SQLException {
		sql="insert into shop_order(userId,goodId,orderGoodNum,orderDate,orderPrice,tel,relName,add) values(?,?,?,?,?,?,?,?)";
		return basedao.num(sql, new String[]{user.getUserId(),good.getGoodId(),order.getOrderGoodNum(),
				order.getOrderDate(),order.getOrderPrice(),order.getTel(),order.getRealName(),order.getAdd()});
	}

	@Override
	public ResultSet getorder(UserEntity user) throws SQLException {
		sql = "select * from shop_order where userId = ?";
		return basedao.rs(sql, new String[]{user.getUserId()});
	}

	@Override
	public int overorder(OrderEntity order)
			throws SQLException {
		sql = "UPDATE shop_order SET orderIsOver=?  WHERE orderId=?";
		return basedao.num(sql, new String[]{order.getOrderIsOver(),order.getOrderId()});
	}

	@Override
	public int delorder(OrderEntity order) throws SQLException {
		sql = "DELETE *from shop_order where orderId =?";
		return basedao.num(sql, new String[]{order.getOrderId()});
	}

	@Override
	public ResultSet allorderr() throws SQLException {
		sql="select *from shop_order";
		return basedao.rs(sql, null);
	}

}
