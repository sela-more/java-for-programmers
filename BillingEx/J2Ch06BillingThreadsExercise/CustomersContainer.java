import java.util.*;
import billing.*;

public class CustomersContainer {
	private TreeSet customers = new TreeSet(new CustomerByNameComp());
	
	public void addCustomer(Customer c) throws CustomerException {
		boolean addResult;
		synchronized(this) {
			addResult=customers.add(c);
		}
		if (!addResult) {
			throw new CustomerException(c);
		}
		else {
			System.out.println("Customer added: " + c);
		}
	}
	
	public synchronized void printCustomers() {
		Iterator itr = customers.iterator();
		Customer temp;
		int counter=0;
		
		while (itr.hasNext()) {
			temp=(Customer)itr.next();
			System.out.println(counter++ + ") " + temp);
		}
	}
	
	public boolean removeCustomer(Customer c) {
		boolean removeResult;
		synchronized(this) {
			removeResult = customers.remove(c);
		}
		return removeResult;
	}
}
