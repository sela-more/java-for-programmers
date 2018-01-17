package billing;


public class AddCustomerException extends Exception {
	Customer m_relatedCustomer;
	
	public AddCustomerException (Customer c) {
		super("Unable to add Customer. Action aborted");
		m_relatedCustomer=c;
	}
	
	
	public String getCustomerMessage() {
		return m_relatedCustomer.getName();
	}
}
