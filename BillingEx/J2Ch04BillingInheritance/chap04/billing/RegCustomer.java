package chap04.billing;

public class RegCustomer extends Customer {

	public RegCustomer(String cuName, int cuBill) {
		super(cuName, cuBill);
	}
	
	public RegCustomer(String cuName) {
		this(cuName,0); // probably better than super(cuName)
	}
	
	
	public void addToBill(int amount) {
		m_cuCurrentBill+=amount;
	}
}
