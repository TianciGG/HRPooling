package com.iss.modal;

import java.math.BigDecimal;

public class SalaryWrapper {
	private Integer salaryid;

	private Employee employee;

	private BigDecimal salary;

	public Integer getSalaryid() {
		return salaryid;
	}

	public void setSalaryid(Integer salaryid) {
		this.salaryid = salaryid;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}