package strategy;

public class DebitCard implements PaymentStrategy {

	@Override
	public void payment() {
		System.out.println("payment mode is debit-card");
		
	}

}
