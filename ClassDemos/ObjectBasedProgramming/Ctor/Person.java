class Person
{
	String m_sName;
	int m_nAge;
	Person(String sName) 
	{
		m_sName = sName;
		m_nAge =200;
	}

	Person(String sName, int nAge)
	{
		
		m_sName = sName;
		m_nAge = nAge;
	}

	void print()
	{
		System.out.println(m_sName + " Age = " + m_nAge);
	}

	public static void main(String args[])
	{
		new Person("Shaul", 23).print();
			
	}
};