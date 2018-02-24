package com.gdut.haoguimi.bean;

import java.sql.Date;


public class Sharebean {
private String checkcode;
private Integer id;
private String title;
private String content;
private String createtime;
private String board;
private String visitcount;
private Integer num1;
public String getCheckcode() {
	return checkcode;
}
public void setCheckcode(String checkcode) {
	this.checkcode = checkcode;
}
public Integer getNum1() {
	return num1;
}
public void setNum1(Integer num1) {
	this.num1 = num1;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getCreatetime() {
	return createtime;
}
public void setCreatetime(String createtime) {
	this.createtime = createtime;
}
public String getBoard() {
	return board;
}
public void setBoard(String board) {
	this.board = board;
}
public String getVisitcount() {
	return visitcount;
}
public void setVisitcount(String visitcount) {
	this.visitcount = visitcount;
}
}
