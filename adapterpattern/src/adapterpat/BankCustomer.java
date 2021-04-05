package adapterpat;

import java.util.Scanner;

public class BankCustomer  extends BankDetails implements CreditCard{

	@Override
	public void giveBankDetails() {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter the account hold name");
	String customername= s.nextLine();
	System.out.println("enter account number");
	long accNum = s.nextLong();
	System.out.println("enter bank name");
	String bankname = s.next();
	setAccHolderName(customername);
	setAccNo(accNum);
	setBankName(bankname);
	}

	@Override
	public String getCreditCard() {
		long accno = getAccNo();
		String accholdername = getAccHolderName();
		String bname = getBankName();
		
		return ("acc no  "+accno+" of "+accholdername+" is "+" sactioned creditcard for "+bname);
	}

}
