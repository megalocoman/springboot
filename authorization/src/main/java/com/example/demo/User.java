package com.example.demo;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @Column(name="rutuser")
    private String id;
    private String username;
    private String password;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable( 
	    name = "users_roles",
	    joinColumns = @JoinColumn(name="users_rutuser"),
	    inverseJoinColumns = @JoinColumn(name = "roles_roleid") 
	    )
    private Set<Role> roles_us;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles_us() {
        return roles_us;
    }

    public void setRoles_us(Set<Role> roles_us) {
        this.roles_us = roles_us;
    }

    

    
      

}
