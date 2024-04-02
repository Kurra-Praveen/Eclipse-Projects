package FuntionalInterfaces;

@FunctionalInterface
public interface MyFuntionalInterface {

	int getResult();
	
	static int myResult(int a , int b) {
		return a+b;
	}
	
	default int myMethosa(int a, int b) {
		return a*b;
	}
	
	
	
}

