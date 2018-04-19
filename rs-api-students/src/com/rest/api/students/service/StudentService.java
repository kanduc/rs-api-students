package com.rest.api.students.service;

import java.util.List;

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
import com.rest.api.students.model.StudentClassRecords;

public interface StudentService {
	public CreateStudentResponse createStudent (CreateStudentRequest createStudentRequest);
	public EditStudentResponse editStudent (EditStudentRequest editStudentRequest);
	public DeleteStudentResponse deleteStudent (DeleteStudentRequest deleteStudentRequest);
	public BrowseStudentsResponse browseStudent ();
	public ViewStudentsByClassResponse viewStudentsByClass (ViewStudentsByClassRequest viewStudentsByClassRequest);
	public AssignStudentResponse assignStudentsToClass (AssignStudentRequest assignStudentRequest);
	public List<StudentClassRecords> getListRecords() ;
}
