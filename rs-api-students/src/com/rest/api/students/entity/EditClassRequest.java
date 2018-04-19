package com.rest.api.students.entity;

public class EditClassRequest {
	private int code;
	private String title;
	private String description;
	
	
	
	public EditClassRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EditClassRequest(int code, String title, String description) {
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
