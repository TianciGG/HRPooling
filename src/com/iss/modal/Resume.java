package com.iss.modal;

public class Resume {
	private Integer basicinfoid;

	private String name;

	private Boolean gender;

	private String birthdate;

	private String address;

	private String politicalstatus;

	private String job;

	private Boolean maritalstatus;

	private String hobbies;

	private String phone;

	private Integer degreeid;

	private Integer tag;

	public Integer getBasicinfoid() {
		return basicinfoid;
	}

	public void setBasicinfoid(Integer basicinfoid) {
		this.basicinfoid = basicinfoid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate == null ? null : birthdate.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getPoliticalstatus() {
		return politicalstatus;
	}

	public void setPoliticalstatus(String politicalstatus) {
		this.politicalstatus = politicalstatus == null ? null : politicalstatus.trim();
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job == null ? null : job.trim();
	}

	public Boolean getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(Boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies == null ? null : hobbies.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Integer getDegreeid() {
		return degreeid;
	}

	public void setDegreeid(Integer degreeid) {
		this.degreeid = degreeid;
	}

	public Integer getTag() {
		return tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

}