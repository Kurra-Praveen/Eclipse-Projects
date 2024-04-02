package lambdaFunctions;

interface Shape {
	
	void result(int a, int b);
}


public class LambdaImpl {

	  public static void main(String[] args) {
		
		  Shape rectangle=(int a, int b)->{
		  
		  int c=a+10;
		  
		  int d=b+10;
		  
		  System.out.println("the result is"+c+d);
		  
		  };
		  
		dsplay(rectangle);
					  
	}  
	  
	  private static void dsplay(Shape shape) {	
		  
		  shape.result(10, 20);
	  }
}
