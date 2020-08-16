package com.dao;

import com.db.HibernateTemplate;
import com.dto.User;

public class userDAO {
	
	public int register(User user) {		
		return HibernateTemplate.addObject(user);
	}

	public User getUserById(String userEmail) {
		User user = new User();
		user = (User) HibernateTemplate.getObject(User.class, userEmail);
		return user;
	}
	

}
