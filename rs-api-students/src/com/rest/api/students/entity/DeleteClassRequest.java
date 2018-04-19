package com.rest.api.students.entity;

public class DeleteClassRequest {
	private int code;
	
	

	public DeleteClassRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeleteClassRequest(int code) {
		super();
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
