package singleton;

public class Single {

	private static Single instance = new Single();
	
	private Single() {}

	public static Single  getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("hey it is a singleton class");
	}
	
}
