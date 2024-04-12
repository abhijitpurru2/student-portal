package com.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole {

    @ManyToOne
    @JoinColumn(name = "role_id")
    @Column(name="role_id", nullable = false)
	private Role roleId;

    @ManyToOne
    @Column(name="user_id", nullable = false)
    @JoinColumn(name = "user_id")
    private User userId;

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}