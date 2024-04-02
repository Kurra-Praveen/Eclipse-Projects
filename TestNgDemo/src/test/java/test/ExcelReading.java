package test;


import java.util.Calendar;
import java.util.Scanner;

public class ExcelReading {
	
public static void main(String[] args) {
	
	 Calendar rightNow = Calendar.getInstance();
	rightNow.set(2022,12,30);
	
	int day=rightNow.get(Calendar.DAY_OF_WEEK);
	System.out.println(rightNow.getTime());
}

    }