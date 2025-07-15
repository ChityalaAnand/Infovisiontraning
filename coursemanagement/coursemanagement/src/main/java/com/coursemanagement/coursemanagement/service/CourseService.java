package com.coursemanagement.coursemanagement.service;

import com.coursemanagement.coursemanagement.modal.Course;
import java.util.*;
public interface CourseService {
	Course addCourse(Course course);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
    List<Course> getAllCourses();
    Course getCourseById(Long id);
}
