package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import start.Student;
import start.StudentAddress;

public class EmbededdTest {

public static void main(String[] args) {
	
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	
	System.out.println(sessionFactory);

	
	Student st=new Student("Tarun", "Business", new StudentAddress("Valluru", "Tuni", 533401));
	
   Session	 session=  sessionFactory.openSession();
   
    Transaction tx=  session.beginTransaction();
    
    
    session.save(st);
    
    tx.commit();
    
    session.close();
    
    sessionFactory.close();
}
}
