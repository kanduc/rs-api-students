package com.rest.api.students.model;

public class Class {
	
	private int code;
	private String title;
	private String description;
	
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(int code, String title, String description) {
		super();
		this.code = code;
		this.title = title;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
