package com.iss.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iss.dao.DeptDAO;
import com.iss.modal.DeptInfo;

public class DeptService {
	DeptDAO deptDao = new DeptDAO();
	
	//����ҵ���߼�

/*	public List<DeptInfo> GetDeptList() {
		List<DeptInfo> deptList = new ArrayList<DeptInfo>();
		
		for(int i=1;i<5;i++){
			DeptInfo dept = new DeptInfo();
			dept.setDeptId(i);
			dept.setDeptName("����"+i);  
			deptList.add(dept);
		}
		return deptList;
	}*/
	
	//��ѯ����Table������
	public List<DeptInfo> queryDept(){
		List<DeptInfo> deptList = deptDao.queryDept();	
		return deptList;
		
	}
	
	//��Ӳ���
	public Boolean addDept(DeptInfo deptInfo){
		Boolean flag = false;
		/*
		 * д�����ҵ���߼�������Ŀǰ�򵥵�ҵ��ֻ�����dao�㼴��
		 */
		flag = deptDao.addDept(deptInfo);
		return flag;
	}
	
	//�޸Ĳ���
	public Boolean updateDept(DeptInfo deptInfo){
		Boolean flag = false;
		flag = deptDao.updateDept(deptInfo);
		return flag;
	}
	
	//ɾ������
	public Boolean removaDept(Integer deptId){
		Boolean flag = false;
		flag = deptDao.removeDept(deptId);
		return flag;
	}

}
