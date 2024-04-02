package FuntionalInterfaces;

public class Student {

	private String name;
	
	private int age;
	
	private String stream;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", stream=" + stream + "]";
	}

	



	
	
	
}
