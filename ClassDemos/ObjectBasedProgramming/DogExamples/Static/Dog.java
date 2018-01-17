package Static;

public class Dog {

	
	static int m_dogCount = 0;
	
	// demonstrating static block
//	static int m_dogCount;
//	static {
//		m_dogCount = 0;
//		System.out.println("Class dog was loaded");
//	
//	}
	String m_name;
	Dog(String name){
	  m_name = name;
	  Dog.m_dogCount +=1;
	}
	static void printDogCount() {
		System.out.println(m_dogCount);
	}
	  


}
