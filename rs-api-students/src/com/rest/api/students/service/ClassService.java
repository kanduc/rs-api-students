package com.rest.api.students.service;

import java.util.List;

import com.rest.api.students.entity.BrowseClassesResponse;
import com.rest.api.students.entity.CreateClassRequest;
import com.rest.api.students.entity.CreateClassResponse;
import com.rest.api.students.entity.DeleteClassRequest;
import com.rest.api.students.entity.DeleteClassResponse;
import com.rest.api.students.entity.EditClassRequest;
import com.rest.api.students.entity.EditClassResponse;
import com.rest.api.students.entity.ViewClassesByStudentRequest;
import com.rest.api.students.entity.ViewClassesByStudentResponse;
import com.rest.api.students.model.StudentClassRecords;

public interface ClassService {
	public CreateClassResponse createClass (CreateClassRequest request);
	public EditClassResponse editClass (EditClassRequest request);
	public DeleteClassResponse deleteClass (DeleteClassRequest request);
	public BrowseClassesResponse browseClass ();
	public ViewClassesByStudentResponse viewClassesByStudent (ViewClassesByStudentRequest request, List<StudentClassRecords> records);

}
