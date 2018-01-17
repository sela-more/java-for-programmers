package chap04.billing;

public class Manager implements IPresent {

	private String m_name;
	
	public Manager(String name) {
		m_name = name;
	}
	
	public void receivedPresent(String present) {
		System.out.println("Manager " + m_name + 
				" - Received a present: " + present);
	}
	
}
