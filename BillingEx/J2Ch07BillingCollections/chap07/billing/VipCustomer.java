package chap07.billing;

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
	
	public void sendPresent(String present) {
		System.out.println("VIP- Received a present: " + present);
	}
}
