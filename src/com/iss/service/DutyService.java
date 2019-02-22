package com.iss.service;

import java.util.List;

import com.iss.dao.DutyDAO;
import com.iss.modal.DutyInfo;

public class DutyService {

	DutyDAO dutyDao = new DutyDAO();

	// ��ѯ����Table������
	public List<DutyInfo> queryDuty() {
		List<DutyInfo> dutyList = dutyDao.queryDuty();
		return dutyList;

	}

	// ��Ӳ���
	public Boolean addDuty(DutyInfo dutyInfo) {
		Boolean flag = false;
		/*
		 * д�����ҵ���߼�������Ŀǰ�򵥵�ҵ��ֻ�����dao�㼴��
		 */
		flag = dutyDao.addDuty(dutyInfo);
		return flag;
	}

	// �޸Ĳ���
	public Boolean updateDuty(DutyInfo dutyInfo) {
		Boolean flag = false;
		flag = dutyDao.updateDuty(dutyInfo);
		return flag;
	}

	// ɾ������
	public Boolean removaDuty(Integer dutyId) {
		Boolean flag = false;
		flag = dutyDao.removeDuty(dutyId);
		return flag;
	}
}
