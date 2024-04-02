package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {
	interface employee {
		int employeeNo();

		String name();

	}

	public ArrayList<Object> foo() {
		ArrayList<Object> arrayx = new ArrayList<>();
		employee e = new employee() {

			@Override
			public int employeeNo() {

				return 10;
			}

			@Override
			public String name() {
				// TODO Auto-generated method stub
				return "Praveen";
			}
		};
		int x = e.employeeNo();
		String y = e.name();
		arrayx.add(x);
		arrayx.add(y);
		return arrayx;
	}
	public static void main(String[] args) {
	Demo d=new Demo();
	          ArrayList f=   d.foo();
	          Iterator<Integer> iter = f.iterator();
	          while(iter.hasNext()) {
	        	  System.out.println(iter.next());
	          }
	           
	}

}
