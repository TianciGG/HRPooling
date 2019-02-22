package com.iss.modal;

import java.util.Date;

public class NoticeWrapper {
	private Integer noticeid;

	private String noticetitle;

	private String noticetypename;

	private String empname;

	private Date publishtime;

	private String content;

	public Integer getNoticeid() {
		return noticeid;
	}

	public void setNoticeid(Integer noticeid) {
		this.noticeid = noticeid;
	}

	public String getNoticetitle() {
		return noticetitle;
	}

	public void setNoticetitle(String noticetitle) {
		this.noticetitle = noticetitle;
	}

	public String getNoticetypename() {
		return noticetypename;
	}

	public void setNoticetypename(String noticetypename) {
		this.noticetypename = noticetypename;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Date getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
