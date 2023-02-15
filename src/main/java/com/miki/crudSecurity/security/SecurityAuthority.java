package com.miki.crudSecurity.security;

import org.springframework.security.core.GrantedAuthority;

import com.miki.crudSecurity.entities.Authority;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority{

	private final Authority authority;
	
	@Override
	public String getAuthority() {
		return authority.getName();
	}

}
