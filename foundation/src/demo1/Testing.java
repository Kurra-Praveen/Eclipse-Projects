package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class Testing {

	public static void main(String[] args) {
		
		ArrayList<Emp> emp=new ArrayList<>();
		
		emp.add(new Emp("pravee","qa",21,15));
		
		emp.add(new Emp("Gagan","Qa",23,30));
	
		Emp f=emp.get(0);
	
	     int length=emp.get(0).length;
	     
	     System.out.println(length);
	    
		
		
	}
}
