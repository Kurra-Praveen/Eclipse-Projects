package lambdaFunctions;

interface Addition {
	
	String add(int a, String b);
	
}

public class LambdaParaImpl {
 
	public static void main(String[] args) {
		
		Addition addition= ( a, b)->{
			
			return a+b;
		};

		
	}
	

}
