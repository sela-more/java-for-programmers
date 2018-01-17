class Sample
{
	static int statInt;
	int m_i = 0;
	void m1()
	{
		statInt = 2;	// can access static member
		int i = 3;	// local variable
		m_i = 5; 	// can access non static member
	}

	static void m2()
	{
		statInt = 3;	// can access static member
		Sample s = new Sample();
		// m1(); 	// non static method
		// m_i = 3;	// non static member
		s.m1();		// non static method operated on an ojbect
		int i = 3;
	}
};