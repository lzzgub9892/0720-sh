package com.lzz.serice.impl;

import java.util.List;

import com.lzz.dao.IUserDao;
import com.lzz.dao.impl.UserDaoImpl;
import com.lzz.domani.User;
import com.lzz.serice.IUserService;

public class UserServiceImpl implements IUserService {
	private IUserDao dao=new UserDaoImpl();
	
	public void save(User user) {
		dao.save(user);
	}

	public void delete(Integer id) {
		dao.delete(id);
	}

	public void update(User user) {
		dao.update(user);
	}

	public User find(Integer id) {
		return dao.find(id);
	}

	public List<User> find() {
		return dao.find();
	}

}
