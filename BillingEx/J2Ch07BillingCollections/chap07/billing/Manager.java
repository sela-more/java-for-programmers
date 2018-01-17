package chap07.billing;

public class Manager implements IPresent {

	private String m_name;
	
	public Manager(String name) {
		m_name = name;
	}
	
	public void sendPresent(String present) {
		System.out.println("Manager- Received a present: " + present);
	}
}
