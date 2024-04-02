package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Http {

	public String getData() {
		try {
			URL url = new URL("https://restcountries.com/v3.1/name/peru");
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			
			BufferedReader br = new BufferedReader(isr);
			
			String f=br.readLine();
			
			return f.substring(1, f.length()-1);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
 

}
