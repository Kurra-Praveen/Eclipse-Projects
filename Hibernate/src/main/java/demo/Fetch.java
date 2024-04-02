package demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public int Annavaram = 0;

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		List<Student> list = session.createQuery("From Student", Student.class).list();

		list.forEach(x -> System.out.println(x));

		tx.commit();

//		Student std=  session.get(Student.class, 103);

//		  Address ad=session.get(Address.class, 1);
//		  
//		  System.out.println(std.getCity());
//		  
//		  System.out.println(ad.getAddressId());

		session.close();
		factory.close();

	}
}
