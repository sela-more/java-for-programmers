package chap04.billing;

public abstract class Customer {
	protected String m_cuName;
	protected int m_cuCurrentBill;
	private static int m_counter;
	
	public Customer(String cuName, int cuBill) {
		m_cuName=cuName;
		m_cuCurrentBill=cuBill;
		m_counter++;
	}
	
	public Customer(String cuName) {
		this(cuName,0);
	}
	
	// was not requested
	public Customer() {
		this("unknown",0);
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
	
	public abstract void addToBill(int amount);
	
	public String toString() {
		return "Name: " + m_cuName + ", Current Bill:" + m_cuCurrentBill;
	}
	
	// was not requested
	public boolean equals(Object obj) {
		if (!(obj instanceof Customer))
				return false;
		
		Customer second = (Customer)obj;
		return this.m_cuName.equals(second.m_cuName);
	}
}
