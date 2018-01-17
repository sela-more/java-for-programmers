package thisExample;

public class Dog {

	
	String m_name;
	Dog(String name){
	    m_name = name;
	}

	
	String getName() {
		return m_name;
	}
	
	void print(){
	    DogPrinter dp = new DogPrinter();
	    dp.print(this);
	}



}
