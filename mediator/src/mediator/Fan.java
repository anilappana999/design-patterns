package mediator;

public class Fan implements Remote {


	@Override
	public void on() {
		System.out.println("fan switched on");

	}

	@Override
	public void off() {
		System.out.println("fan switched off");

	}
	
}
