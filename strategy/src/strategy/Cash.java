package strategy;

public class Cash implements PaymentStrategy {

	@Override
	public void payment() {
		System.out.println("payment mode is cash");
		
	}

}


