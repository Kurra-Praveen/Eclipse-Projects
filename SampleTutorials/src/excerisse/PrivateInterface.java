package excerisse;

public interface PrivateInterface {

	private static String staticPrivate() {
		int i =10;
		
		return "static private"+i;
	}

	private String instancePrivate() {
		return "instance private";
	}

	public default void check() {
		String result = staticPrivate();
		if (!result.equals("static private"))
			throw new AssertionError("Incorrect result for static private interface method");
		PrivateInterface pvt = new PrivateInterface() {
		};
		
		System.out.println(result);
		result = pvt.instancePrivate();
		if (!result.equals("instance private"))
			throw new AssertionError("Incorrect result for instance private interface method");
		
		System.out.println(result);
	}
}
