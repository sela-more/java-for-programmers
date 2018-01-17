/* Example of the usage of static block. Also demonstrates: creating a single class
   	object via the static block, and holding a reference to it via 
	a static variable
*/
class StaticBlock
{
	static StaticBlock Instance;	// Static member
		
	static {			// static block, done once
		Instance = new StaticBlock();
	}
	private StaticBlock() {
		// will learn later about static ctor
	}
	
	
	
	static StaticBlock getInstance()	// static method
	{
		return Instance;
	}

	void m1()
	{
		System.out.println("In m1");
		
	}

	void m2()
	{
		System.out.println("In m2");
	}

	public static void main(String args[])
	{
		StaticBlock.Instance.m1();				
		StaticBlock.getInstance().m2();

	}

};