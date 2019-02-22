package com.iss.util;

import java.util.List;

/*
 * 用于描述table的数据结构
 */
public class BootstrapTableSource {
	private int total;
	private List rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}

}
