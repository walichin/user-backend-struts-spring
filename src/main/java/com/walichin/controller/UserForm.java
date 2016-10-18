package com.walichin.controller;

public class UserForm implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	//private Integer user_id;
	private String name;
	private String login;
	private String password;

	public UserForm() {
	}

	public UserForm(String name, String login, String password) {
		this.name = name;
		this.login = login;
		this.password = password;
	}

//	public Integer getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(Integer user_id) {
//		this.user_id = user_id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
