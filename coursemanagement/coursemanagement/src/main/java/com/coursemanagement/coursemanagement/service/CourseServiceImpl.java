package com.coursemanagement.coursemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursemanagement.coursemanagement.modal.Course;
import com.coursemanagement.coursemanagement.repository.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepository courseRepository;
	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	 @Override
	    public Course updateCourse(Long id, Course course) {
	        Optional<Course> existingCourse = courseRepository.findById(id);
	        if (existingCourse.isPresent()) {
	            Course updated = existingCourse.get();
	            updated.setCourseName(course.getCourseName());
	            return courseRepository.save(updated);
	        } else {
	            throw new RuntimeException("Course not found with id " + id);
	        }
	    }

	    @Override
	    public void deleteCourse(Long id) {
	        courseRepository.deleteById(id);
	    }

	    @Override
	    public Course getCourseById(Long id) {
	        return courseRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Course not found with id " + id));
	    }

	    @Override
	    public List<Course> getAllCourses() {
	        return courseRepository.findAll();
	    }

}
