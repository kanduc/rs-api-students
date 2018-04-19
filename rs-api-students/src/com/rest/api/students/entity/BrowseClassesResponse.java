package com.rest.api.students.entity;

import java.util.ArrayList;
import java.util.List;
import com.rest.api.students.model.Class;

public class BrowseClassesResponse {
	private int codeError;
	private String msgError;
	List<Class> listClasses;
	
	public BrowseClassesResponse() {
		super();
		// TODO Auto-generated constructor stub
		this.listClasses = new ArrayList<Class>();
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

	public List<Class> getListClasses() {
		return listClasses;
	}

	public void setListClasses(List<Class> listClasses) {
		this.listClasses = listClasses;
	}
	
	public void addClass(Class classItem) {
		this.listClasses.add(classItem);
	}
}
