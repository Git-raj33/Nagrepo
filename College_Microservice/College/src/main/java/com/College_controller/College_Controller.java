package com.College_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.College_entity.College;
import com.College_service.College_Service;

@RestController
@RequestMapping
public class College_Controller {
	
	@Autowired
	College_Service college_Service;
	
	public List<College> getCollegeList() {
	return college_Service.getCollegeList();
	
	}

}
