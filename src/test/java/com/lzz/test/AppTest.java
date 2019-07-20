package com.lzz.test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.Test;

import com.lzz.dao.IUserDao;
import com.lzz.dao.impl.UserDaoImpl;
import com.lzz.domani.User;
import com.lzz.utils.HibernateUtils;

public class AppTest {
	@Test
	public void testSave() throws Exception {
		User u=new User();
		u.setName("aaa");
		IUserDao dao=new UserDaoImpl();
		Session s = HibernateUtils.openSession();
		s.beginTransaction();
		dao.save(u);
		s.getTransaction().commit();
		s.close();
	}

}
