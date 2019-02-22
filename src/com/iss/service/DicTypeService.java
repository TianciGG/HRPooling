package com.iss.service;

import java.util.List;

import com.iss.dao.DicTypeDAO;
import com.iss.modal.DeptInfo;
import com.iss.modal.DicTypeInfo;

public class DicTypeService {
	private DicTypeDAO dicTypeDao = new DicTypeDAO();

	
	//��ѯ�����ֵ�����
	public List<DicTypeInfo> queryDicType(){
		List<DicTypeInfo> dicTypeList = dicTypeDao.queryDicType();	
		return dicTypeList;
	}
	
	//��������ֵ�����
	public Boolean addDicType(DicTypeInfo dicTypeInfo){
		Boolean falg = false;
		falg = dicTypeDao.addDicType(dicTypeInfo);
		return falg;
	}
	

	//�޸������ֵ�����
	public Boolean updateDicType(DicTypeInfo dicTypeInfo){
		Boolean falg = false;
		falg = dicTypeDao.updateDicType(dicTypeInfo);
		return falg;
	}
	
	//ɾ�������ֵ�����
		public Boolean removaDept(Integer id){
			Boolean flag = false;
			flag = dicTypeDao.removeDept(id);
			return flag;
		}


}
