package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory=buildSessionFactory();
	private static SessionFactory buildSessionFactory(){
		try{
			//����hibernate.cfg.xml����SessionFactory
			return new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) {
			// TODO: handle exception
			System.err.println("Initial SessionFactory creation failed."+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
