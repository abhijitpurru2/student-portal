package com.project.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {

	@Id
	private String user_id;

    private String first_name;
    private String last_name;
    private String email;
    private String password;

    public String getUserID() {
        return user_id;
    }

    public void setUserID(String id) {
        this.user_id = id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String name) {
        this.first_name = name;
    }

    public String getLastNameString() {
        return last_name;
    }

    public void setLastName(String name) {
        this.last_name = name;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getPassword() {
		return email;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
    
}