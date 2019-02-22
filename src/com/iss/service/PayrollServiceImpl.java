package com.iss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.PayrollMapper;
import com.iss.modal.Payroll;
import com.iss.modal.PayrollWrapper;

@Service
public class PayrollServiceImpl implements PayrollSevice {
	@Autowired
	private PayrollMapper payrollMapper;

	@Override
	public Boolean save(Payroll payroll) {
		Boolean flag = false;
		int num = payrollMapper.insert(payroll);
		if (num > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Boolean update(Payroll payroll) {
		Boolean flag = false;
		int num = payrollMapper.updateByPrimaryKey(payroll);
		if (num > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Boolean delete(Integer payrollid) {
		Boolean flag = false;
		int num = payrollMapper.deleteByPrimaryKey(payrollid);
		if (num > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<PayrollWrapper> getAll() {
		List<PayrollWrapper> payrollList = payrollMapper.selectAll();
		return payrollList;
	}

}
