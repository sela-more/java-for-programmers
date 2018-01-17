package Set.TreeSet.Comperator;
class PersonTSComperator 
{
	private String m_sName;
	private int m_age;
	public String getName() {return m_sName;}
	public int getAge() {return m_age;}
	PersonTSComperator(String sName, int age)
	{
		m_sName = sName;
		m_age = age;
	}

	
	public boolean equals(Object o)
	{
		System.out.println("In Equals");
		if (!(o instanceof PersonTSComperator))
			return false;
		return m_sName.equals(((PersonTSComperator)o).m_sName)&& (this.m_age == ((PersonTSComperator)o).m_age);
	}

	public int hashCode()
	{
		System.out.println("In Person's Hashcode");
		return m_sName.hashCode()*3 + m_age*7;
	}

	public String toString()
	{
		return m_sName;
	}
};