package statepattern;

public class DesignPatternDemo {

static Controller con;
	static  void statePatternDemo(String name){
	con = new Controller();
	if(name.equals("sale")) {
		con.SetSales();
	}
	
	if(name.equals("acc")) {
		con.SetAccounting();
	}
	con.open();
	con.close();
	}
	public static void main(String[] args) {
	
		statePatternDemo("acc");	

	}

}


