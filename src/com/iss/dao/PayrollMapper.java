package com.iss.dao;

import java.util.List;

import com.iss.modal.Payroll;
import com.iss.modal.PayrollWrapper;

public interface PayrollMapper {
	int deleteByPrimaryKey(Integer payrollid);

	int insert(Payroll record);

	int insertSelective(Payroll record);

	Payroll selectByPrimaryKey(Integer payrollid);

	int updateByPrimaryKeySelective(Payroll record);

	int updateByPrimaryKey(Payroll record);

	List<PayrollWrapper> selectAll();
}