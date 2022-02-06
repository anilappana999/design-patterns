package strategy;

public class Context {

	private PaymentStrategy strategy;

	public Context(PaymentStrategy strategy) {
	
		this.strategy = strategy;
	}
	
	public void paymentMode() {
		strategy.payment();
	}
}


