package com.iss.dao;

import java.util.List;

import com.iss.modal.Employee;

public interface EmployeeMapper {
	int deleteByPrimaryKey(Integer empid);

	int insert(Employee record);

	int insertSelective(Employee record);

	Employee selectByPrimaryKey(Integer empid);

	int updateByPrimaryKeySelective(Employee record);

	int updateByPrimaryKey(Employee record);

	List<Employee> selectAll();
}