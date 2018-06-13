package com.lz.test.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lz.test.model.User;

@Repository("userDao")
public class UserDaoImpl {

	@Autowired
	SessionFactory sessionFactory;
	
	public void addUser(User user){
		Session session = sessionFactory.openSession();
		session.save(user);
		session.close();
	}
	
	public User getUserById(int id){
		Session session = sessionFactory.openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}
	
}
