import java.util.*;
import billing.*;

public class CustomersContainer {
	//TreeSet customers = new TreeSet(new CustomerByNameComp());
	
	private Customer[] customers = new Customer[10] ;
	private int m_numCustomers = 0;
	
	public void addCustomer(Customer c) throws AddCustomerException {
		//if (!customers.add(c)) {
		
		if (m_numCustomers >= customers.length ) {
			throw new AddCustomerException(c);
		}
		else {
			customers[m_numCustomers++] = c;
			System.out.println("Customer added: " + c);
		}
	}
	
	public void printCustomers() {
//		Iterator itr = customers.iterator();
//		Customer temp;
//		int counter=0;
//		
//		while (itr.hasNext()) {
//			temp=(Customer)itr.next();
//		
//			System.out.println(counter++ + ") " + temp);
//		}
		
		for (int i=0; i < m_numCustomers; i++)
			System.out.println(i+ ")" + customers[i]);
	}
}
