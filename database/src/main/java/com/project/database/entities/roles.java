package com.project.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class roles {

	@Id
	private String role_id;

    private String name;


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