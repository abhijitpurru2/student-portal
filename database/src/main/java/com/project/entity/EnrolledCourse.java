package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "enrolled_courses")
public class EnrolledCourse {

    @ManyToOne
    @JoinColumn(name = "course_id")
    @Column(name="course_id", nullable = false)
	private Course courseId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(name="user_id", nullable = false)
    private User userId;

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}