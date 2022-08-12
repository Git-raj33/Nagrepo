package com.College_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	
	@Id
    @Column(name = "id", nullable = false,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 @Column(name = "college_name", nullable = false)
	private String collegeName;
	
	 @Column(name ="total_students", nullable = false)
	 private Long totalstudents;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Long getTotalstudents() {
		return totalstudents;
	}

	public void setTotalstudents(Long totalstudents) {
		this.totalstudents = totalstudents;
	}


}
