package chap04;

import chap04.billing.Customer;

public class Associate {

	private String m_name;
	private Customer m_customer;

	public Associate(String name) {
		m_name = name;
	}

	public String getName() {
		return m_name;
	}

	/**
	 * Retrieve current bill of customer of which this is an
	 * associate of.
	 * @return customer's current bill or -1 to indicate this
	 * associate has not been set with a customer yet.
	 * Note: returning -1 makes for poor programming. An exception
	 * may be a better choice, but this is yet to be covered.
	 */
	public int getCurrentBill() {
		return null == m_customer ? -1 : m_customer.getCurrentBill();
	}

	public void addToBill(int sumToAdd) {
		if (m_customer != null)
			m_customer.addToBill(sumToAdd);
	}
	
	public void setCustomer(Customer c) {
		m_customer = c;
	}

	@Override
	public String toString() {
		return m_name;
	}

	
}