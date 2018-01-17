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
		} 
		catch (CustomerException e) {
			System.out.println(e + " (Customer:" + e.getCustomerMessage() + ")");
		}
		
		try {
			BillingServer bs = new BillingServer(cc,5100);
			bs.communicate();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
}
