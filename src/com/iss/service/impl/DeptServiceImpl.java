package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.DeptMapper;
import com.iss.modal.Dept;
import com.iss.service.DeptServiceInterface;

@Service
public class DeptServiceImpl implements DeptServiceInterface {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<Dept> getAll() {
		List<Dept> deptList = deptMapper.selectAll();
		return deptList;
	}

}
