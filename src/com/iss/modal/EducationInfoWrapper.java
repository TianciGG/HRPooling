package com.iss.modal;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/*
 * EducationInfo是一个POJO
 * ，即简单Java对象
 * 私有属性+ getter setter
 * */
public class EducationInfoWrapper {
	private Integer eduid;
	@JSONField(format = "yyyy-mm-dd")
	private Date starttime;
	@JSONField(format = "yyyy-mm-dd")
	private Date endtime;

	private String school;

	private String major;

	private DictValue degree;

	public DictValue getDegree() {
		return degree;
	}

	public void setDegree(DictValue degree) {
		this.degree = degree;
	}

	public Integer getEduid() {
		return eduid;
	}

	public void setEduid(Integer eduid) {
		this.eduid = eduid;
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}