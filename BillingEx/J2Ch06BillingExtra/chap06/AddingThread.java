package chap06;

import chap06.billing.Associate;
import chap06.billing.RegCustomer;
import chap06.exceptions.DuplicateCustomerException;

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
				RegCustomer c = new RegCustomer("cust" + i, i*10);
				m_container.addCustomer(c);
				// every once in a while appending customer with associates
				if (i % 3 == 0) {
					for (int j = 0; j < 3; j++) {
						c.addAssociate(new Associate("assoc" + (j+1)));
					}					
				}
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			} catch (DuplicateCustomerException e) {
				System.out.println(e + " (Customer:" + 
						e.getCustomerMessage() + ")");
			}					
		}	
	}

}

