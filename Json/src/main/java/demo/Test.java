package demo;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test {

	public  Object getKey(JSONObject jsonObj, String key) {

		boolean exist = jsonObj.has(key);
		
		Iterator<?> keys;
		
		String nextKeys;
		
		if (!exist) {
			
			keys = jsonObj.keys();
			
			while (keys.hasNext()) {
				
				nextKeys = (String) keys.next();
				
				try {
					
					if (jsonObj.get(nextKeys) instanceof JSONObject) {
						
						return getKey(jsonObj.getJSONObject(nextKeys), key);
						
					} else if (jsonObj.get(nextKeys) instanceof JSONArray) {
						
						JSONArray jarray=jsonObj.getJSONArray(nextKeys);
						
						for(int i=0;i<jarray.length();) {
							
							String jarrayString=jarray.get(i).toString();
							
							JSONObject inputJsonObj=new JSONObject(jarrayString);
							 
							return getKey(inputJsonObj, key);
						}

					}

				} catch (Exception e) {
					
				}
			}

		} else {
			return jsonObj.get(key);
		}
		return jsonObj.get(key);
		
	}


}
