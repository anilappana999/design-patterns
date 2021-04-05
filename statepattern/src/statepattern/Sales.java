package statepattern;

public class Sales implements Connection {

	@Override
	public void open() {
	System.out.println("welcome to sales section");
		
	}

	@Override
	public void close() {
	System.out.println("now you are closing sales section");
		
	}

}
