package methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;


import FuntionalInterfaces.Student;

public class Test {

	public static void main(String[] args) {
		
		String [] array= {"a","b","c"};
		
	   Arrays.sort(array, String::compareToIgnoreCase);
	   
	   for(String x:array) {
		   
		   System.out.println(x);
	   }
	   
	   List<Integer> lis=new ArrayList<>();
	   
	   Function<List<Integer>, Set<Integer>> setTuype=(list)->new HashSet<>(list);
	   
	   Student s=new Student();
	   
	   s.setStream("comp");

	   
	   Optional<String>a=Optional.ofNullable(s.getStream());
	   
	   System.out.println(a.isPresent());
	   
	   List<Integer>f=new ArrayList<>();
	   
	 
	  
	
	
	}
}
