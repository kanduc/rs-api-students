package com.rest.api.students.entity;

public class DeleteStudentRequest {
	private int studentId;
	
	
	public DeleteStudentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeleteStudentRequest(int studentId) {
		super();
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}
