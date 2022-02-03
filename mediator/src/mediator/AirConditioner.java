package mediator;

public class AirConditioner implements Remote {

	@Override
	public void on() {
	System.out.println("switched on air conditioner");

	}

	@Override
	public void off() {
		System.out.println("switched off air conditioner");

	}
	
}
