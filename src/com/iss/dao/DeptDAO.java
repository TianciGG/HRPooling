package com.iss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iss.DBUtil.DBUtil;
import com.iss.modal.DeptInfo;

public class DeptDAO {
	private DBUtil dbUtil = null;

	public DeptDAO() {
		dbUtil = new DBUtil();
	}

	// 添加部门
	public Boolean addDept(DeptInfo deptInfo) {
		String sql = "Insert into t_dept(deptNO,deptName,dpPhone,dpProfile,superId) values(?,?,?,?,?)";
		int num = dbUtil.update(sql,deptInfo.getDeptNO(), deptInfo.getDeptName(), deptInfo.getDpPhone(),deptInfo.getDpProfile(), deptInfo.getSuperId());

		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}
    //查询部门Table表数据
	public List<DeptInfo> queryDept() {

		List<DeptInfo> deptInfoList = new ArrayList<DeptInfo>();
		
		String sql = "select d.*,s.deptName as superDeptName from t_dept d left join t_dept s on d.superId = s.deptId";

		ResultSet rs = dbUtil.query(sql);

		try {
			while (rs.next()) {
				DeptInfo deptInfo = new  DeptInfo();
			    deptInfo.setDeptId(rs.getInt("deptId"));
			    deptInfo.setDeptName(rs.getString("deptName"));
			    deptInfo.setDeptNO(rs.getString("deptNO"));
			    deptInfo.setDpPhone(rs.getString("dpPhone"));
			    deptInfo.setDpProfile(rs.getString("dpProfile"));
			    deptInfo.setSuperDeptName(rs.getString("superDeptName"));
			    
			    deptInfoList.add(deptInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptInfoList;
	}
	
	
	
	//修改部门
		public Boolean updateDept(DeptInfo deptInfo){
			String sql = "update t_dept set deptNO=?,deptName=?,dpPhone=?,dpProfile=?,superId=? where deptId=?";
			int numb = dbUtil.update(sql, deptInfo.getDeptNO(),deptInfo.getDeptName(),deptInfo.getDpPhone(),deptInfo.getDpProfile(),deptInfo.getSuperId(),deptInfo.getDeptId());
			if(numb>0){
				return true;
			}else{
				return false;
			}
		}
	//删除部门	
		public Boolean removeDept(Integer deptId){
			String sql = "delete from t_dept where deptId=?";
			int numr = dbUtil.update(sql,deptId);
			if(numr>0){
				return true;
			}else{
				return false;
			}
		}

}

