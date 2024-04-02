package demo1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainFocus {

	public static void main(String[] args) {
	       Scanner sc= new Scanner(System.in); //System.in is a standard input stream   
	        String str= sc.nextLine();
	        boolean found3;
	        if(str.length()>=8){
	            Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	            Matcher m = p.matcher(str);
	            boolean res = m.find();
	            if (res){
	                boolean found=false;
	                char[] chars = str.toCharArray();
	                for(char c : chars){
	                    if(Character.isDigit(c)){
	                        found=true;
	                        break;
	                    }
	                }
	                if(found){
	                    boolean found1=false;
	                    char[] chars1 = str.toCharArray();
	                    for(char c1 : chars1){
	                        if(Character.isUpperCase(c1)){
	                            found1=true;
	                            break;
	                        }
	                    }
	                    if(found1){
	                        boolean found2=false;
	                        char[] chars2 = str.toCharArray();
	                        for(char c2 : chars2){
	                            if(Character.isLowerCase(c2)){
	                                found2=true;
	                                break;
	                            }
	                        }
	                        if(found2){
	                            if(str.substring(str.length() - 1).equals("$")){
	                               found3=true;
	                             
	                            }
	                            else {
									found3=false;
								}
	                            if(found3){
	                                System.out.println("Your Password is Strong");
	                            }
	                            if (!found3){
	                                System.out.println("Your Password is not Strong");
	                            }
	                            
	                        }
	                    }
	                }
	            }
	       }   
	
	 
	}
	}
