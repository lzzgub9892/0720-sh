package com.lzz.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sf;
	static {
		Configuration cf=new Configuration();
		cf.configure();
		sf = cf.buildSessionFactory();
	}
	public static Session openSession() {
		return sf.getCurrentSession();
	}
}
