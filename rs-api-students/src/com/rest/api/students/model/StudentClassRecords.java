package com.rest.api.students.model;

public class StudentClassRecords {
	private int studentId;
	private int code;
	
	public StudentClassRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentClassRecords(int studentId, int code) {
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
