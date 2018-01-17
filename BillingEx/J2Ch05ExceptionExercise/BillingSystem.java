import billing.*;

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
			
			Customer c1 = new RegCustomer("Daniel");
			c1.addToBill(2000);
			c1.addToBill(90);
		} 
		catch (AddCustomerException e) {
			System.out.println(e + " (Customer:" + e.getCustomerMessage() + ")");
		} catch (ChangeBillCustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cc.printCustomers();
	}
	
}
