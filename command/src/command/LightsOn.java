package command;

public class LightsOn implements Command {

	Light light;
	
	public LightsOn(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
		
	}

}
