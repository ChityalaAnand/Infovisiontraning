package com.coursemanagement.coursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemanagement.coursemanagement.modal.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
