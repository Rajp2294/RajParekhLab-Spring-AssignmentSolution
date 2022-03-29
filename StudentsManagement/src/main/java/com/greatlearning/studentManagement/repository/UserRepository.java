package com.greatlearning.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// To check whether user is present in the database
	public User findByUsername(String username);

}
