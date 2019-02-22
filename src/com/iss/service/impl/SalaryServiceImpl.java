package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.SalaryMapper;
import com.iss.modal.Salary;
import com.iss.modal.SalaryWrapper;
import com.iss.service.SalaryService;

@Service
// service标记
public class SalaryServiceImpl implements SalaryService {
	@Autowired
	private SalaryMapper salaryMapper;// 声明一个salaryDAO层的借接口，自动装载

	@Override
	public Boolean save(Salary salary) {
		Boolean flag = false;
		int num = salaryMapper.insert(salary);
		if (num > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<SalaryWrapper> getAll() {
		List<SalaryWrapper> salaryList = salaryMapper.selectAll();
		return salaryList;
	}

	@Override
	public Boolean delete(Integer salaryid) {
		Boolean flag = false;
		int num = salaryMapper.deleteByPrimaryKey(salaryid);
		if (num > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Boolean update(Salary salary) {
		Boolean flag = false;
		int num = salaryMapper.updateByPrimaryKey(salary);
		if (num > 0) {
			flag = true;
		}
		return flag;
	}

}
