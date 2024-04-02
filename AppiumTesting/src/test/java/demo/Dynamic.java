package demo;

import java.util.Base64;

import utility.ConfigData;

public class Dynamic {

	public static void main(String[] args) {
		
	String output="Process[pid=14116, exitValue=\"not exited\"]";
	int start=output.indexOf("pid=");
	int stop=output.indexOf(",");
    String pd= output.substring(start, stop);
    System.out.println(pd.substring(pd.indexOf("=")+1));
		

	}
}
