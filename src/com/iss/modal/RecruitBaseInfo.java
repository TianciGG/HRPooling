package com.iss.modal;

public class RecruitBaseInfo {
	private Integer id;

	private String position;

	private String company;

	private String workplace;

	private String salary;

	private String date;

	private String batch;

	private String page;

	private String urlid;

	private RecruitOtherInfo recruitOtherInfo;

	public RecruitOtherInfo getRecruitOtherInfo() {
		return recruitOtherInfo;
	}

	public void setRecruitOtherInfo(RecruitOtherInfo recruitOtherInfo) {
		this.recruitOtherInfo = recruitOtherInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company == null ? null : company.trim();
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace == null ? null : workplace.trim();
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary == null ? null : salary.trim();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date == null ? null : date.trim();
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch == null ? null : batch.trim();
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page == null ? null : page.trim();
	}

	public String getUrlid() {
		return urlid;
	}

	public void setUrlid(String urlid) {
		this.urlid = urlid == null ? null : urlid.trim();
	}
}