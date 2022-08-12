package com.Student_serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Student_entity.Student;
import com.Student_service.Student_Service;

public class Student_ServiceImpl implements Student_Service{

	
	@Autowired
	Student_Service student_Service;
	@Override
	public List<Student> getStudentList() {
		return student_Service.getStudentList();
	}

}
