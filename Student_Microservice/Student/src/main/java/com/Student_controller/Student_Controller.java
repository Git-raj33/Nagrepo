package com.Student_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student_entity.Student;
import com.Student_service.Student_Service;

@RestController
@RequestMapping
public class Student_Controller {
	
	@Autowired
	Student_Service student_Service;
	
	public List<Student> getStudentList(){
		return student_Service.getStudentList();
	}
}
