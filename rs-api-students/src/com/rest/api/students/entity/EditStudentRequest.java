package com.rest.api.students.entity;

public class EditStudentRequest {
	private int studentId;
	private String lastName;
	private String firstName;
	
	
	
	public EditStudentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EditStudentRequest(int studentId, String lastName, String firstName) {
		super();
		this.studentId = studentId;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
