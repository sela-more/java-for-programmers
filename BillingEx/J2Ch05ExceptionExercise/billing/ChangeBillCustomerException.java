package billing;

public class ChangeBillCustomerException extends Exception {
	
	Customer m_relatedCustomer;
	double m_amount;
	public ChangeBillCustomerException(Customer c, double amount){
		super("Unable to add amount to Bill, Customer: " + c + " Amount: "+ amount);
		m_relatedCustomer=c;
		m_amount = amount;
	}
	public Customer getCustomer() {
		return m_relatedCustomer;
	}
	public double getDefaultedAmound() {
		return m_amount;
	}
}
