package com.iss.modal;

import com.iss.util.QueryParam;

public class SysDicValue extends QueryParam {
	private Integer id;

	private Integer typeid;

	private String value;

	private String display;

	private String des;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value == null ? null : value.trim();
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display == null ? null : display.trim();
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des == null ? null : des.trim();
	}
}