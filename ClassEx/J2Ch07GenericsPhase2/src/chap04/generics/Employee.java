package chap04.generics;

public class Employee {

	private String m_name;
	private String m_position;
	private int m_seniority;  // number of years
	private int m_id; // employee id (used as a key in map)
	private static int m_numerator = 0; // for id generation
	
	public Employee(String name, String position, 
			int seniority) {
		this(name, position, seniority, 
				++ Employee.m_numerator);		
	}
	
	/**
	 * Enabling to manually insert an id
	 * @param name
	 * @param position
	 * @param seniority
	 * @param id
	 */
	public Employee(String name, String position, 
			int seniority, int id) {
		this.m_name = name;
		this.m_position = position;
		this.m_seniority = seniority;
		this.m_id = id;
	}

	public String getName() {
		return m_name;
	}

	public String getPosition() {
		return m_position;
	}

	public int getSeniority() {
		return m_seniority;
	}

	public int getId() {
		return m_id;
	}
	
	@Override
	public String toString() {
		String str = m_position + " " + m_name + 
			", " + m_seniority + " years.";
		return str;
	}
		
	public void printEmployee() {
		System.out.println(this);
	}

}
