package com.gjjf.commonservice.userCenter.model;

public class User {
	
	private Integer user_id;
	
	private String user_phone;
	
	private String user_pwd;
	
	private String user_name;
	
	private String email;
	
	private String create_time;
	
	private String lastModify_time;

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getLastModify_time() {
		return lastModify_time;
	}

	public void setLastModify_time(String lastModify_time) {
		this.lastModify_time = lastModify_time;
	}

}