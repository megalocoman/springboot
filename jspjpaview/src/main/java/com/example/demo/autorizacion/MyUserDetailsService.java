package com.example.demo.autorizacion;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.example.demo.table.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

   
    @Autowired
    UserRepository userrepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	Optional<User> user = userrepository.findByUsername(username);

	user.orElseThrow(() -> new UsernameNotFoundException("no encontrado: "+ username) );
	
	return user.map(MyUserDetails::new).get();
    }

}
