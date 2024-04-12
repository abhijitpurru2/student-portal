package com.entity;

import javax.persistence.*;

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