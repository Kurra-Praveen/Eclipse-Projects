package excerisse;

import java.util.HashSet;
import java.util.Set;

public class FindDublicates {

	public static void main(String[] args) {
		
		String s="Welcome To Praveen";
		
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					System.out.println(s.charAt(i));
				}
				
				
			}
			
		}
		
		
		
	}
}
