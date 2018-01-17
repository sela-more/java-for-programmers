class Outer1
{
	int x;

	Outer1()
	{
		System.out.println("In Outer1 CTor");
	}

	class Inner1
	{
		int x;
		Inner1()
		{
			Outer1.this.x = 6;
			System.out.println("In Inner1 CTor");
		}
	};

	void m()
	{
		System.out.println("In M");
		new Inner1();
		System.out.println("x = " +x);
	}

	public static void main(String args[])
	{
		new Outer1().m();
	}
};