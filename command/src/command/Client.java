package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		Command lightsOn = new LightsOn(light);
		control.setCommand(lightsOn);
		control.pressButton();
		

	}

}
