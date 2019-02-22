package com.iss.service;

import java.util.List;

import com.iss.modal.Payroll;
import com.iss.modal.PayrollWrapper;

public interface PayrollSevice {
	public Boolean save(Payroll payroll);

	public Boolean update(Payroll payroll);

	public Boolean delete(Integer payrollid);

	public List<PayrollWrapper> getAll();
}
