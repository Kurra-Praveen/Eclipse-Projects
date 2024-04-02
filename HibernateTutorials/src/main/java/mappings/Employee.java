package mappings;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int id;
	
	private String employee;
	
	@ManyToMany
	@JoinTable(
			      	name="emp_projects" ,
			      	joinColumns = {@JoinColumn(name="id")},
			      	inverseJoinColumns = {@JoinColumn(name="pid")}
			)
	private List<Project>projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int id, String employee, List<Project> projects) {
		this.id = id;
		this.employee = employee;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
