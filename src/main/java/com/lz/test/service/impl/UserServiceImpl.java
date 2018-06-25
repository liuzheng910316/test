package com.lz.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lz.test.dao.impl.UserDaoImpl;
import com.lz.test.model.User;

@Service("userService")
public class UserServiceImpl {

	@Autowired
	UserDaoImpl userDao;
	@Transactional
	public void addUser(User user){
		userDao.addUser(user);
	}
	
	public User getUserById(int id){
		return userDao.getUserById(id);
	}
}
