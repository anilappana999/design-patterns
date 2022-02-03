package mediator;

public class RemoteImpl implements Remote, Invoker {

private Remote remote;

	
	public void initialize(Remote remote) {
		this.remote = remote;

	}

	@Override
	public void on() {
		remote.on();

	}

	@Override
	public void off() {
		remote.off();

	}

	
}
