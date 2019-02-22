package com.iss.service;

import java.util.List;

import com.iss.modal.Salary;
import com.iss.modal.SalaryWrapper;

public interface SalaryService {
	public Boolean save(Salary salary);

	public Boolean delete(Integer salaryid);

	public Boolean update(Salary salary);

	public List<SalaryWrapper> getAll();
}
