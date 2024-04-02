package demo1;

public class Emp {
	private	String name;
	private	String desig;
	private	int age;
	private	int sal;
	
	final int length=4;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(String name, String desig, int age, int sal) {
		super();
		this.name = name;
		this.desig = desig;
		this.age = age;
		this.sal = sal;
	}
	

}
