package com.rest.api.students.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.api.students.entity.AssignStudentRequest;
import com.rest.api.students.entity.AssignStudentResponse;
import com.rest.api.students.entity.BrowseClassesResponse;
import com.rest.api.students.entity.BrowseStudentsResponse;
import com.rest.api.students.entity.CreateClassRequest;
import com.rest.api.students.entity.CreateClassResponse;
import com.rest.api.students.entity.CreateStudentRequest;
import com.rest.api.students.entity.CreateStudentResponse;
import com.rest.api.students.entity.DeleteClassRequest;
import com.rest.api.students.entity.DeleteClassResponse;
import com.rest.api.students.entity.DeleteStudentRequest;
import com.rest.api.students.entity.DeleteStudentResponse;
import com.rest.api.students.entity.EditClassRequest;
import com.rest.api.students.entity.EditClassResponse;
import com.rest.api.students.entity.EditStudentRequest;
import com.rest.api.students.entity.EditStudentResponse;
import com.rest.api.students.entity.ViewClassesByStudentRequest;
import com.rest.api.students.entity.ViewClassesByStudentResponse;
import com.rest.api.students.entity.ViewStudentsByClassRequest;
import com.rest.api.students.entity.ViewStudentsByClassResponse;
import com.rest.api.students.service.ClassService;
import com.rest.api.students.service.StudentService;

@Controller
@RequestMapping( "/api" )
public class ApiController {
	
	@Autowired
	private ClassService classService;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping( value = "/createStudent", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	CreateStudentResponse createStudent( @RequestBody CreateStudentRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		CreateStudentResponse response = new CreateStudentResponse();
			
		try {
            response = studentService.createStudent(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/editStudent", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	EditStudentResponse editStudent( @RequestBody EditStudentRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		EditStudentResponse response = new EditStudentResponse();
		
		
		try {
            response = studentService.editStudent(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/deleteStudent", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	DeleteStudentResponse createStudent( @RequestBody DeleteStudentRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		DeleteStudentResponse response = new DeleteStudentResponse();
		
		
		try {
            response = studentService.deleteStudent(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/browseStudents", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody
	BrowseStudentsResponse browseStudents( HttpServletRequest req, HttpServletResponse res ) throws Exception{
		BrowseStudentsResponse response = new BrowseStudentsResponse();
		
		
		try {
            response = studentService.browseStudent();
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/viewStudents", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	ViewStudentsByClassResponse viewClasses( @RequestBody ViewStudentsByClassRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		ViewStudentsByClassResponse response = new ViewStudentsByClassResponse();
		
		
		try {
            response = studentService.viewStudentsByClass(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/assignStudent", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	AssignStudentResponse assignStudent( @RequestBody AssignStudentRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		AssignStudentResponse response = new AssignStudentResponse();
		
		
		try {
            response = studentService.assignStudentsToClass(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/createClass", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	CreateClassResponse createClass( @RequestBody CreateClassRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		CreateClassResponse response = new CreateClassResponse();
		
		
		try {
            response = classService.createClass(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/editClass", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	EditClassResponse editClass( @RequestBody EditClassRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		EditClassResponse response = new EditClassResponse();
		
		
		try {
            response = classService.editClass(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/deleteClass", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	DeleteClassResponse deleteClass( @RequestBody DeleteClassRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		DeleteClassResponse response = new DeleteClassResponse();
		
		
		try {
            response = classService.deleteClass(request);
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/browseClasses", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody
	BrowseClassesResponse browseClasses( HttpServletRequest req, HttpServletResponse res ) throws Exception{
		BrowseClassesResponse response = new BrowseClassesResponse();
		
		
		try {
            response = classService.browseClass();
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
	
	@RequestMapping( value = "/viewClasses", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody
	ViewClassesByStudentResponse viewClasses( @RequestBody ViewClassesByStudentRequest request, HttpServletRequest req, HttpServletResponse res ) throws Exception{
		ViewClassesByStudentResponse response = new ViewClassesByStudentResponse();
		
		
		try {
            response = classService.viewClassesByStudent(request, studentService.getListRecords());
            
        } catch (Exception e) {
        	response.setCodeError( 1 );
			response.setMsgError( "error: "+e.getMessage() );
            
        }
     
		return response;
	}
}
