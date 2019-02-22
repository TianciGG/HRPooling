package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.EmployeeMapper;
import com.iss.modal.Employee;
import com.iss.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public Boolean save(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employeelist = employeeMapper.selectAll();
		return employeelist;
	}
}
