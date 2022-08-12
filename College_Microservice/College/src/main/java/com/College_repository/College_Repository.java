package com.College_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.College_entity.College;

public interface College_Repository extends  JpaRepository<College, Long>, JpaSpecificationExecutor<College>{

//	List<College> getAllCollege;
}
