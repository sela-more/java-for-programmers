package chap05.billing;

import java.util.Collection;
import java.util.LinkedList;

public abstract class Customer extends BillingEntity {
	protected int m_cuCurrentBill;
	private static int m_counter;
	protected Collection<BillingEntity> associates;

	public void addAssociate(BillingEntity be) {
		// having the list constructed here may serve well, if most-
		// customer accounts have no associates.
		if (null == associates) {
			associates = new LinkedList<BillingEntity>();
		}
		associates.add(be);
		be.setCustomer(this);
	}
	
	public Collection<BillingEntity> getAssociates() {
		return associates;
	}
	
	public Customer(String cuName, int cuBill) {
		super(cuName);
		m_cuCurrentBill=cuBill;
		m_counter++;
	}
	
	public Customer(String cuName) {
		this(cuName,0);
	}
	
	public Customer() {
		this("unknown",0);
	}
	
	public abstract void addToBill(int amount);
	
	public static int getCounter() {
		return m_counter;
	}
	
	
	public int getCurrentBill() {
		return m_cuCurrentBill;
	}
	
	public String toString() {
		return "Name: " + m_name + ", Current Bill:" + m_cuCurrentBill;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Customer))
				return false;
		
		Customer second = (Customer)obj;
		return this.m_name.equals(second.m_name);
	}
	
	@Override
	public int hashCode() {
		return m_name.hashCode();
	}
}
