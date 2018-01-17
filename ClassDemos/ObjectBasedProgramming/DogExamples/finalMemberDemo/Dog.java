package finalMemberDemo;

public class Dog {

	
	static int m_dogCount = 0;
	final int m_id;
	//final int m_id = 5;
	String m_name;
	
	Dog(String name){
	  m_name = name;
	  Dog.m_dogCount +=1;
	  m_id = m_dogCount;
	}
	static void printDogCount() {
		System.out.println(m_dogCount);
		
	}
	  


}
