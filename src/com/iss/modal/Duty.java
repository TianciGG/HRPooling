package com.iss.modal;

public class Duty {
	private Integer dutyid;

	private String dutyname;

	private String dutydes;

	private Integer deptid;

	private Integer superid;

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public Integer getDutyid() {
		return dutyid;
	}

	public void setDutyid(Integer dutyid) {
		this.dutyid = dutyid;
	}

	public String getDutyname() {
		return dutyname;
	}

	public void setDutyname(String dutyname) {
		this.dutyname = dutyname == null ? null : dutyname.trim();
	}

	public String getDutydes() {
		return dutydes;
	}

	public void setDutydes(String dutydes) {
		this.dutydes = dutydes == null ? null : dutydes.trim();
	}

	public Integer getSuperid() {
		return superid;
	}

	public void setSuperid(Integer superid) {
		this.superid = superid;
	}
}