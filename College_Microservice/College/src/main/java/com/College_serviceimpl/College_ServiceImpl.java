package com.College_serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.College_entity.College;
import com.College_service.College_Service;

public class College_ServiceImpl implements College_Service{
	
	@Autowired
	College_Service college_Service;

	@Override
	public List<College> getCollegeList() {
		// TODO Auto-generated method stub
		return college_Service.getCollegeList();
	}

}
