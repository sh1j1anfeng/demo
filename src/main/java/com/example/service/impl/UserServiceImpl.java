package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.model.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userDao;

	@Override
	public User findUser(String name) {
		return userDao.findUser(name);
	}

}
