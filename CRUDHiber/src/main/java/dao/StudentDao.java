package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;
import util.HibernateUtil;

public class StudentDao {

	public void saveStudent(Student student) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			session.persist(student);
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			
			if (transaction != null) {
				
				transaction.rollback();
			}
		}

	}
	
	public void updateStudent(Student student) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			session.merge(student);
			
			transaction.commit();
			
			session.close();
			
		} catch (Exception e) {
			
			if (transaction != null) {
				
				transaction.rollback();
			}
		}	

	}
	
	public Student getStudentById(long id) {

		Transaction transaction = null;
		
		Student student=null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			student=session.get(Student.class, id);
			
			transaction.commit();
			
		} catch (Exception e) {
			
			
			if (transaction != null) {
				
				transaction.rollback();
			}
		}
		return student;
	}
	
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Student> getAllStudents() {

		Transaction transaction = null;
		
		List<Student> student=null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			student=session.createQuery("From Student").list();
			
			transaction.commit();
			
			session.close();
			
		} catch (Exception e) {
			
			
			if (transaction != null) {
				
				transaction.rollback();
			}
		}
		return student;
	}
	

	public void deleteStudent(long id) {

		Transaction transaction = null;
		
		Student student=null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			student=session.get(Student.class, id);
			
			session.remove(student);
			
			transaction.commit();
			
			session.close();
			
		} catch (Exception e) {
			
			
			if (transaction != null) {
				
				transaction.rollback();
			}
		}
		
	}
	
	
	
}
