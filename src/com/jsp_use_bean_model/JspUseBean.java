package com.jsp_use_bean_model;

public class JspUseBean {
public int getId() {
		return id;
	}
	@Override
public String toString() {
	return "JspUseBean [id=" + id + ", name=" + name + ", pass=" + pass + "]";
}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
private int id;
private String name ;
private String pass ;
}
