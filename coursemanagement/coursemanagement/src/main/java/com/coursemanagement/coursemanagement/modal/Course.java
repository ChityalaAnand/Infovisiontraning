package com.coursemanagement.coursemanagement.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String courseName;
	
	public Course(){
		
	}
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Course(Long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
}
