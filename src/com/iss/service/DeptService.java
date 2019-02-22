package com.iss.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iss.dao.DeptDAO;
import com.iss.modal.DeptInfo;

public class DeptService {
	DeptDAO deptDao = new DeptDAO();
	
	//处理业务逻辑

/*	public List<DeptInfo> GetDeptList() {
		List<DeptInfo> deptList = new ArrayList<DeptInfo>();
		
		for(int i=1;i<5;i++){
			DeptInfo dept = new DeptInfo();
			dept.setDeptId(i);
			dept.setDeptName("部门"+i);  
			deptList.add(dept);
		}
		return deptList;
	}*/
	
	//查询部门Table表数据
	public List<DeptInfo> queryDept(){
		List<DeptInfo> deptList = deptDao.queryDept();	
		return deptList;
		
	}
	
	//添加部门
	public Boolean addDept(DeptInfo deptInfo){
		Boolean flag = false;
		/*
		 * 写具体的业务逻辑，对于目前简单的业务只需调用dao层即可
		 */
		flag = deptDao.addDept(deptInfo);
		return flag;
	}
	
	//修改部门
	public Boolean updateDept(DeptInfo deptInfo){
		Boolean flag = false;
		flag = deptDao.updateDept(deptInfo);
		return flag;
	}
	
	//删除部门
	public Boolean removaDept(Integer deptId){
		Boolean flag = false;
		flag = deptDao.removeDept(deptId);
		return flag;
	}

}
