package com.project.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class courses {

	@Id
	private String course_id;

    private String name;
    private Integer year_applied;
    private Integer duration;
    private Integer credits;

    public String getCourseID() {
        return course_id;
    }

    public void setCourseID(String id) {
        this.course_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year_applied;
    }

    public void setYear(Integer year) {
        this.year_applied = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}