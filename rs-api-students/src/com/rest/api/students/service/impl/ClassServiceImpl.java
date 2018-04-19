package com.rest.api.students.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.api.students.entity.BrowseClassesResponse;
import com.rest.api.students.entity.CreateClassRequest;
import com.rest.api.students.entity.CreateClassResponse;
import com.rest.api.students.entity.DeleteClassRequest;
import com.rest.api.students.entity.DeleteClassResponse;
import com.rest.api.students.entity.EditClassRequest;
import com.rest.api.students.entity.EditClassResponse;
import com.rest.api.students.entity.ViewClassesByStudentRequest;
import com.rest.api.students.entity.ViewClassesByStudentResponse;
import com.rest.api.students.model.Class;
import com.rest.api.students.model.StudentClassRecords;
import com.rest.api.students.service.ClassService;

@Service("classService")
public class ClassServiceImpl implements ClassService{
	private List<Class> listClasses;
	
	@Override
	public CreateClassResponse createClass(CreateClassRequest request) {
		CreateClassResponse response = new CreateClassResponse();
		try{
			Class item = new Class();
			item.setDescription(request.getDescription());
			item.setTitle(request.getTitle());
			
			if(listClasses!=null) {
				int id= listClasses.size()+1;
				item.setCode(id);
				listClasses.add(item);
			}else {
				listClasses = new ArrayList<Class>();
				item.setCode(1);
				listClasses.add(item);
			}
			response.setCodeError( 0 );
			response.setMsgError( "ok" );
		}catch (Exception e){
			response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
		}
		return response;
	}

	@Override
	public EditClassResponse editClass(EditClassRequest request) {
		EditClassResponse response = new EditClassResponse();
		try{
			if(listClasses!=null) {
				for(int i=0;i<listClasses.size();i++) {
					if(listClasses.get(i).getCode()==request.getCode()) {
						listClasses.get(i).setDescription(request.getDescription());
						listClasses.get(i).setTitle(request.getTitle());
					}
				}
			}
			response.setCodeError( 0 );
			response.setMsgError( "ok" );
		}catch (Exception e){
			response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
			
		}
		return response;
	}

	@Override
	public DeleteClassResponse deleteClass(DeleteClassRequest request) {
		DeleteClassResponse response = new DeleteClassResponse();
		try{
			if(listClasses!=null) {
				for(int i=0;i<listClasses.size();i++) {
					if(listClasses.get(i).getCode()==request.getCode()) {
						listClasses.remove(i);
					}
				}
			}
			response.setCodeError( 0 );
			response.setMsgError( "ok" );
		}catch (Exception e){
			response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
			
		}
		return response;
	}

	@Override
	public BrowseClassesResponse browseClass() {
		BrowseClassesResponse response = new BrowseClassesResponse();
		try{
			if(listClasses!=null) {
				response.setListClasses(listClasses);
			}else {
				listClasses = new ArrayList<Class>();
			}
			response.setCodeError( 0 );
			response.setMsgError( "ok" );
		}catch (Exception e){
			response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
			
		}
		return response;
	}

	@Override
	public ViewClassesByStudentResponse viewClassesByStudent(ViewClassesByStudentRequest request,  List<StudentClassRecords> records) {
		ViewClassesByStudentResponse response = new ViewClassesByStudentResponse();
		try{
			for(int i=0;i<records.size();i++) {
				if(records.get(i).getStudentId()==request.getStudentId()) {
					for(int j=0;j<listClasses.size();j++) {
						if(records.get(i).getCode()==listClasses.get(j).getCode()) {
							response.addClass(listClasses.get(j));
							break;
						}
					}
				}
			}
			
			response.setCodeError( 0 );
			response.setMsgError( "ok" );
		}catch (Exception e){
			response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
			
		}
		return response;
	}

}
