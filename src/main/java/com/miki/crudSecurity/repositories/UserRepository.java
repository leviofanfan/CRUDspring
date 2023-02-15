package com.miki.crudSecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.miki.crudSecurity.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("""
			SELECT u FROM User u WHERE u.username = :username
			""")
	Optional<User> findUserByUsername(String username);
}
