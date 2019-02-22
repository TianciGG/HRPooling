package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.DutyMapper;
import com.iss.modal.Duty;
import com.iss.service.DutyServiceInterface;

@Service
public class DutyService implements DutyServiceInterface {
	@Autowired
	private DutyMapper dutyMapper;

	@Override
	public List<Duty> getAll() {
		List<Duty> dutyList = dutyMapper.selectAll();
		return dutyList;
	}

}
