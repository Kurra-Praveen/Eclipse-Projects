package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

public class Demo {
	public static void main(String[] args)  {
		
		Test t1=new Test();
		
		Http http=new Http();
		
		String x=http.getData();
		
		JSONObject obj=new JSONObject(x);
		
		System.out.println(t1.getKey(obj,"capital"));
		
		
	}

}
