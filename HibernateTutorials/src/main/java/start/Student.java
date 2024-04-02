package start;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "student_database")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String department;
	
	private StudentAddress studentAddress;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student( String name, String department, StudentAddress studentAddress) {
		this.name = name;
		this.department = department;
		this.studentAddress=studentAddress;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", studentAddress="
				+ studentAddress + "]";
	}

	public Student() {
		super();
	}
	
	
}
