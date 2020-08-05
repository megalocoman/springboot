package com.example.demo.autorizacion;

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

    //autentica a los usuarios segun informacion base de datop
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.userDetailsService(userDetailsService);

    }

    //autoriza la vista segun autoridad indicada en base de datos
    @Override
    protected void configure(HttpSecurity http) throws Exception {

	http.authorizeRequests()
	// indica que autorizacion tendran las vistas indicandas, dependiendo del rol
	// del usuario

		.antMatchers("/paginaingresoprofesional", "/ingprofesional", "/consultaprofesional",
			"/actualizarprofesional/**", "/eliminarprofesional/**", "/actprofesional")
		.hasAuthority("administracion")
		.antMatchers("/paginaingresocliente", "/ingrcliente", "/consultacliente", "/eliminarcliente/**",
			"/actualizarcliente/**").hasAuthority("profesional")
		// personaliza pagina de login, y donde entra despues de validar usuario
		.and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/ingresosistema", true)
		//pagina acceso denegado personalizado
		.and().exceptionHandling().accessDeniedPage("/403")
		// logout personalizado
		.and().logout().invalidateHttpSession(true).clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/logout-success")
		.permitAll()
		;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
    }

}
