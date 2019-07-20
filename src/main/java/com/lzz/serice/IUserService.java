package com.lzz.serice;

import java.util.List;

import com.lzz.domani.User;

public interface IUserService {
	void save(User user);
	void delete(Integer id);
	void update(User user);
	User find(Integer id);
	List<User> find();
}
