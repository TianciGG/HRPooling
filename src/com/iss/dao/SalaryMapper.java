package com.iss.dao;

import java.util.List;

import com.iss.modal.Salary;
import com.iss.modal.SalaryWrapper;

public interface SalaryMapper {
	int deleteByPrimaryKey(Integer salaryid);

	int insert(Salary record);

	int insertSelective(Salary record);

	Salary selectByPrimaryKey(Integer salaryid);

	int updateByPrimaryKeySelective(Salary record);

	int updateByPrimaryKey(Salary record);

	List<SalaryWrapper> selectAll();
}