package excerisse;

import java.io.*;
import java.util.*;


public class Solution {
  

  
  
  public static void main(String[] argv) {
    
    String[][] logs1 = {
      {"200", "user_1", "resource_5"},
      {"3", "user_1", "resource_1"},
      {"620", "user_1", "resource_1"},
      {"620", "user_3", "resource_1"},
      {"34", "user_6", "resource_2"},
      {"95", "user_9", "resource_1"},
      {"416", "user_6", "resource_1"},
      {"58523", "user_3", "resource_1"},
      {"53760", "user_3", "resource_3"},
      {"58522", "user_22", "resource_1"},
      {"100", "user_3", "resource_6"},
      {"400", "user_6", "resource_2"},
    };

    String[][] logs2 = {
      {"357", "user", "resource_2"},
      {"1262", "user", "resource_1"},
      {"1462", "user", "resource_2"},
      {"1060", "user", "resource_1"},
      {"756", "user", "resource_3"},
      {"1090", "user", "resource_3"},
    };

    String[][] logs3 = {
      {"300", "user_10", "resource_5"},
    };

    String[][] logs4 = {
      {"1", "user_96", "resource_5"},
      {"1", "user_10", "resource_5"},
      {"301", "user_11", "resource_5"},
      {"301", "user_12", "resource_5"},
      {"603", "user_12", "resource_5"},
      {"1603", "user_12", "resource_7"},
    };

    String[][] logs5 = {
      {"300", "user_1", "resource_3"},
      {"599", "user_1", "resource_3"},
      {"900", "user_1", "resource_3"},
      {"1199", "user_1", "resource_3"},
      {"1200", "user_1", "resource_3"},
      {"1201", "user_1", "resource_3"},
      {"1202", "user_1", "resource_3"},
    };
    
    
    
    
   Map<String,ArrayList<Integer>>data= extractData(logs1);
   
 data.forEach((k,v)->System.out.println(v));
    
  }
  
  
  public static Map<String,ArrayList<Integer>> extractData(String [][] logs){
	  
	  List<Logs>extractedData=new ArrayList<>();
	  
	  for(String []arr: logs) {
		   Logs log=new Logs();
		   log.setResource(arr[1]);
		   log.setTime(Integer.parseInt(arr[0]));
		   extractedData.add(log);
	  }
	  
	  Map<String, ArrayList<Integer>>output=new HashMap<>();
	  
	  for(Logs log:extractedData) {
		  String resource = log.getResource();
		  if(output.containsKey(resource)) {
			  ArrayList<Integer> list = output.get(resource);
			  int time = log.getTime();
			  if(time<list.get(0)) { list.set(0, time);}
			  else {list.set(1, time);}
		  }
		  else output.put(resource, new ArrayList<Integer>(Arrays.asList(log.getTime())));
	  }
	  
	  return output;
    
  }

}
