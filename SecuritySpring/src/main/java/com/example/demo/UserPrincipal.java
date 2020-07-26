package com.example.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {

    private Seguridad seguridad;

    public UserPrincipal(Seguridad seguridad) {
	this.seguridad = seguridad;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	
	return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
	
	return seguridad.getClave();
    }

    @Override
    public String getUsername() {
	
	return seguridad.getUsuario();
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
