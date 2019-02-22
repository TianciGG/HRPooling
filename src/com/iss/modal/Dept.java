package com.iss.modal;

public class Dept {
	private Integer deptid;

	private String deptno;

	private String deptname;

	private String dpphone;

	private String dpprofile;

	private Integer superid;

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno == null ? null : deptno.trim();
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname == null ? null : deptname.trim();
	}

	public String getDpphone() {
		return dpphone;
	}

	public void setDpphone(String dpphone) {
		this.dpphone = dpphone == null ? null : dpphone.trim();
	}

	public String getDpprofile() {
		return dpprofile;
	}

	public void setDpprofile(String dpprofile) {
		this.dpprofile = dpprofile == null ? null : dpprofile.trim();
	}

	public Integer getSuperid() {
		return superid;
	}

	public void setSuperid(Integer superid) {
		this.superid = superid;
	}
}