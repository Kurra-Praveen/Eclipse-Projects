package javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Practise {

	public static void main(String[] args) {
		
		
		
		
	
		List<String>list=new ArrayList<>(Arrays.asList("abc$sj","gdf","gdf","we%e","abcs","wee"));
		
		List<String> collect = list.stream()
		.map(x->x.replaceAll("[^A-z]", "")).collect(Collectors.toList());
		Map<String, Integer>output=new HashMap<>();
		
		for(String s:collect) {
			int count=0;
			for(String y:collect) {
				if(s.equals(y))
					count++;
			}
			output.put(s, count);
		}
		System.out.println(output);
	}
}
