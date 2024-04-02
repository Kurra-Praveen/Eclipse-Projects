package lambdaFunctions;


class Test implements Runnable{

	@Override
	public void run() {
		
		System.out.println("running");
	}
	
}

public class RunnableLambdaExp {

	public static void main(String[] args) {
		
		Test test=new Test();
		
		test.run();
		
		Runnable runnable=()->{
			
			
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
	}
	
}
