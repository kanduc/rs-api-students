package com.rest.api.students.entity;

public class EditStudentResponse {
	private int codeError;
	private String msgError;
	
	public EditStudentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodeError() {
		return codeError;
	}

	public void setCodeError(int codeError) {
		this.codeError = codeError;
	}

	public String getMsgError() {
		return msgError;
	}

	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}
}
