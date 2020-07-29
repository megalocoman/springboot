package com.example.demo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
    
    @Id
    @Column(name="roleid")
    private String id;
    @Column(name="rolename")
    private String name;
    
    @ManyToMany(mappedBy= "roles_us")
    Set<User> user_role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUser_role() {
        return user_role;
    }

    public void setUser_role(Set<User> user_role) {
        this.user_role = user_role;
    }
    
    
  
}
