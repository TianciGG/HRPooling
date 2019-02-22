package com.iss.service;

import java.util.List;

import com.iss.modal.Employee;

public interface EmployeeService {

	public Boolean save(Employee employee);

	public List<Employee> getAll();

}
