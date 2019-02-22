package com.iss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iss.DBUtil.DBUtil;
import com.iss.modal.DicValueInfo;

public class DicValueDAO {
	private DBUtil dbUtil;

	public DicValueDAO() {
		dbUtil = new DBUtil();
	}

	// ��ѯ����Table������
	public List<DicValueInfo> queryDicValue() {

		List<DicValueInfo> dicValueInfoList = new ArrayList<DicValueInfo>();

		String sql = "select v.id,t.name,v.display,v.des from t_sysdictvalue v left join t_sysdictype t on v.typeid=t.id";

		ResultSet rs = dbUtil.query(sql);

		try {
			while (rs.next()) {
				DicValueInfo dicValueInfo = new DicValueInfo();

				dicValueInfo.setId(rs.getInt("id"));
				dicValueInfo.setName(rs.getString("name"));
				dicValueInfo.setDisplay(rs.getString("display"));
				dicValueInfo.setDes(rs.getString("des"));

				dicValueInfoList.add(dicValueInfo);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dicValueInfoList;
	}

	// ��
	public Boolean add(DicValueInfo dicValueInfo) {
		String sql = "insert into t_sysdictvalue(id,typeid,display,des)values(?,?,?,?)";
		int num = dbUtil.update(sql, dicValueInfo.getId(), dicValueInfo.getTypeid(), dicValueInfo.getDisplay(),
				dicValueInfo.getDes());

		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}

	// ɾ
	public Boolean delete(Integer id) {
		String sql = "delete from t_sysdictvalue where id=?";
		int num = dbUtil.update(sql, id);

		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}

	// ��
	public Boolean update(DicValueInfo dicValueInfo) {
		String sql = "update t_sysdictvalue set typeid=?,value=?,display=?,des=? where id=?";

		int num = dbUtil.update(sql, dicValueInfo.getTypeid(), dicValueInfo.getValue(), dicValueInfo.getDisplay(),
				dicValueInfo.getDes(), dicValueInfo.getId());

		if (num > 0) {
			return true;
		} else {
			return false;
		}

	}

}
