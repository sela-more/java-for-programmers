package chap06.billing;

import chap06.exceptions.NoAssociateException;

public abstract class BillingEntity {

	protected String m_name;
	/**
	 * A customer reference indicating the customer, this customer is
	 * an associate of (if any).
	 */
	protected Customer m_customer;

	public BillingEntity(String name) {
		m_name = name;
	}

	@Override
	public String toString() {
		return m_name;
	}
	
	public void addToCustomerBill(int sumToAdd) {
		if (null == m_customer)
			throw new NoAssociateException(this);
		m_customer.addToBill(sumToAdd);
	}

	public int getCustomerCurrentBill() {
		if (null == m_customer)
			throw new NoAssociateException(this);
		return m_customer.getCurrentBill();
	}

	public String getName() {
		return m_name;
	}

	void setCustomer(Customer c) {
		m_customer = c;
	}

}
