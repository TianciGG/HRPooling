package com.iss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iss.DBUtil.DBUtil;
import com.iss.modal.DeptInfo;
import com.iss.modal.DicTypeInfo;

public class DicTypeDAO {
	private DBUtil dbUtil = new DBUtil();
	
	//查询数据字典类型Table表
	public List<DicTypeInfo> queryDicType() {

		List<DicTypeInfo> dicTypeList = new ArrayList<DicTypeInfo>();
		
		String sql = "select * from t_sysdictype";

		ResultSet rs = dbUtil.query(sql);

		try {
			while (rs.next()) {
				DicTypeInfo dicTypeInfo = new  DicTypeInfo();
				dicTypeInfo.setId(rs.getInt("id"));
				dicTypeInfo.setName(rs.getString("name"));
				dicTypeInfo.setDes(rs.getString("des"));
			    
				dicTypeList.add(dicTypeInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dicTypeList;
	}
	
	//添加数据字典类型
	public Boolean addDicType(DicTypeInfo dicTypeInfo){
		String sql = "insert into t_sysdictype(name,des) values(?,?)";
		int num = dbUtil.update(sql, dicTypeInfo.getName(),dicTypeInfo.getDes());
		if(num>0){
			return true;
		}else{
			return false;
		}
	}
	

	
	//修改数据字典类型
	public Boolean updateDicType(DicTypeInfo dicTypeInfo){
		String sql = "update t_sysdictype set name=?,des=? where id=?";
		int num = dbUtil.update(sql, dicTypeInfo.getName(),dicTypeInfo.getDes(),dicTypeInfo.getId());
		if(num>0){
			return true;
		}else{
			return false;
		}	
	}
	
	//删除部门	
			public Boolean removeDept(Integer id){
				String sql = "delete from t_sysdictype where id=?";
				int numr = dbUtil.update(sql,id);
				if(numr>0){
					return true;
				}else{
					return false;
				}
			}
}
