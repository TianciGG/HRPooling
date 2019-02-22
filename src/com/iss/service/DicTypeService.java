package com.iss.service;

import java.util.List;

import com.iss.dao.DicTypeDAO;
import com.iss.modal.DeptInfo;
import com.iss.modal.DicTypeInfo;

public class DicTypeService {
	private DicTypeDAO dicTypeDao = new DicTypeDAO();

	
	//查询数据字典类型
	public List<DicTypeInfo> queryDicType(){
		List<DicTypeInfo> dicTypeList = dicTypeDao.queryDicType();	
		return dicTypeList;
	}
	
	//添加数据字典类型
	public Boolean addDicType(DicTypeInfo dicTypeInfo){
		Boolean falg = false;
		falg = dicTypeDao.addDicType(dicTypeInfo);
		return falg;
	}
	

	//修改数据字典类型
	public Boolean updateDicType(DicTypeInfo dicTypeInfo){
		Boolean falg = false;
		falg = dicTypeDao.updateDicType(dicTypeInfo);
		return falg;
	}
	
	//删除数据字典类型
		public Boolean removaDept(Integer id){
			Boolean flag = false;
			flag = dicTypeDao.removeDept(id);
			return flag;
		}


}
