package javaeight;

public class Employee {

	private String name;
	private String state;
	private int age;
	private boolean isactive;
	
	

	public Employee() {
	}

	public Employee(String name, String state, int age, boolean isactive) {
		this.name = name;
		this.state = state;
		this.age = age;
		this.isactive = isactive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", state=" + state + ", age=" + age + ", isactive=" + isactive + "]";
	}

}
