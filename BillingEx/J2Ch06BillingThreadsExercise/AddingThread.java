import billing.*;

public class AddingThread extends Thread {
		CustomersContainer m_container;
	
		public AddingThread (CustomersContainer cc) {
			m_container=cc;
			System.out.println("AddingThread created...");
		}
		
		public void run() {
			for (int i=0; i<50; i++) {
				try {
					sleep(1400);
					m_container.addCustomer(new RegCustomer("cust" + i, i*10));	
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}
				catch (CustomerException e) {
					System.out.println(e + " (Customer:" + e.getCustomerMessage() + ")");
				}					
			}	
		}

}
