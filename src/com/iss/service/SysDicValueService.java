package com.iss.service;

import java.util.List;

import com.iss.modal.SysDicValue;

public interface SysDicValueService {

	public List<SysDicValue> selectDegreeMenu();

	public Boolean save(SysDicValue sysDicValue);

	// List<SysDicValue> selectDegreePage(SysDicValue queryDegree);

}
