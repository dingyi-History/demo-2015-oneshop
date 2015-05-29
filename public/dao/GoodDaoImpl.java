package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.GoodEntity;
import Model.TypeEntity;
import conndb.BaseDao;



public class GoodDaoImpl extends BaseDao implements GoodDao {
	
	String SQL=null;
	BaseDao baseDao=new BaseDao();

	//ɾ����ӦgoodId����Ʒ
	public int delgood(GoodEntity good) throws SQLException {
		SQL="SELECT *FROM shop_good where goodId=?";
		return baseDao.num(SQL, new String[]{good.getGoodId()});
	}

	//�޸���Ʒ��Ϣ
	public int upgood(GoodEntity good) throws SQLException {
		SQL="UPDATE  shop_good SET goodName=?  goodPrice=? goodNum=? WHERE goodId=?";
		return baseDao.num(SQL, new String[]{good.getGoodName(),good.getGoodPrice(),good.getGoodNum(),good.getGoodId()});
	}

	//��֤��Ʒ���Ƿ��ظ�
	public int ishavegood(GoodEntity good) throws SQLException {
		SQL="SELECT * FROM shop_good where goodName=?";
		return baseDao.num(SQL, new String[]{good.getGoodName()});
	}

	//�±�����Ʒ��Ҫ�ȴ��ڷ����ͼƬ
	public int newgood(GoodEntity good) throws SQLException {
		SQL="INSERT INTO shop_good(goodName,goodPrice,goodNum,typeId,imgurl) VALUES(?,?,?,?,?)";
		return baseDao.num(SQL, new String[]{good.getGoodName(),good.getGoodPrice(),good.getGoodNum(),good.getTypeId(),good.getImgurl()});
	}
	
	//������ƷID���Ҷ�Ӧ��Ʒ
	public ResultSet selgood(GoodEntity good) throws SQLException {
		SQL="SELECT *FROM shop_good where goodId=?";
		return baseDao.rs(SQL, new String[]{good.getGoodId()});
	}

		//��ѯ������Ʒ���ؽ����
	public ResultSet selallgood() throws SQLException {
		SQL="SELECT * FROM shop_good";
		return baseDao.rs(SQL, null);
	}

	//���ݷ��������Ʒ
	@Override
	public ResultSet seltypegood(TypeEntity type) throws SQLException {
		SQL="SELECT *FROM shop_good join shop_type ON shop_good.typeId=shop_type.typeId WHERE shop_good.typeId=?";
		return baseDao.rs(SQL, new String[]{type.getTypeId()});
	}

}

