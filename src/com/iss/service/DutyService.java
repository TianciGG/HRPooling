package com.iss.service;

import java.util.List;

import com.iss.dao.DutyDAO;
import com.iss.modal.DutyInfo;

public class DutyService {

	DutyDAO dutyDao = new DutyDAO();

	// 查询部门Table表数据
	public List<DutyInfo> queryDuty() {
		List<DutyInfo> dutyList = dutyDao.queryDuty();
		return dutyList;

	}

	// 添加部门
	public Boolean addDuty(DutyInfo dutyInfo) {
		Boolean flag = false;
		/*
		 * 写具体的业务逻辑，对于目前简单的业务只需调用dao层即可
		 */
		flag = dutyDao.addDuty(dutyInfo);
		return flag;
	}

	// 修改部门
	public Boolean updateDuty(DutyInfo dutyInfo) {
		Boolean flag = false;
		flag = dutyDao.updateDuty(dutyInfo);
		return flag;
	}

	// 删除部门
	public Boolean removaDuty(Integer dutyId) {
		Boolean flag = false;
		flag = dutyDao.removeDuty(dutyId);
		return flag;
	}
}
