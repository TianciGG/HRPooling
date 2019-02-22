package com.iss.modal;

public class DutyInfo {

	private Integer dutyId;
	private String dutyName;
	private String dutydes;
	private Integer deptId;
	private Integer superId;
	private String superDutyName;
	private String deptName;

	public String getSuperDutyName() {
		return superDutyName;
	}

	public void setSuperDutyName(String superDutyName) {
		this.superDutyName = superDutyName;
	}

	public Integer getDutyId() {
		return dutyId;
	}

	public void setDutyId(Integer dutyId) {
		this.dutyId = dutyId;
	}

	public String getDutyName() {
		return dutyName;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

	public String getDutydes() {
		return dutydes;
	}

	public void setDutydes(String dutydes) {
		this.dutydes = dutydes;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getSuperId() {
		return superId;
	}

	public void setSuperId(Integer superId) {
		this.superId = superId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
