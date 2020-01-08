package com.springBootWithDao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootWithDao.dao.UserRepository;
import com.springBootWithDao.model.User;

@RestController
public class userController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/getbyid/{userId}")
	public User getUserbyId(@PathVariable int userId) {

		return userRepository.findByUserId(userId);

	}

}
