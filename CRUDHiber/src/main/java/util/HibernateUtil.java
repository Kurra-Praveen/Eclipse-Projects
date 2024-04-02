package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		sessionFactory=cfg.buildSessionFactory();
		
		return sessionFactory;
		
	}

}
