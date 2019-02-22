package com.iss.modal;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class WorkExperience {
	private Integer workexperienceid;
	@JSONField(format = "yyyy-mm-dd")
	private Date starttime;
	@JSONField(format = "yyyy-mm-dd")
	private Date endtime;

	private String company;

	private String position;

	private String basicinfoid;

	public Integer getWorkexperienceid() {
		return workexperienceid;
	}

	public void setWorkexperienceid(Integer workexperienceid) {
		this.workexperienceid = workexperienceid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company == null ? null : company.trim();
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}

	public String getBasicinfoid() {
		return basicinfoid;
	}

	public void setBasicinfoid(String basicinfoid) {
		this.basicinfoid = basicinfoid == null ? null : basicinfoid.trim();
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
}