package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecuriryConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    UserDetailsService userDetailsService;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.userDetailsService(userDetailsService);
	
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	
	http.authorizeRequests()
//	.antMatchers("/ingresosistema").hasAnyAuthority("administracion", "profesional") 
		.antMatchers("/admin").hasAuthority("administracion")   
		.antMatchers("/prof").hasAuthority("profesional")
		.antMatchers("/sinautorizado").hasAnyAuthority("administracion", "profesional")   
		.and().formLogin()
		.loginPage("/login").permitAll()
//		.defaultSuccessUrl("/")
		.defaultSuccessUrl("/ingresosistema", true)
		;
		
    }
    
    @Bean
    public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
    }

}