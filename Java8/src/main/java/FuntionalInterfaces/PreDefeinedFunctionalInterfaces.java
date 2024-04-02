package FuntionalInterfaces;


import java.awt.print.Printable;
import java.util.function.Consumer;
import java.util.function.Function;

public class PreDefeinedFunctionalInterfaces  implements Function<Student, Student>{

	@Override
	public Student apply(Student t) {
		
		return null;
	}

	public static void main(String[] args) {
		

		Function< Student, Student> function=(t)->{
			
			Student ramesh = new Student();
			
			ramesh.setAge(t.getAge());
			
			ramesh.setName(t.getName());

			ramesh.setStream(t.getStream());
			
			return ramesh;
		};
		
		System.out.println(function.apply(new Student())) ;
	

	Consumer<Student> consumer=(t)->{		
		//code to update the data in the database
		System.out.println(t.toString());
	};
	
	consumer.accept(new Student());
	
	}
	
}
