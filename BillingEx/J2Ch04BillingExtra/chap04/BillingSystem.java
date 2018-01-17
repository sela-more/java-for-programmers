package chap04;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import chap04.billing.*;

public class BillingSystem {
	public static void main(String []args) {

		System.out.println("Welcome to our billing system");
		Customer george = new RegCustomer("George");
		Customer jerry = new RegCustomer("Jerry", 10);
		Customer cosmo = new VipCustomer("Cosmo", 20);
		
		Associate yaron = new Associate("Yaron");
		Associate jackie = new Associate("Jackie");
		
		System.out.println(
				BillingSystem.appendAssociate(yaron, george));
		BillingSystem.addCustomer(george);
		System.out.println(
				BillingSystem.appendAssociate(jackie, george));
		BillingSystem.addCustomer(jerry);
		BillingSystem.addCustomer(cosmo);
		
		Collection<Associate> georgeAssociates = 
			BillingSystem.getAssociates(george);
		
		for (Associate associate : georgeAssociates) {
			System.out.println(associate);
		}
		
		

	}

	public static Set<Customer> getCustomers() {
		return m_caMap.keySet();
	}
	
	public static Collection<Associate> getAssociates(Customer c) {
		return m_caMap.get(c);
	}

	public static void addCustomer(Customer c) {
		m_caMap.put(c, new LinkedList<Associate>());
	}
	
	/**
	 * Appends an associate to a given customer
	 * @param a - the associate to append
	 * @param c - the customer to append the associate to
	 * @return true if associate appended, false otherwise
	 */
	public static boolean appendAssociate(Associate a, Customer c) {
		Collection<Associate> collToAppendTo = m_caMap.get(c);
		if (null == collToAppendTo)
			return false;
		collToAppendTo.add(a);
		// Also set the associate with a reference to its customer
		a.setCustomer(c);
		return true;
	}

	private static Map<Customer, Collection<Associate>> m_caMap
		= new HashMap<Customer, Collection<Associate>>();


}	
