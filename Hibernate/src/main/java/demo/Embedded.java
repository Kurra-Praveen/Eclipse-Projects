package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedded {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		
		Student s1=new Student();
		
		s1.setId(1232);
		
		s1.setName("Name");
		
		s1.setCity("Tuni");
		
		s1.setCerti(new Certificate("Hibernate", "2 months"));
		
		Student s2=new Student();
		
		s2.setId(1232);
		
		s2.setName("Name");
		
		s2.setCity("Tuni");
		
		s2.setCerti(new Certificate("Hibernate", "2 months"));
		
		Session session=factory.openSession();
	
		
		Transaction tx=session.beginTransaction();
		
		session.save(s1);
		
		//session.save(s2);
		
		tx.commit();
		
		//factory.close();
		
		session.close();
		
		factory.close();
	}
	


}
