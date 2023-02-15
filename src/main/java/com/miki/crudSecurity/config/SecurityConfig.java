package com.miki.crudSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
public class SecurityConfig {

	/*
	 * private final UserRepository userRepository;
	 * 
	 * @Bean public UserDetailsService userDetailsService() { return new
	 * JpaUserDetailsService(userRepository); }
	 */
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
