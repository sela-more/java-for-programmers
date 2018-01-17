package chap06.exceptions;

import chap06.billing.Customer;


public class DuplicateCustomerException extends Exception {
	Customer m_relatedCustomer;
	
	public DuplicateCustomerException (Customer c) {
		super("Customer already exists. Action aborted");
		m_relatedCustomer=c;
	}
	
	
	public String getCustomerMessage() {
		return m_relatedCustomer.getName();
	}
}