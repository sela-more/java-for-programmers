package BasicInheritance;
public class Test {
	
	public void testFunc(Parent p){
		
		p.overrideMe();
		
		
		
	}

	public static void main (String args[]) {
		Child c1 = new Child();
		//c1.chhildfunc();
		//c1.setPrivate(5); // can access parent method
		
		Parent p1 = new Parent();
		
		Test t1 = new Test();
		t1.testFunc(p1);
		t1.testFunc(c1);
		
	}
}
