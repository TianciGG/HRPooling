package com.iss.modal;

import java.math.BigDecimal;

public class Payroll {
    private Integer payrollid;

    private Integer salaryid;

    private BigDecimal deductions;

    public Integer getPayrollid() {
        return payrollid;
    }

    public void setPayrollid(Integer payrollid) {
        this.payrollid = payrollid;
    }

    public Integer getSalaryid() {
        return salaryid;
    }

    public void setSalaryid(Integer salaryid) {
        this.salaryid = salaryid;
    }

    public BigDecimal getDeductions() {
        return deductions;
    }

    public void setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
    }
}