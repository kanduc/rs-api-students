package com.rest.api.students.entity;

public class ViewClassesByStudentRequest {
	private int studentId;
	
	

	public ViewClassesByStudentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewClassesByStudentRequest(int studentId) {
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
