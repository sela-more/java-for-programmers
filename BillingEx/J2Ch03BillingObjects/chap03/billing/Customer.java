package chap03.billing;


public class Customer {
	String m_cuName;
	int m_cuCurrentBill;

	
	public void init(String cuName, int cuBill) {
		m_cuName=cuName;
		m_cuCurrentBill=cuBill;
	}
	
	public String getName() {
		return m_cuName;
	}
	
	public int getCurrentBill() {
		return m_cuCurrentBill;
	}
	
}
