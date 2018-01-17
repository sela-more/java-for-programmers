package chap03;
import chap03.billing.*;

public class BillingSystem {
	public static void main(String []args) {
		
		System.out.println("Welcome to our billing system");
		Customer allCustomers[] = new Customer[3];
	
		int j=0;
		allCustomers[j++] = new Customer("George");
		allCustomers[j++] = new Customer("Jerry", 10);
		allCustomers[j++] = new Customer("Cosmo", 20);
		
		for (int i=0; i<allCustomers.length; i++)
			System.out.println(i + ")" + 
					allCustomers[i].getName() + ", Bill: " + 
					allCustomers[i].getCurrentBill());

		System.out.println("Total number of customers: " + Customer.getCounter() );	
	}
	
}
