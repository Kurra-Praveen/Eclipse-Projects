package javaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		
		List<Employee>allEmployees=new ArrayList<>();
		
		allEmployees.add(new Employee("Praveen", "AP", 23, true));
		
		allEmployees.add(new Employee("Tarun", "AP", 20, true));
		
		allEmployees.add(new Employee("Bharath", "Ts", 30, true));
		
		allEmployees.add(new Employee("Koushik", "TS", 27, true));
		
		allEmployees.add(new Employee("Koustav", "KOL", 25, true));
		
		allEmployees.add(new Employee("Tarun", "AP", 25, false));
		
		  OptionalInt max = allEmployees.stream().mapToInt(x->x.getAge()).max();
		
		List<String> collect = allEmployees.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	}
}
