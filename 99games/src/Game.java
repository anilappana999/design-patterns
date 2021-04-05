
public abstract class Game {

	
	abstract void start();
	abstract void end();
	
	public void play() {
		start();
		end();
	}
}
