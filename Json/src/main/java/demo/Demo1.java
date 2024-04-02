package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://localhost:8080/students");
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		
		InputStreamReader isr = new InputStreamReader(con.getInputStream());
		
		BufferedReader br = new BufferedReader(isr);
		
		String f=br.readLine();
		
		System.out.println(f);
		

    
	}

	
}
