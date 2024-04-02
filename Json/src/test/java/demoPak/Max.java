package demoPak;

import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;

import static  io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Max {

	public static void main(String[] args) throws Exception {
		
		//URL url = new URL("https://restcountries.com/v3.1/name/peru");
		
		String url="https://restcountries.com/v3.1/name/peru";
		
		//String con=RestAssured.get(url).asPrettyString();
		
		String x=given().get(url).asPrettyString();
		
		JSONArray ja=new JSONArray(x);
		
		
		 
		
		System.out.println(ja);
		
		
	}
}
