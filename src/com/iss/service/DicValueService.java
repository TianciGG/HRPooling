package com.iss.service;

import java.util.List;

import com.iss.dao.DicValueDAO;
import com.iss.modal.DicValueInfo;

public class DicValueService {
	private DicValueDAO dicValueDAO = new DicValueDAO();

	// ��ѯ����Table������
	public List<DicValueInfo> queryDicValue() {
		List<DicValueInfo> dicValueInfoList = dicValueDAO.queryDicValue();
		return dicValueInfoList;

	}

	// ��Ӳ�����Ϣ
	public Boolean add(DicValueInfo dicValueInfo) {
		Boolean flag = false;
		flag = dicValueDAO.add(dicValueInfo);
		return flag;
	}

	// ɾ
	public Boolean delete(Integer id) {
		Boolean flag = false;
		flag = dicValueDAO.delete(id);
		return flag;
	}

	// �޸�
	public Boolean update(DicValueInfo dicValueInfo) {
		Boolean flag = false;
		flag = dicValueDAO.update(dicValueInfo);
		return flag;
	}

}
