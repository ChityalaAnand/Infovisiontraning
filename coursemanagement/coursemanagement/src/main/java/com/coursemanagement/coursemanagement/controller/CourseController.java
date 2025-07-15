package com.coursemanagement.coursemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursemanagement.coursemanagement.modal.Course;
import com.coursemanagement.coursemanagement.service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	@Autowired
    private CourseService courseService;

    // Create Course
    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        return ResponseEntity.ok(courseService.addCourse(course));
    }

    // Update Course
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return ResponseEntity.ok(courseService.updateCourse(id, course));
    }

    // Delete Course
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }

    // Get Course by ID
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getCourseById(id));
    }

    // Get All Courses
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }
}
