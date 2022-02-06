package strategy;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter payment mode");
		String paymentMode = s.nextLine();
		if(paymentMode.equals("creditcard")) {
			Context context = new Context(new CreditCard());
			context.paymentMode();
		}
		else if(paymentMode.equals("debitcard")) {
			Context context = new Context(new DebitCard());	
			context.paymentMode();
		}
		else if(paymentMode.equals("cash")){
			Context context = new Context(new Cash());
			context.paymentMode();
		}
		s.close();
	}

}
