package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.GoodEntity;
import Model.TypeEntity;
import conndb.BaseDao;



public class GoodDaoImpl extends BaseDao implements GoodDao {
	
	String SQL=null;
	BaseDao baseDao=new BaseDao();

	//删除对应goodId的商品
	public int delgood(GoodEntity good) throws SQLException {
		SQL="SELECT *FROM shop_good where goodId=?";
		return baseDao.num(SQL, new String[]{good.getGoodId()});
	}

	//修改商品信息
	public int upgood(GoodEntity good) throws SQLException {
		SQL="UPDATE  shop_good SET goodName=?  goodPrice=? goodNum=? WHERE goodId=?";
		return baseDao.num(SQL, new String[]{good.getGoodName(),good.getGoodPrice(),good.getGoodNum(),good.getGoodId()});
	}

	//验证商品名是否重复
	public int ishavegood(GoodEntity good) throws SQLException {
		SQL="SELECT * FROM shop_good where goodName=?";
		return baseDao.num(SQL, new String[]{good.getGoodName()});
	}

	//新保存商品需要先存在分类和图片
	public int newgood(GoodEntity good) throws SQLException {
		SQL="INSERT INTO shop_good(goodName,goodPrice,goodNum,typeId,imgurl) VALUES(?,?,?,?,?)";
		return baseDao.num(SQL, new String[]{good.getGoodName(),good.getGoodPrice(),good.getGoodNum(),good.getTypeId(),good.getImgurl()});
	}
	
	//根据商品ID查找对应商品
	public ResultSet selgood(GoodEntity good) throws SQLException {
		SQL="SELECT *FROM shop_good where goodId=?";
		return baseDao.rs(SQL, new String[]{good.getGoodId()});
	}

		//查询所有商品返回结果集
	public ResultSet selallgood() throws SQLException {
		SQL="SELECT * FROM shop_good";
		return baseDao.rs(SQL, null);
	}

	//根据分类查找商品
	@Override
	public ResultSet seltypegood(TypeEntity type) throws SQLException {
		SQL="SELECT *FROM shop_good join shop_type ON shop_good.typeId=shop_type.typeId WHERE shop_good.typeId=?";
		return baseDao.rs(SQL, new String[]{type.getTypeId()});
	}

}

