package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import conndb.BaseDao;
import entity.TypeEntity;


public class TypeDaoImpl implements TypeDao {

	String sql = null;
	BaseDao basedao = new BaseDao();
	public ResultSet selalltype() throws SQLException {
		sql="SELECT *FROM shop_type";
		return basedao.rs(sql, null);
	}

	public int addtype(TypeEntity type) throws SQLException {
		sql="INSERT INTO shop_type(typeName) VALUES(?)";
		return basedao.num(sql, new String[]{type.getTypeName()});
	}

	public int deltype(TypeEntity type) throws SQLException {
		sql="DELETE FROM shop_type WHERE typeName=? ";
		return basedao.num(sql, new String[]{type.getTypeName()});
	}

	public int uptype(TypeEntity type) throws SQLException {
		sql="UPDATE shop_type SET typeName=?  WHERE typeId=?;";
		return basedao.num(sql, new String[]{type.getTypeName(),type.getTypeId()});
	}

}

