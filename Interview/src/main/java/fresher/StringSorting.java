package fresher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting {

	public static void main(String[] args) {
		   List<String> stringList = new ArrayList<>();
	        stringList.add("apple");
	        stringList.add("banana");
	        stringList.add("grape");
	        stringList.add("cherry");
	        
	        //Collections.sort(stringList);
	        
	        System.out.println(stringList);
	        long currentTimeMillis = System.currentTimeMillis();
	        Collections.sort(stringList);
	        for(int i=0;i<stringList.size();i++) {
	        	for(int j=i+1;j<stringList.size();j++) {
	        		if(stringList.get(i).compareTo(stringList.get(j))>0) {
	        			String temp=stringList.get(i);
	        			stringList.set(i, stringList.get(j));
	        			stringList.set(j, temp);
	        			
	        		}
	        	}
	        }
	        System.out.println(stringList);
	        System.out.println(System.currentTimeMillis()-currentTimeMillis);
	}
}
