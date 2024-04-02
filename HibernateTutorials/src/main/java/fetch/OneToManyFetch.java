package fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mappings.AnswerOneToMany;
import mappings.QuestionOneToMany;

public class OneToManyFetch {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		System.out.println(sessionFactory);

		Session session1 = sessionFactory.openSession();
		
		QuestionOneToMany data=  session1.get(QuestionOneToMany.class, 1);
		
		
		for(AnswerOneToMany i:data.getAnswer()) {
			System.out.println(i.getAnswer());
		}
		
		session1.close();
		sessionFactory.close();
	}
}
