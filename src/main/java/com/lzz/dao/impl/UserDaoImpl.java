package com.lzz.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.lzz.dao.IUserDao;
import com.lzz.domani.User;
import com.lzz.utils.HibernateUtils;

public class UserDaoImpl implements IUserDao {

	@Override
	public void save(User user) {
		Session s = HibernateUtils.openSession();
		s.save(user);
	}

	@Override
	public void delete(Integer id) {
		Session s = HibernateUtils.openSession();
		User user=s.get(User.class, id);
		s.delete(user);
	}

	@Override
	public void update(User user) {
		Session s = HibernateUtils.openSession();
		s.update(user);

	}

	@Override
	public User find(Integer id) {
		Session s = HibernateUtils.openSession();
		String hql="FROM User WHERE id=?1";
		Query q = s.createQuery(hql);
		q.setParameter(1, id);
		User user=(User) q.uniqueResult();
		return user;
	}

	@Override
	public List<User> find() {
		Session s = HibernateUtils.openSession();
		String hql="FROM User";
		Query q = s.createQuery(hql);
		List<User> list = q.list();
		return list;
	}


}
