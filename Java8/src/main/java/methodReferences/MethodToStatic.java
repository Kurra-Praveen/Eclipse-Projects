package methodReferences;


import java.util.function.Function;

public class MethodToStatic {
	@FunctionalInterface
	interface Message{
		
		void print(String msg,int i);
	}

	public static void main(String[] args) {
		
		//using lambda expression
		
		Function<Integer, Double> lambdaFuntion= (a)->Math.sqrt(a);
		
		System.out.println(lambdaFuntion.apply(4));
		
		
		//using method references
		
		Function<Integer, Double> methodReferene=Math::sqrt;
		
		System.out.println(methodReferene.apply(6));
		
		Message message=System.out::printf;
		
		message.print("Hello world",1);
		
		
		
		
		
	
	}
}
