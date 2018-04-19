package com.rest.api.students.entity;

public class CreateStudentRequest {
	private String lastName;
	private String firstName;
		
	public CreateStudentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateStudentRequest(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
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
