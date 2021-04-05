package statepattern;

public class Controller {

	public static Sales sale;
	public static Accounting acc;
	
	private static Connection con;
	
	Controller(){
		acc = new Accounting();
		sale = new Sales();
	}
	
	public void SetAccounting() {
		con = acc;
	}
	
	public void SetSales() {
		con = sale;
	}
	
	public void open() {
		con.open();
	}
	
	public void close() {
		con.close();
	}
}
