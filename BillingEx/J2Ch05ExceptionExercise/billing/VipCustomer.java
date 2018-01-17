package billing;

public class VipCustomer extends Customer {

	public VipCustomer(String cuName, int cuBill) {
		super(cuName, cuBill);
	}
	
	public VipCustomer(String cuName) {
		this(cuName,0);
	}
		
	
public void addToBill(int amount) throws ChangeBillCustomerException{
		
		if (amount < 10000) throw new ChangeBillCustomerException(this, amount);
		m_cuCurrentBill+=amount*0.8;
	}
	
	public String toString() {
		return "VIP- " + super.toString();
	}
}
