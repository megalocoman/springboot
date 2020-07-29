package com.example.demo;

import java.util.Collection;
import java.util.Set;

import javax.management.relation.Role;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails  {

    private User user;

    public MyUserDetails(User user) {
	this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	
	Set<Role> roles = user.;
	
	return;
    }

    @Override
    public String getPassword() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getUsername() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean isEnabled() {
	// TODO Auto-generated method stub
	return false;
    }
    
    
}
