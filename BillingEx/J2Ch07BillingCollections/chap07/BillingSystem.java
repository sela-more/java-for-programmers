package chap07;
import chap07.billing.*;

public class BillingSystem {
	public static void main(String []args) {
		
		System.out.println("Welcome to our billing system");
		CustomersContainer cc = new CustomersContainer();
		
		int j=0;
		cc.addCustomer(new RegCustomer("George"));
		cc.addCustomer(new RegCustomer("Jerry", 10));
		cc.addCustomer(new RegCustomer("Frank", 40));
		cc.addCustomer(new RegCustomer("Elaine", 10));
		cc.addCustomer(new VipCustomer("Cosmo", 20));
		cc.addCustomer(new RegCustomer("George",30));
		
		cc.printCustomers();
	}
	
}
