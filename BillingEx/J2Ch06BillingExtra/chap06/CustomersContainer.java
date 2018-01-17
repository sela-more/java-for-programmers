package chap06;

import java.util.*;

import chap06.billing.BillingEntity;
import chap06.billing.Customer;
import chap06.billing.CustomerByNameComp;
import chap06.exceptions.DuplicateCustomerException;

public class CustomersContainer {
	TreeSet<Customer> customers = 
		new TreeSet<Customer>(new CustomerByNameComp());
	
	public void addCustomer(Customer c) throws DuplicateCustomerException {
		boolean result;
		synchronized(this) {
			result=customers.add(c);
		}
		if (!result) {
			throw new DuplicateCustomerException(c);
		}
		else {
			System.out.println("Customer added: " + c);
		}
	}		
	
	public void printCustomers() {
		Iterator<Customer> itr = customers.iterator();
		Customer temp;
		int counter=0;
		
		while (itr.hasNext()) {
			temp=(Customer)itr.next();
			System.out.println(counter++ + ") " + temp);
			Collection<BillingEntity> associates = temp.getAssociates();
			Iterator<BillingEntity> associatesItr = associates.iterator();
			int associatesCounter=0;
			while(associatesItr.hasNext()) {
				System.out.println("\t" + associatesCounter++ + ") " +
						associatesItr.next());;
			}			
		}
	}
	
	public boolean removeCustomer(Customer c) {
		boolean result;
		synchronized(this) {
			result = customers.remove(c);
		}
		return result;
	}
}

