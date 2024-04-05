package com.project.database.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class enrolled_courses {

    @ManyToOne
    @JoinColumn(name = "course_id")
	private courses course_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user_id;


    public String getRoleID() {
        return role_id;
    }

    public void setRoleID(String id) {
        this.role_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}