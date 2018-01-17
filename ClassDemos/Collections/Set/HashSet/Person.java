package Set.HashSet;
class Person
{
	private String m_sName;

	Person(String sName)
	{
		m_sName = sName;
	}

/*
	// first round: do not override equals and hashCode and
	// see that the set will allow multiple objects, as it does not
	// know that different objects with same name are same

	public boolean equals(Object o)
	{
		System.out.println("In Equals");
		if (!(o instanceof Person))
			return false;
		return m_sName.equals(((Person)o).m_sName);
	}

	public int hashCode()
	{
		System.out.println("In Person's Hashcode");
		return m_sName.hashCode();
	}
*/
	public String toString()
	{
		return m_sName;
	}
};