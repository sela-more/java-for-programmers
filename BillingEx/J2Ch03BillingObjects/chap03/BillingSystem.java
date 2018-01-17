package chap03;
import chap03.billing.*;

public class BillingSystem {
	public static void main(String []args) {

		System.out.println("Welcome to our billing system");
		Customer allCustomers[] = new Customer[3];
		for (int i=0; i<allCustomers.length; i++)
			allCustomers[i] = new Customer();

		int j=0;
		allCustomers[j++].init("George",0);
		allCustomers[j++].init("Jerry",10);
		allCustomers[j++].init("Cosmo",20);

		for (int i=0; i<allCustomers.length; i++)
			System.out.println(i + ")" + 
					allCustomers[i].getName() + ", Bill: " + 
					allCustomers[i].getCurrentBill());

	}

}
