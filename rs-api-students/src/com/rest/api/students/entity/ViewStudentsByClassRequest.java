package com.rest.api.students.entity;

public class ViewStudentsByClassRequest {
	private int code;
	
	

	public ViewStudentsByClassRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewStudentsByClassRequest(int code) {
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
