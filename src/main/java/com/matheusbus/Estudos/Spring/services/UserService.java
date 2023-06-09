package com.matheusbus.Estudos.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusbus.Estudos.Spring.entities.User;
import com.matheusbus.Estudos.Spring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
	
}
