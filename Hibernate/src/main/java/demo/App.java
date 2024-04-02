package demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		System.out.println("App Started...");
		
		Configuration cfg=new Configuration();	
		
		cfg.configure("hibernate.cfg.xml");	
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student st=new Student(107,"Prasad","Annavaram");
		
		Address address=new Address();
		
		address.setStreet("New colony");
		
		address.setCity("Tuni");
		
		address.setOpen(true);
		
		address.setAddedDate(new Date());
		
		address.setX(1234.234);
		
		System.out.println(st);
		
	    Session	session = factory.openSession();
	    
	   Transaction tx= session.beginTransaction();
	   //session.save(tx);
	   
	   session.persist(st);//alternate for save
	   
	    
	    tx.commit();
	    
	    session.close();
		
		
	}
}
