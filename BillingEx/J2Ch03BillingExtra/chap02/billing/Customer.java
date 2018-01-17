package chap02.billing;


public class Customer {
	private String m_cuName;
	private int m_cuCurrentBill;
	private static int m_counter;
	
	private Associate[] associates;
	private final static int MAX_ASSOCIATES = 3;
	private int actualNumOfAssociates = 0;
	
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
	
	public void addToBill(int sumToAdd) {
		m_cuCurrentBill += sumToAdd;
	}
	
	public int withdraw(int sumToWithdraw) {
		if (sumToWithdraw <= m_cuCurrentBill) {
			m_cuCurrentBill -= sumToWithdraw;
			return sumToWithdraw;
		}
		return 0;		
	}
		
	/**
	 * Method adds an associate to the customer's account
	 * @param associateName - the name of associate to add
	 * @return - the Associate object just added or null, indicating
	 * no addition occured.
	 */
	public Associate addAssociate(String associateName) {
		// Array is allocated here to save heap space for those -
		// accounts with no associates, which may be most accounts.
		if (null == associates) {
			associates = new Associate[MAX_ASSOCIATES];
		}
		if (actualNumOfAssociates < MAX_ASSOCIATES) {
			Associate associate = new Associate(associateName);
			associates[actualNumOfAssociates++] = associate;
			return associate;
		}
		return null;
	}
	
	/**
	 * Method obtains an Associate object by name
	 * @param associateName - the name of the associate to retrieve
	 * @return an Associate object if found, null otherwise.
	 */ 
	public Associate getAssociate(String associateName) {
		for (int i = 0; i < associates.length; i++) {
			if (associates[i].name.equals(associateName)) {
				return associates[i];
			}
		}
		return null;
	}

	/**
	 * 
	 * Associate impl as an inner class
	 *
	 */
	public class Associate {
		
		private String name;
		
		private Associate(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public int getCurrentBill() {
			return Customer.this.m_cuCurrentBill;
		}
		
		public void addToBill(int sumToAdd) {
			Customer.this.addToBill(sumToAdd);
		}
	}
	
}
