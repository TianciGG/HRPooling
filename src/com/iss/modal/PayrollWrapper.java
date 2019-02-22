package com.iss.modal;

import java.math.BigDecimal;

public class PayrollWrapper {
	private Integer payrollid;

	private SalaryWrapper salary;

	private BigDecimal deductions;

	public Integer getPayrollid() {
		return payrollid;
	}

	public void setPayrollid(Integer payrollid) {
		this.payrollid = payrollid;
	}

	public SalaryWrapper getSalary() {
		return salary;
	}

	public void setSalary(SalaryWrapper salary) {
		this.salary = salary;
	}

	public BigDecimal getDeductions() {
		return deductions;
	}

	public void setDeductions(BigDecimal deductions) {
		this.deductions = deductions;
	}
}