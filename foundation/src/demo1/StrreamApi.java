package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StrreamApi {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2, 3, 5, 2, 6,1,2);
		
		int f=nums.stream()
		.filter(n->n%2!=0)
		.sorted()
		.map(n->n*2) 
		.reduce(0,(c,e)->(c+e));
		
		
		
		System.out.println(f);
	}

}
