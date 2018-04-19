package com.rest.api.students.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.api.students.entity.AssignStudentRequest;
import com.rest.api.students.entity.AssignStudentResponse;
import com.rest.api.students.entity.BrowseStudentsResponse;
import com.rest.api.students.entity.CreateStudentRequest;
import com.rest.api.students.entity.CreateStudentResponse;
import com.rest.api.students.entity.DeleteStudentRequest;
import com.rest.api.students.entity.DeleteStudentResponse;
import com.rest.api.students.entity.EditStudentRequest;
import com.rest.api.students.entity.EditStudentResponse;
import com.rest.api.students.entity.ViewStudentsByClassRequest;
import com.rest.api.students.entity.ViewStudentsByClassResponse;
import com.rest.api.students.model.Student;
import com.rest.api.students.model.StudentClassRecords;
import com.rest.api.students.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	private List<Student> listStudents;
	private List<StudentClassRecords> listRecords;
	
	@Override
	public CreateStudentResponse createStudent(CreateStudentRequest request) {
		CreateStudentResponse response = new CreateStudentResponse();
		try{
			Student item = new Student();
			item.setFirstName(request.getFirstName());
			item.setLastName(request.getLastName());
			
			if(listStudents!=null) {
				int id= listStudents.size()+1;
				item.setStudentId(id);
				listStudents.add(item);
			}else {
				listStudents = new ArrayList<Student>();
				item.setStudentId(1);
				listStudents.add(item);
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
	public EditStudentResponse editStudent(EditStudentRequest request) {
		EditStudentResponse response = new EditStudentResponse();
		try{
			if(listStudents!=null) {
				for(int i=0;i<listStudents.size();i++) {
					if(listStudents.get(i).getStudentId()==request.getStudentId()) {
						listStudents.get(i).setFirstName(request.getFirstName());
						listStudents.get(i).setLastName(request.getLastName());
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
	public DeleteStudentResponse deleteStudent(DeleteStudentRequest request) {
		DeleteStudentResponse response = new DeleteStudentResponse();
		try{
			if(listStudents!=null) {
				for(int i=0;i<listStudents.size();i++) {
					if(listStudents.get(i).getStudentId()==request.getStudentId()) {
						listStudents.remove(i);
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
	public BrowseStudentsResponse browseStudent() {
		BrowseStudentsResponse response = new BrowseStudentsResponse();
		try{
			if(listStudents!=null) {
				response.setListStudents(listStudents);
			}else {
				listStudents = new ArrayList<Student>();
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
	public ViewStudentsByClassResponse viewStudentsByClass(ViewStudentsByClassRequest request) {
		ViewStudentsByClassResponse response = new ViewStudentsByClassResponse();
		try{
			for(int i=0;i<listRecords.size();i++) {
				if(listRecords.get(i).getCode()==request.getCode()) {
					for(int j=0;j<listStudents.size();j++) {
						if(listRecords.get(i).getStudentId()==listStudents.get(j).getStudentId()) {
							response.addStudent(listStudents.get(j));
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

	@Override
	public AssignStudentResponse assignStudentsToClass(AssignStudentRequest request) {
		AssignStudentResponse response = new AssignStudentResponse();
		try{
			
			StudentClassRecords record = new StudentClassRecords();
			record.setCode(request.getCode());
			record.setStudentId(request.getStudentId());
			
			if(listRecords==null) {
				listRecords= new ArrayList<StudentClassRecords>();
			}
			listRecords.add(record);
			
			response.setCodeError( 0 );
			response.setMsgError( "ok" );
		}catch (Exception e){
			response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
			
		}
		return response;
	}
	
	@Override
	public List<StudentClassRecords> getListRecords() {
		return listRecords;
	}
	
}
