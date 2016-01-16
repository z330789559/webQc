package com.weibao.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;;



public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	static{
		 Configuration configuration=
			         new Configuration().configure("/hibernate.cfg.xml");
		 sessionFactory=configuration.buildSessionFactory();
		
	}
	public static SessionFactory getsSessionFactory(){
		 
		return sessionFactory;
		
	}
	
	public static final ThreadLocal<Session>session=new ThreadLocal<Session>();	
	
	
	public static Session currentSession()throws HibernateException{
		
		Session s=session.get();
		if(s==null){
			s=sessionFactory.openSession();
			session.set(s);
		}

		return s;
		
	}
	
	public static void close(Session session){
		
		if(session!=null){
			session.clear();
		}
	}

}
