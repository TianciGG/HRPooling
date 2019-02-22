package com.iss.modal;

public class ResumeOtherInfo {
	private Integer id;

	private String money;

	private String experience;

	private String edu;

	private String willjob;

	private String nature;

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature == null ? null : nature.trim();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money == null ? null : money.trim();
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience == null ? null : experience.trim();
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu == null ? null : edu.trim();
	}

	public String getWilljob() {
		return willjob;
	}

	public void setWilljob(String willjob) {
		this.willjob = willjob == null ? null : willjob.trim();
	}
}