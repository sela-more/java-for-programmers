package Set.TreeSet.Comperable;
class PersonTSComperable implements Comparable<PersonTSComperable>
{
	private final String m_sName;

	PersonTSComperable(String sName)
	{
		m_sName = sName;
	}

	public int compareTo(PersonTSComperable other)
	{
		System.out.println("On CompareTo");
		PersonTSComperable p = (PersonTSComperable)other; //Can throw an exception if other is not Person
		return m_sName.compareTo(p.m_sName);
	}

	public boolean equals(Object o)
	{
		System.out.println("In Equals");
		if (!(o instanceof PersonTSComperable))
			return false;
		return m_sName.equals(((PersonTSComperable)o).m_sName);
	}

	public int hashCode()
	{
		System.out.println("In Person's Hashcode");
		return m_sName.hashCode();
	}

	public String toString()
	{
		return m_sName;
	}
};