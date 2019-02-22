package com.iss.service;

import java.util.List;

import com.iss.dao.DicValueDAO;
import com.iss.modal.DicValueInfo;

public class DicValueService {
	private DicValueDAO dicValueDAO = new DicValueDAO();

	// 查询部门Table表数据
	public List<DicValueInfo> queryDicValue() {
		List<DicValueInfo> dicValueInfoList = dicValueDAO.queryDicValue();
		return dicValueInfoList;

	}

	// 添加部门信息
	public Boolean add(DicValueInfo dicValueInfo) {
		Boolean flag = false;
		flag = dicValueDAO.add(dicValueInfo);
		return flag;
	}

	// 删
	public Boolean delete(Integer id) {
		Boolean flag = false;
		flag = dicValueDAO.delete(id);
		return flag;
	}

	// 修改
	public Boolean update(DicValueInfo dicValueInfo) {
		Boolean flag = false;
		flag = dicValueDAO.update(dicValueInfo);
		return flag;
	}

}
