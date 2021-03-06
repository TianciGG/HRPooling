package com.iss.modal;

import java.util.Date;

public class AttendanceWrapper {
	private Integer attendanceid;

	private Employee employee;

	private Date attdate;

	private Date attendaceTime;

	private Date closeingTime;

	private Boolean islate;

	private Boolean istardy;

	private Boolean isleave;

	public Integer getAttendanceid() {
		return attendanceid;
	}

	public void setAttendanceid(Integer attendanceid) {
		this.attendanceid = attendanceid;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getAttdate() {
		return attdate;
	}

	public void setAttdate(Date attdate) {
		this.attdate = attdate;
	}

	public Date getAttendaceTime() {
		return attendaceTime;
	}

	public void setAttendaceTime(Date attendaceTime) {
		this.attendaceTime = attendaceTime;
	}

	public Date getCloseingTime() {
		return closeingTime;
	}

	public void setCloseingTime(Date closeingTime) {
		this.closeingTime = closeingTime;
	}

	public Boolean getIslate() {
		return islate;
	}

	public void setIslate(Boolean islate) {
		this.islate = islate;
	}

	public Boolean getIstardy() {
		return istardy;
	}

	public void setIstardy(Boolean istardy) {
		this.istardy = istardy;
	}

	public Boolean getIsleave() {
		return isleave;
	}

	public void setIsleave(Boolean isleave) {
		this.isleave = isleave;
	}
}