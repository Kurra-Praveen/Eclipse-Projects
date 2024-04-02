package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mappings.AnswerOneToOne;
import mappings.QuestionOneToOne;


public class OneToOneMappingsTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		System.out.println(sessionFactory);

		Session session1 = sessionFactory.openSession();


		AnswerOneToOne ans = new AnswerOneToOne( "Java is programming lang");

		QuestionOneToOne q1 = new QuestionOneToOne("What is Java", ans);
		
	    session1.beginTransaction();

		session1.save(q1);

		session1.getTransaction().commit();

		session1.close();

	}
}
