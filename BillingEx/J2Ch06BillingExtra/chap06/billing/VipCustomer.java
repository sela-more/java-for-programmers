package chap06.billing;

import chap06.exceptions.AssociateRegistryException;

public class VipCustomer extends Customer implements IPresent {

	public VipCustomer(String cuName, int cuBill) {
		super(cuName, cuBill);
	}
	
	public VipCustomer(String cuName) {
		this(cuName,0);
	}
		
	
	public void addToBill(int amount) {
		m_cuCurrentBill+=amount*0.8;
	}
	
	public String toString() {
		return "VIP- " + super.toString();
	}
	
	public void receivedPresent(String present) {
		System.out.println("VIP " + m_name + 
				" - Received a present: " + present);
	}
	
	@Override
	public void addAssociate(BillingEntity be) {
		if (be instanceof RegCustomer)
			throw new AssociateRegistryException((RegCustomer) be);
		super.addAssociate(be);
	}
}
