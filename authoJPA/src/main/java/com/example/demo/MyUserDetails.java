package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{
    
   
    private String username;
    private String password;
    private List<GrantedAuthority> authorities;
    
    public MyUserDetails(User user) {
	this.username = user.getUsername();
	this.password = user.getPassword();
	this.authorities = Arrays.stream(user.getRole().split(",")) 
			   .map(SimpleGrantedAuthority::new)
			   .collect(Collectors.toList());
    }
    
//    public MyUserDetails() {
//	
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	
	return authorities;
    }

    @Override
    public String getPassword() {
	// TODO Auto-generated method stub
	return password;
    }

    @Override
    public String getUsername() {
	// TODO Auto-generated method stub
	return username;
    }

    @Override
    public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
    }

    @Override
    public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
    }

    @Override
    public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
    }
   
}
