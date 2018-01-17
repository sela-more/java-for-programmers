package chap04;
import chap04.billing.*;

public class BillingSystem {
	public static void main(String []args) {
		
		System.out.println("Welcome to our billing system");
		Customer allCustomers[] = new Customer[3];
		
		int j=0;
		allCustomers[j++] = new RegCustomer("George");
		allCustomers[j++] = new RegCustomer("Jerry", 10);
		allCustomers[j++] = new VipCustomer("Cosmo", 20);
		
		for (Customer customer : allCustomers) {
			customer.addToBill(40);
		}
		
		for (int i=0; i<allCustomers.length; i++)
			System.out.println(i + ")" + 
					allCustomers[i]);
		
		System.out.println("Total number of customers: " + Customer.getCounter() );	

		IPresent[] preferred = new IPresent[3];
		j=0;
		preferred[j++] = new VipCustomer("Guy", 0);
		preferred[j++] = new VipCustomer("Danny", 50);
		preferred[j++] = new Manager("Hila");
		for (int i=0; i<preferred.length; i++)
			preferred[i].receivedPresent("Present " + i);
		}
	}	
