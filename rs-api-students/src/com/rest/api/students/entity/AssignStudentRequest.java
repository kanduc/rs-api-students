package com.rest.api.students.entity;

public class AssignStudentRequest {
	private int studentId;
	private int code;
	
	
	public AssignStudentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignStudentRequest(int studentId, int code) {
		super();
		this.studentId = studentId;
		this.code = code;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
