package com.Student_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
    @Column(name = "id", nullable = false,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long std_id;
	
	 @Column(name = "std_name", nullable = false)
	private String stdName;
	 
	 @Column(name = "std_age", nullable = false)
		private int Age;
	 
	 public Long getStd_id() {
		return std_id;
	}

	public void setStd_id(Long std_id) {
		this.std_id = std_id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Column(name = "std_gender", nullable = false)
		private String Gender;
	
	 @Column(name ="stream", nullable = false)
	 private String Stream;


}
