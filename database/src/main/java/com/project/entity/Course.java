package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

	@Id
    @Column(name="course_id", nullable = false)
	private String courseId;

    private String name;
    @Column(name="year_applied", nullable = false)
    private Integer yearApplied;
    private Integer duration;
    private Integer credits;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearApplied() {
        return yearApplied;
    }

    public void setYearApplied(Integer yearApplied) {
        this.yearApplied = yearApplied;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
}