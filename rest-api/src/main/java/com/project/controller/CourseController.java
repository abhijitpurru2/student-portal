package com.project.controller;

import com.project.entity.Course;
import com.project.service.CourseService;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/course")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        Course savedProduct = courseService.saveProduct(course);
        return ResponseEntity.ok(savedProduct);
    }
}