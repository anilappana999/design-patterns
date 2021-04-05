package statepattern;

public class Accounting implements Connection {

	@Override
	public void open() {
	System.out.println("welcome to accounts sec");
		
	}

	@Override
	public void close() {
	System.out.println("you are closing acc sec");
		
	}

}
