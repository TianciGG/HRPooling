package com.iss.modal;

public class Employee {
	private Integer empid;

	private String empno;

	private Integer userid;

	// private Integer dutyid;

	private Integer leid;

	private String empname;

	private Integer nationid;

	private String empsex;

	private String empidname;

	private Integer emppoliticalidenid;

	private Integer empnativeplaceid;

	private String empbrithday;

	private String empar;

	private String empjobt;

	// private Integer deptid;

	private Integer empage;

	private Duty duty;

	private Dept dept;

	public Duty getDuty() {
		return duty;
	}

	public void setDuty(Duty duty) {
		this.duty = duty;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno == null ? null : empno.trim();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getLeid() {
		return leid;
	}

	public void setLeid(Integer leid) {
		this.leid = leid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname == null ? null : empname.trim();
	}

	public Integer getNationid() {
		return nationid;
	}

	public void setNationid(Integer nationid) {
		this.nationid = nationid;
	}

	public String getEmpsex() {
		return empsex;
	}

	public void setEmpsex(String empsex) {
		this.empsex = empsex == null ? null : empsex.trim();
	}

	public String getEmpidname() {
		return empidname;
	}

	public void setEmpidname(String empidname) {
		this.empidname = empidname == null ? null : empidname.trim();
	}

	public Integer getEmppoliticalidenid() {
		return emppoliticalidenid;
	}

	public void setEmppoliticalidenid(Integer emppoliticalidenid) {
		this.emppoliticalidenid = emppoliticalidenid;
	}

	public Integer getEmpnativeplaceid() {
		return empnativeplaceid;
	}

	public void setEmpnativeplaceid(Integer empnativeplaceid) {
		this.empnativeplaceid = empnativeplaceid;
	}

	public String getEmpbrithday() {
		return empbrithday;
	}

	public void setEmpbrithday(String empbrithday) {
		this.empbrithday = empbrithday == null ? null : empbrithday.trim();
	}

	public String getEmpar() {
		return empar;
	}

	public void setEmpar(String empar) {
		this.empar = empar == null ? null : empar.trim();
	}

	public String getEmpjobt() {
		return empjobt;
	}

	public void setEmpjobt(String empjobt) {
		this.empjobt = empjobt == null ? null : empjobt.trim();
	}

	public Integer getEmpage() {
		return empage;
	}

	public void setEmpage(Integer empage) {
		this.empage = empage;
	}
}