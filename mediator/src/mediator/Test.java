package mediator;

public class Test {

	public static void main(String[] args) {
		RemoteImpl remote = new RemoteImpl();
		remote.initialize(new Fan());
		remote.on();
		remote.off();
		RemoteImpl remote1  = new RemoteImpl();
		remote1.initialize(new AirConditioner());
		remote1.on();
		remote1.off();
		

	}
}
