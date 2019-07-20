package com.lzz.web.interceptor;

import org.hibernate.Session;

import com.lzz.utils.HibernateUtils;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TransactionInterceptor implements Interceptor{

	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void init() {
		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		Session s=HibernateUtils.openSession();
		s.beginTransaction();
		try {
			invocation.invoke();
			s.getTransaction().commit();
		} catch (Exception e) {
			s.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			s.close();
		}
		return null;
	}

}
