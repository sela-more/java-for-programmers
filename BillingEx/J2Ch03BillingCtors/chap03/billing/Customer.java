package chap03.billing;


public class Customer {
	private String m_cuName;
	private int m_cuCurrentBill;
	private static int m_counter;
	
	public Customer(String cuName, int cuBill) {
		m_cuName=cuName;
		m_cuCurrentBill=cuBill;
		m_counter++;
	}
	
	public Customer(String cuName) {
		this(cuName,0);
	}
	
	public static int getCounter() {
		return m_counter;
	}
	
	
	public String getName() {
		return m_cuName;
	}
	
	public int getCurrentBill() {
		return m_cuCurrentBill;
	}

}
