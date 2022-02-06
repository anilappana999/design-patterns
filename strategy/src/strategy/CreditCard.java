package strategy;

public class CreditCard implements PaymentStrategy {

	@Override
	public void payment() {
		System.out.println("payment mode is credit-card");
		
	}

}
