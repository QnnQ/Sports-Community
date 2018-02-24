package com.gdut.haoguimi.bean;

public class Loginbean {
	private String id;
	private String password;
	private String checkcode;
	public String getCheckcode() {
		return checkcode;
	}
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Loginbean [id=" + id + ", password=" + password + "]";
	}
}
