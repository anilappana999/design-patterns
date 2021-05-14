package command;

public class LightsOff implements Command {

	Light light;
	
	public LightsOff(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.switchOFF();
	}

}
