package com.miki.crudSecurity.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.miki.crudSecurity.repositories.UserRepository;
import com.miki.crudSecurity.security.SecurityUser;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

	
	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		var u = userRepository.findUserByUsername(username);
		
		return u.map(SecurityUser :: new)
				.orElseThrow(() -> new UsernameNotFoundException("Username not found" + username));
	}

}
