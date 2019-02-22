package com.iss.modal;

import java.math.BigDecimal;

public class Salary {
    private Integer salaryid;

    private Integer empid;

    private BigDecimal salary;

    public Integer getSalaryid() {
        return salaryid;
    }

    public void setSalaryid(Integer salaryid) {
        this.salaryid = salaryid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}