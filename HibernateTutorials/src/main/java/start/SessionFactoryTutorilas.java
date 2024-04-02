package start;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SessionFactoryTutorilas {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		System.out.println(sessionFactory);
		
		
		
		
		Student st=new Student("Tarun", "Business", new StudentAddress("Valluru", "Tuni", 533401));
		
	   Session	 session=  sessionFactory.openSession();
	   
	    Transaction tx=  session.beginTransaction();
	   
	   session.save(st);
	   
	  // List<Book> bookList = session.createNativeQuery("Select * from book", Book.class).getResultList();
	   
	    List<Student>student=  session.createQuery(" from student_database",Student.class).list();
	    
	  student.forEach(x->System.out.println(x));
	   
	   tx.commit();
	   
	   session.close();
	   

	}
	
}
