package mappings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestManyToManyMappings {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		System.out.println(sessionFactory);

		Session session1 = sessionFactory.openSession();
		
		
		Employee e1=new Employee();
		
		Employee e2=new Employee();
		
		e1.setId(31);
		e1.setEmployee("Praveen");
		
		
		e1.setId(36);
		e1.setEmployee("Tarun");
		
		
		Project p1=new Project();
		
		Project p2=new Project();
		
		p1.setPid(11);
		p1.setProjectName("Addidas");
		
		
		p2.setPid(21);
		p2.setProjectName("Nike");
		
		List<Employee> list1=new ArrayList<>();
		List<Project> list2=new ArrayList<>();
		
		
		list1.add(e1);
		list1.add(e2);
		
		
		list2.add(p2);
		list2.add(p1);
		
		e1.setProjects(list2);
		p1.setEmployees(list1);
		
		
		Transaction tx=session1.beginTransaction();
		
		session1.save(e1);
		session1.save(e2);
		session1.save(p1);
		session1.save(p2);
		
		tx.commit();
		
		session1.close();
		sessionFactory.close();
	}
}
