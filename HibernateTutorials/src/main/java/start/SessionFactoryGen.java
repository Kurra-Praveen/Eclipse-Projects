package start;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactoryGen {
	
	public Session session;
	//public Transaction transaction;
	public SessionFactory sessionFactory;

	public SessionFactoryGen() {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
	 sessionFactory=cfg.buildSessionFactory();
		
	    session=  sessionFactory.openSession();
	    

	}
}
