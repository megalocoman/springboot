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
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecuriryConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.userDetailsService(userDetailsService);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

	http.authorizeRequests()
		// indica que autorizacion tendran las vistas indicandas, dependiendo del rol
		// del usuario
		.antMatchers("/admin").hasAuthority("administracion").antMatchers("/prof").hasAuthority("profesional")
		.antMatchers("/sinautorizado").hasAnyAuthority("administracion", "profesional")
		// personaliza pagina de login, y donde entra despues de validar usuario
		.and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/ingresosistema", true)
		// login personalizado
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/logout-success").permitAll();
			
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
    }

}
