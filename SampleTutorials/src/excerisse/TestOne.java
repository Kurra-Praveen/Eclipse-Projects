package excerisse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.angelbroking.smartapi.SmartConnect;
import com.angelbroking.smartapi.http.SessionExpiryHook;
import com.angelbroking.smartapi.models.TokenSet;
import com.angelbroking.smartapi.models.User;

public class TestOne {

	public static void main(String[] args) {

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
		
		Map<String, List<Integer>> extractData = extractData(logs4);
		
		System.out.println(extractData);
		
	}
	
	static Map<String, List<Integer>>extractData(String [][] logs){
		
		Map<String, List<Integer>>output=new HashMap<>();
		
		for(String []arr:logs) {
			String user=arr[1];
			int timings=Integer.parseInt(arr[0]);
			
			if(!output.containsKey(user)) {
				output.put(user, new ArrayList<Integer>(Arrays.asList(Integer.MAX_VALUE,Integer.MIN_VALUE)));
			}
			List<Integer> eachUserLog = output.get(user);
			eachUserLog.set(0, Math.min(timings, eachUserLog.get(0)));
			eachUserLog.set(1, Math.max(timings, eachUserLog.get(1)));
		}
		
		return output;
	}
}
