package com.Student_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.Student_entity.Student;

public interface Student_Repository extends  JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

}
