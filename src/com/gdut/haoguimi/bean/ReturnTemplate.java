package com.gdut.haoguimi.bean;

import java.util.List;

public class ReturnTemplate {
	private String errmsg;
	private boolean result;
	private List list;
	private Integer rows;
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "ReturnTemplate [errmsg=" + errmsg + ", result=" + result
				+ ", list=" + list + "]";
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
}
