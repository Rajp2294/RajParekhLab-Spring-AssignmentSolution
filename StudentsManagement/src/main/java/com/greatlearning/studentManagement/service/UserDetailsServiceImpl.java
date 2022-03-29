package com.greatlearning.studentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.studentManagement.entity.User;
import com.greatlearning.studentManagement.repository.UserRepository;
import com.greatlearning.studentManagement.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	// Returns a object of User Details which is understood by spring as spring doesn't understand the username 
	// user is supplied by authentication provider by loading username 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);

		if (user == null)
			throw new UsernameNotFoundException("User with the given username does not exists!");
		return new MyUserDetails(user);
	}

}
