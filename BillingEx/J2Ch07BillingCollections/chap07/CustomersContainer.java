package chap07;
import java.util.*;

import chap07.billing.*;

public class CustomersContainer {
	TreeSet<Customer> customers = 
		new TreeSet<Customer>(new CustomerByNameComp());
	
	public boolean addCustomer(Customer c) {
		if (!customers.add(c)) {
			System.out.println("Customer already exists (" + c.getName() + "). Action aborted");
			return false;
		}
		else {
			System.out.println("Customer added: " + c);
			return true;
		}
	}
	
	public void printCustomers() {
		Iterator<Customer> itr = customers.iterator();
		Customer temp;
		int counter=0;
		
		while (itr.hasNext()) {
			temp=(Customer)itr.next();
			System.out.println(counter++ + ") " + temp);
		}
	}
}
