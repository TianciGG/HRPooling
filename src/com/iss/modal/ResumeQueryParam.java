package com.iss.modal;

import com.iss.util.QueryParam;
/*
 * ��Ӧmapper.xml�еķ�ҳ�е�ģ����ѯ
 * ���������а�������ѯ
 * mapper.xml�е�where���Զ��������������ϵĲ�ѯ�������ϵ��ų�
 */

public class ResumeQueryParam extends QueryParam {

	private String personName;
	private Boolean gender;
	private String politicalstatus;
	private String address;
	private String birthdate;
	private Boolean maritalstatus;
	private Integer degreeid;
	private String job;
	private String phone;

	public String getPersonName() {
		return personName;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getPoliticalstatus() {
		return politicalstatus;
	}

	public void setPoliticalstatus(String politicalstatus) {
		this.politicalstatus = politicalstatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public Boolean getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(Boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public Integer getDegreeid() {
		return degreeid;
	}

	public void setDegreeid(Integer degreeid) {
		this.degreeid = degreeid;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
