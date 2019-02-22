package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.SysDicValueDAO;
import com.iss.modal.SysDicValue;
import com.iss.service.SysDicValueService;

@Service
public class SysDicValueServiceImpl implements SysDicValueService {
	@Autowired
	private SysDicValueDAO sysDicValueDAO;

	@Override
	public List<SysDicValue> selectDegreeMenu() {
		List<SysDicValue> listDicValue = sysDicValueDAO.selectDegreeMenu();
		return listDicValue;
	}

	@Override
	public Boolean save(SysDicValue sysDicValue) {

		Boolean flag = false;

		int num = sysDicValueDAO.insert(sysDicValue);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	// @Override
	// public List<SysDicValue> selectDegreePage(SysDicValue queryDegree) {
	// // TODO Auto-generated method stub
	// return sysDicValueDAO.selectDegreePage(queryDegree);
	// }

}
