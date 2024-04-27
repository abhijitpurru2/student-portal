package com.project.service;

import com.project.entity.Course;
import com.project.repo.CourseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final CourseRepo courseRepo;

    public UserService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course saveCourse(Course course) {
        try {
            return courseRepo.save(course);
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to save course: " + e.getMessage());
        }
    }

    public List<Course> fetchAllCourses() {
        try {
            return courseRepo.findAll();
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to fetch all courses: " + e.getMessage());
        }
    }


}