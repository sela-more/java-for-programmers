import billing.*;
import java.io.*;

public class BillingSystem {
	public static void main(String []args) {
		
		System.out.println("Welcome to our billing system");
		CustomersContainer cc = new CustomersContainer();
		
		int j=0;
		try {
			cc.addCustomer(new RegCustomer("George"));
			cc.addCustomer(new RegCustomer("Jerry", 10));
			cc.addCustomer(new RegCustomer("Frank", 40));
			cc.addCustomer(new RegCustomer("Elaine", 10));
			cc.addCustomer(new VipCustomer("Cosmo", 20));
			cc.addCustomer(new RegCustomer("George",30));
		} 
		catch (CustomerException e) {
			System.out.println(e + " (Customer:" + e.getCustomerMessage() + ")");
		}
		
		try {
			File newFile = new File("customers.txt");
			cc.saveCustomers(newFile);
			//cc.readCustomers(newFile);
			cc.printCustomers();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
}
