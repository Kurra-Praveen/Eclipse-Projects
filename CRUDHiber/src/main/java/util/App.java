package util;

import java.util.List;

import dao.StudentDao;
import model.Student;

public class App {

	public static void main(String[] args) {
		
		StudentDao sd=new StudentDao();
		
		Student s1=new Student("Praveen", "Kurra", "123@gmail.com");
		
		Student s2=new Student("Tarun", "Kurra", "345@gmail.com");
		
		sd.saveStudent(s1);
		
		sd.saveStudent(s2);
		
		Student s3=sd.getStudentById(s1.getId());
		
		s1.setFirstName("Pavan");
		
		sd.updateStudent(s1);
		
		List<Student> students=sd.getAllStudents();
		
		students.forEach(student->System.out.println(student));
		
		sd.deleteStudent(s1.getId());
		
	}

}
