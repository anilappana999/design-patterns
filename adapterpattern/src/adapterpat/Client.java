package adapterpat;

public class Client {

public static void main(String[] args) {
	CreditCard target = new BankCustomer();
	
	target.giveBankDetails();
	System.out.println(target.getCreditCard());
}
}
