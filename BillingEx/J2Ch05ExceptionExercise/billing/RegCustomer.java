package billing;

public class RegCustomer extends Customer {

	public RegCustomer(String cuName, int cuBill) {
		super(cuName, cuBill);
	}
	
	public RegCustomer(String cuName) {
		this(cuName,0);
	}
	
	
	public void addToBill(int amount) throws ChangeBillCustomerException{
		
		if (amount < 1000) throw new ChangeBillCustomerException(this, amount);
		
		m_cuCurrentBill+=amount;
	}
}
