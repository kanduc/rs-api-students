package com.rest.api.students.entity;

import java.util.ArrayList;
import java.util.List;

import com.rest.api.students.model.Student;

public class ViewStudentsByClassResponse {
	private int codeError;
	private String msgError;
	List<Student> listStudents;
	
	
	public ViewStudentsByClassResponse() {
		super();
		this.listStudents= new ArrayList<Student>();
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
	
	public List<Student> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<Student> listStudents) {
		this.listStudents = listStudents;
	}
	
	public void addStudent(Student studentItem) {
		this.listStudents.add(studentItem);
	}
}
