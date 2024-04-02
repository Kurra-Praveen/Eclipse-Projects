package test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mappings.AnswerOneToMany;
import mappings.AnswerOneToOne;
import mappings.QuestionOneToMany;


public class OneToManyMappingsTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		System.out.println(sessionFactory);

		Session session1 = sessionFactory.openSession();

		//QuestionOneToOne question = new QuestionOneToOne("What is java",
				//new AnswerOneToOne("Java is a programming lang"));
		
		QuestionOneToMany question=new QuestionOneToMany();
		
		question.setQuestinon("What is python");
		
		AnswerOneToMany answer=new AnswerOneToMany("python is a programming lang",question);
		
		AnswerOneToMany answer1=new AnswerOneToMany("python is used for Data Analysis",question);
		
		AnswerOneToMany answer2=new AnswerOneToMany("python is also suitable for AI & ML",question);
		
		List<AnswerOneToMany> answerList=Arrays.asList(answer,answer2,answer1);
		
		question.setAnswer(answerList);
		
		session1.save(question);

		session1.beginTransaction();
		
		  QuestionOneToMany q= session1.get(QuestionOneToMany.class, 1);
		  
		  System.out.println(q.getQuestinon());
		  
		  for(AnswerOneToMany ans:q.getAnswer()) {
			  
			  System.out.println(ans.getAnswer());
		  }

		
		AnswerOneToMany ans=session1.get(AnswerOneToMany.class, 1);
		
		System.out.println(ans.getAnswer());
		
		System.out.println(ans.getQuestion().getQuestionId());
		
		session1.getTransaction().commit();

		session1.close();

	}
}
