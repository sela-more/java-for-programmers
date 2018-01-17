package billing;


public class CustomerException extends Exception {
	Customer m_relatedCustomer;
	
	public CustomerException (Customer c) {
		super("Customer already exists. Action aborted");
		m_relatedCustomer=c;
	}
	
	
	public String getCustomerMessage() {
		return m_relatedCustomer.getName();
	}
}
