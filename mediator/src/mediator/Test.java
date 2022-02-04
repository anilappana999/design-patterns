package mediator;

public class Test {

	public static void main(String[] args) {
		RemoteImpl remote = new RemoteImpl();
		remote.initialize(new Fan());
		remote.on();
		remote.off();
		remote  = new RemoteImpl();
		remote.initialize(new AirConditioner());
		remote.on();
		remote.off();
		

	}
}




